import React, {
	PropsWithChildren,
	useContext,
	useEffect,
	useState,
} from 'react';
import Keycloak from 'keycloak-js';

import AuthContext from '@models/security/authentication/auth-context.model';
import { apiKeycloak, apiRest } from '@configurations/axios.configuration';
import { KEYCLOAK_REDIRECT_URL } from '@configurations/keycloak-configuration';
import { PrivateComponentMode } from '@models/security/private-component.model';
import userService from '@services/rest/user.service';
import USER from '@configurations/user-types';
import { UserType } from '@models/users/user-type.enum.ts';
import AuthenticateUserAdminResponseDto from '@models/authenticate/authenticate-user-admin-response.dto.ts';
import AuthenticateResponseDto from '@models/authenticate/authenticate-response.dto.ts';

const Context = React.createContext({} as AuthContext);

export const useAuthentication = () => useContext(Context);

let authLoaded = false;

export function isAuthLoaded(): Promise<boolean> {
	return new Promise((resolve) => {
		const interval = setInterval(() => {
			if (authLoaded) {
				resolve(true);
				clearInterval(interval);
			}
		}, 300);
	});
}

interface AuthProviderProps {
	keycloak: Keycloak;
}

type Props = AuthProviderProps & PropsWithChildren;

export default function AuthProvider({ children, keycloak }: Props) {
	const [initialLoading, setInitialLoading] = useState(true);
	const [user, setUser] = useState<AuthenticateResponseDto>();

	useEffect(() => {
		keycloak.onTokenExpired = async (): Promise<void> => {
			try {
				await keycloak.updateToken(30);
				setTokens(keycloak.token);
			} catch (e) {
				console.error(e);
				await logout();
			}
		};

		keycloak.onAuthLogout = () => {
			setUser(undefined);
			setTokens(undefined);
		};
	}, [keycloak]);

	useEffect(() => {
		void (async () => {
			try {
				await keycloak.init({
					onLoad: 'check-sso',
					checkLoginIframe: false,
				});
				if (keycloak.authenticated) {
					setTokens(keycloak.token);
					const user = await userService.me();
					setUser(user);
				}
				authLoaded = true;
			} catch (e) {
				console.error(e);
			} finally {
				setInitialLoading(false);
			}
		})();
	}, []);

	function setTokens(token?: string) {
		if (token) {
			apiRest.defaults.headers['Authorization'] = `Bearer ${token}`;
			apiKeycloak.defaults.headers['Authorization'] = `Bearer ${token}`;
		} else {
			apiRest.defaults.headers['Authorization'] = ``;
			apiKeycloak.defaults.headers['Authorization'] = ``;
		}
	}

	async function login(): Promise<void> {
		if (!keycloak.authenticated) {
			try {
				await keycloak.login();
			} catch (e) {
				console.error(e);
			}
		}
	}

	async function logout(): Promise<void> {
		await keycloak.logout({
			redirectUri: KEYCLOAK_REDIRECT_URL,
		});
	}

	function isAdmin(): boolean {
		return user?.type === UserType.USUARIO_GESTAO;
	}

	function isClient(): boolean {
		return user?.type === UserType.USUARIO_GESTAO;
	}

	function hasRole(role: string, resource?: string): boolean {
		if (keycloak.hasResourceRole(role, resource)) return true;
		return !resource ? keycloak.hasRealmRole(role) : false;
	}

	function hasRoles(
		userType: USER[],
		roles: string[],
		mode?: PrivateComponentMode,
		resource?: string,
	): boolean {
		if (user && userType.includes(user.type)) {
			if (!roles.length) {
				return true;
			} else {
				switch (mode) {
					case PrivateComponentMode.ALL: {
						return hasAllRoles(roles, resource);
					}

					case PrivateComponentMode.NOT: {
						return !roles.some((role) => hasRole(role, resource));
					}

					case PrivateComponentMode.SOME:
					default: {
						return roles.some((role) => hasRole(role, resource));
					}
				}
			}
		} else {
			return false;
		}
	}

	function hasAllRoles(roles: string[], resource?: string): boolean {
		return roles.every((role) => hasRole(role, resource));
	}

	return (
		<Context.Provider
			value={{
				initialLoading,
				authenticated: Boolean(keycloak.authenticated),
				user: user ?? new AuthenticateUserAdminResponseDto(),
				login,
				logout,
				isAdmin,
				isClient,
				hasRole,
				hasRoles,
			}}
		>
			{children}
		</Context.Provider>
	);
}

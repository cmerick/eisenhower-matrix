import React, { PropsWithChildren, useContext, useState } from 'react';
import LayoutConfig from '@models/layout/layout-config.model.ts';
import LayoutState from '@models/layout/layout-state.model.ts';
import LayoutContext from '@models/layout/layout-context.model.ts';
import {
	DEFAULT_TITLE,
	THEME_LIGHT,
} from '@configurations/template-constants.ts';

const Context = React.createContext({} as LayoutContext);

export const useLayout = () => {
	return useContext(Context);
};

const LayoutProvider: React.FC<PropsWithChildren> = ({ children }) => {
	const [layoutConfig, setLayoutConfig] = useState<LayoutConfig>({
		ripple: true,
		inputStyle: 'outlined',
		menuMode: 'overlay',
		colorScheme: 'light',
		theme: THEME_LIGHT,
		scale: 12,
	});

	const [layoutState, setLayoutState] = useState<LayoutState>({
		title: DEFAULT_TITLE,
		staticMenuDesktopInactive: false,
		overlayMenuActive: false,
		profileSidebarVisible: false,
		configSidebarVisible: false,
		staticMenuMobileActive: false,
		menuHoverActive: false,
	});

	const onMenuToggle = () => {
		if (isOverlay()) {
			setLayoutState((prevLayoutState) => ({
				...prevLayoutState,
				overlayMenuActive: !prevLayoutState.overlayMenuActive,
			}));
		}

		if (isDesktop()) {
			setLayoutState((prevLayoutState) => ({
				...prevLayoutState,
				staticMenuDesktopInactive:
					!prevLayoutState.staticMenuDesktopInactive,
			}));
		} else {
			setLayoutState((prevLayoutState) => ({
				...prevLayoutState,
				staticMenuMobileActive: !prevLayoutState.staticMenuMobileActive,
			}));
		}
	};

	const showProfileSidebar = () => {
		setLayoutState((prevLayoutState) => ({
			...prevLayoutState,
			profileSidebarVisible: !prevLayoutState.profileSidebarVisible,
		}));
	};

	const isOverlay = () => {
		return layoutConfig.menuMode === 'overlay';
	};

	const isDesktop = () => {
		return window.innerWidth > 991;
	};

	const changeLayoutConfig = (layoutConfig: Partial<LayoutConfig>) => {
		setLayoutConfig((prevState) => ({ ...prevState, ...layoutConfig }));
	};

	const changeLayoutState = (layoutState: Partial<LayoutState>) => {
		setLayoutState((prevState) => ({ ...prevState, ...layoutState }));
	};

	return (
		<Context.Provider
			value={{
				layoutConfig,
				changeLayoutConfig,
				layoutState,
				changeLayoutState,
				onMenuToggle,
				showProfileSidebar,
			}}
		>
			{children}
		</Context.Provider>
	);
};

export default LayoutProvider;

import { useDispatch } from 'react-redux';

import {
	storeActiveMenu,
	storeMenu,
	useUiMenuSelector,
} from '@redux/reducers/ui-menu.reducer.ts';
import { useAuthentication } from '@contexts/authentication.context.tsx';
import UiMenuItem from '@models/menu/menu-item.model';
import validatePrivateComponent from '@utils/private-component.validator';
import { defaultMenus } from '@configurations/menus';

export default function useUiMenu() {
	const { hasRoles } = useAuthentication();

	const { menus, activeMenu } = useUiMenuSelector();

	const dispatch = useDispatch();

	const isValidMenu = (menu: UiMenuItem) => {
		return validatePrivateComponent(menu, hasRoles);
	};

	const filterValidMenus = (uiMenus: UiMenuItem[]): UiMenuItem[] => {
		const nMenus: UiMenuItem[] = [];

		for (const menu of uiMenus) {
			let subMenus: UiMenuItem[] = [];
			if (menu.subMenus?.length) {
				subMenus = filterValidMenus(menu.subMenus);
			}

			if (
				(menu.subMenus?.length && subMenus.length) ||
				(!menu.subMenus?.length && isValidMenu(menu))
			) {
				nMenus.push({
					...menu,
					subMenus,
				});
			}
		}

		return nMenus;
	};

	const loadUiMenus = () => {
		const nMenus = filterValidMenus(defaultMenus);
		dispatch(storeMenu({ menus: nMenus }));
	};

	const handleActiveMenu = (activeMenu = '') => {
		dispatch(storeActiveMenu({ activeMenu }));
	};

	return { menus, activeMenu, loadUiMenus, handleActiveMenu };
}

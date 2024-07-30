import UiMenuState from '@models/redux/ui-menu/ui-menu-state.model';
import { createSlice, PayloadAction } from '@reduxjs/toolkit';
import {
	UiMenuStoreActiveMenuAction,
	UiMenuStoreMenusAction,
} from '@models/redux/ui-menu/ui-menu-action.model.ts';
import { useSelector } from 'react-redux';
import { RootState } from '@app/redux';

const initialState: UiMenuState = {
	menus: [],
};

const slice = createSlice({
	name: 'ui-menu',
	initialState,
	reducers: {
		storeMenu(state, action: PayloadAction<UiMenuStoreMenusAction>) {
			state.menus = action.payload.menus;
		},
		storeActiveMenu(
			state,
			action: PayloadAction<UiMenuStoreActiveMenuAction>,
		) {
			state.activeMenu = action.payload.activeMenu;
		},
	},
});

export const { storeMenu, storeActiveMenu } = slice.actions;

export const useUiMenuSelector = () =>
	useSelector<RootState, UiMenuState>((state) => state.uiMenus);

export default slice.reducer;

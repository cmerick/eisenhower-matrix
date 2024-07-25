import { useSelector } from 'react-redux';
import { configureStore } from '@reduxjs/toolkit';
import uiMenuReducer from '@redux/reducers/ui-menu.reducer.ts';
import uiGlobalLoadingReducer from '@redux/reducers/ui-global-loading.reducer.ts';
import categoriesReducer from '@redux/reducers/categories.reducer.ts';

const store = configureStore({
	reducer: {
		uiMenus: uiMenuReducer,
		uiGlobalLoading: uiGlobalLoadingReducer,
		categories: categoriesReducer,
	},
});

export type RootState = ReturnType<typeof store.getState>;

export const useStoreSelector = () =>
	useSelector<RootState, RootState>((state) => state);

export type AppDispatch = typeof store.dispatch;

export default store;

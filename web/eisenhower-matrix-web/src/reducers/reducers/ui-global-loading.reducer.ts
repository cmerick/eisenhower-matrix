import { createSlice } from '@reduxjs/toolkit';
import { useSelector } from 'react-redux';

import UiGlobalLoadingState from '@models/redux/ui-global-loading/ui-global-loading-state.model';
import { RootState } from '@app/redux';

const initialState: UiGlobalLoadingState = {
	loading: false,
};

const slice = createSlice({
	name: 'ui-global-loading',
	initialState,
	reducers: {
		storeStart(action) {
			action.loading = true;
		},
		storeStop(action) {
			action.loading = false;
		},
	},
});

export const { storeStart, storeStop } = slice.actions;

export const useUiGlobalLoadingSelector = () =>
	useSelector<RootState, UiGlobalLoadingState>(
		(state) => state.uiGlobalLoading,
	);

export default slice.reducer;

import { createSlice, PayloadAction } from '@reduxjs/toolkit';
import { RootState } from '@app/redux';
import CategoriesState from '@models/redux/categories/categories-state.model.ts';
import { useSelector } from 'react-redux';
import { CategorySearchDto } from '@models/category/category-search.dto.ts';
import SimpleStatusEnum from '@models/simple-status/simple-status.enum.ts';

const initialState: CategoriesState = {
	filter: {
		status: SimpleStatusEnum.ACTIVE,
		statusCurso: SimpleStatusEnum.ACTIVE,
	},
};

const slice = createSlice({
	name: 'categories',
	initialState,
	reducers: {
		storeFilter(state, action: PayloadAction<CategorySearchDto>) {
			state.filter = action.payload;
		},
		cleanStore(state) {
			state.filter = {};
		},
	},
});

export const { storeFilter, cleanStore } = slice.actions;

export const useCategoriesSelector = () =>
	useSelector<RootState, CategoriesState>((state) => state.categories);

export default slice.reducer;

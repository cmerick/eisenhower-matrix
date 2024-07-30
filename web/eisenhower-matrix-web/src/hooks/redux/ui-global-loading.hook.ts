import {
	storeStart,
	storeStop,
	useUiGlobalLoadingSelector,
} from '@redux/reducers/ui-global-loading.reducer';
import { useDispatch } from 'react-redux';
import { AppDispatch } from '@app/redux';

export default function useUiGlobalLoading() {
	const { loading } = useUiGlobalLoadingSelector();

	const dispatch = useDispatch<AppDispatch>();

	const start = () => {
		dispatch(storeStart());
	};

	const stop = () => {
		dispatch(storeStop());
	};

	return { loading, start, stop };
}

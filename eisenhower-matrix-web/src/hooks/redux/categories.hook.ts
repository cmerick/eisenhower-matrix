import { useQuery } from '@tanstack/react-query';
import categoryService from '@services/rest/category.service.ts';
import { useCategoriesSelector } from '@redux/reducers/categories.reducer.ts';

export default function useCategories() {
	const { filter } = useCategoriesSelector();

	const { data, isLoading } = useQuery({
		queryKey: [
			categoryService.FIND_ALL_KEY,
			filter.nome,
			filter.status,
			filter.statusCurso,
		],
		queryFn: () => categoryService.findAll(filter),
	});

	return {
		isLoading,
		categories: data ?? [],
	};
}

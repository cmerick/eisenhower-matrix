import UiMenuItem from '@models/menu/menu-item.model';

export const defaultMenus: UiMenuItem[] = [
	new UiMenuItem({
		id: 'home',
		to: '/',
		label: 'Início',
		icon: 'fa-solid fa-house',
	}),
	new UiMenuItem({
		id: 'courses',
		to: '/courses',
		label: 'Meus cursos',
		icon: 'fa-solid fa-book',
	}),
];

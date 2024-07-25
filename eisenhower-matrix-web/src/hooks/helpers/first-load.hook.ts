import { useEffect } from 'react';

type Loader = () => Promise<void> | void;

export default function useFirstLoad(...loader: Loader[]) {
	useEffect(() => {
		void (async () => await Promise.all(loader.map((cb) => cb())))();
	}, []);
}

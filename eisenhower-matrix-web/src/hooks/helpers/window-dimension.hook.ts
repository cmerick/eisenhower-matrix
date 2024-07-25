import { useEffect, useState } from 'react';

export default function useDimensions() {
	const [windowDimension, detectHW] = useState({
		width: window.innerWidth,
		height: window.innerHeight,
	});

	const detectSize = () => {
		detectHW({
			width: window.innerWidth,
			height: window.innerHeight,
		});
	};

	useEffect(() => {
		window.addEventListener('resize', detectSize);

		return () => {
			window.removeEventListener('resize', detectSize);
		};
	}, [windowDimension]);

	return { ...windowDimension };
}

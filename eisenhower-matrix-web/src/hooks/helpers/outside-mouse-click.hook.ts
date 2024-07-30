// eslint-disable-next-line @typescript-eslint/ban-ts-comment
// @ts-nocheck
import { RefObject, useEffect } from 'react';

export default function useOutsideClick<T extends HTMLElement>(
	ref: RefObject<T>,
	callback: () => Promise<void> | void,
	deps: unknown[] = [],
) {
	useEffect(() => {
		/**
		 * Alert if clicked on outside of element
		 */
		async function handleClickOutside(event: unknown) {
			if (ref.current && !ref.current.contains(event.target)) {
				await callback();
			}
		}

		// Bind the event listener
		document.addEventListener('mousedown', handleClickOutside);
		return () => {
			// Unbind the event listener on clean up
			document.removeEventListener('mousedown', handleClickOutside);
		};
	}, [ref, ...deps]);
}

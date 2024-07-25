import { useEffect, useRef } from 'react';

type Fuc = (...args: never[]) => void

function useAsyncSetState<T extends Fuc>(asyncSetState: T) {
    const canSetState = useRef(false);

    useEffect(() => {
        canSetState.current = true;

        return () => {
            canSetState.current = false;
        };
    }, [canSetState]);

    const setAsyncState = (...args: never[]) => {
        if (canSetState.current) {
            asyncSetState(...args);
        }
    };

    return setAsyncState as unknown as T ;
}

export default useAsyncSetState;

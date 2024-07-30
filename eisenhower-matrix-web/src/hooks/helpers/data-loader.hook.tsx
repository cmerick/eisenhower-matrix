import { useEffect, useRef } from 'react';

type AsyncFunctionWithSingleParam<R = never, AP = never> = (
  value: AP,
) => Promise<R> | R;
type AsyncFunctionWithoutParam<R = never> = () => Promise<R> | R;

type AsyncFunction<R = never, AP = never> = AP extends undefined
  ? AsyncFunctionWithoutParam<R>
  : AsyncFunctionWithSingleParam<R, AP>;

type CB<R = never> = (value: R) => Promise<void> | void;
type LoaderWithSingleParameter<A = never> = (value: A) => Promise<void> | void;
type LoaderWithoutParameter = () => Promise<void> | void;

type Loader<A> = A extends undefined
  ? LoaderWithoutParameter
  : LoaderWithSingleParameter<A>;

export default function useDataLoader<R = never, AP = undefined>(
  asyncFunction: AsyncFunction<R, AP>,
  callback: CB<R>,
) {
  const canPersistData = useRef(false);

  useEffect(() => {
    canPersistData.current = true;

    return () => {
      canPersistData.current = false;
    };
  }, [canPersistData]);

  const loader = async (params: AP) => {
    const response = await asyncFunction(params);

    if (canPersistData.current) {
      await callback(response);
    }
  };

  return loader as Loader<AP>;
}

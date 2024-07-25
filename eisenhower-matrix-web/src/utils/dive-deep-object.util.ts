import AnyObject from '@models/helpers/any-object.model';

export default function diveDeepObject<T = unknown>(
	object?: AnyObject,
	key?: string,
): T | undefined {
	if (key && object) {
		const keys = key.split('.');
		if (keys.length > 1) {
			const nObj = object[keys[0]] as AnyObject;
			return diveDeepObject<T>(nObj, keys.slice(1).join('.'));
		}
		return object[keys[0]] as T;
	}
	return object as T;
}

export function diveDeepObjectDefault<V = unknown>(
	value?: AnyObject,
	defaultValue?: AnyObject | V,
	defaultKey?: string,
	key?: string,
): V | undefined {
	return diveDeepObject<V>(value, key ?? defaultKey) ?? (defaultValue as V);
}

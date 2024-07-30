import * as fns from 'date-fns';

import isObject from '@utils//is-object.util';
import isNumber from '@utils/is-number.util';

import AnyObject from '@models/helpers/any-object.model';

export default function instanceDates<T = never>(value?: T): T | undefined {
	if (value) {
		if (isObject(value)) {
			const obj = value as AnyObject;
			const keys = Object.keys(obj);
			for (const key of keys) {
				obj[key] = instanceDates(obj[key]);
			}
		}
		if (
			!(value instanceof Date) &&
			typeof value === 'string' &&
			!isNumber(value) &&
			fns.isValid(fns.parseJSON(value))
		) {
			return fns.parseJSON(value) as T;
		}
	}
	return value;
}

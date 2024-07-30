export default function isObject(object?: unknown) {
	return (
		object && typeof object === 'object' && object.constructor === Object
	);
}

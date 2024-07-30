const numRegex = /^\d+$/;

export default function isNumber(value: string) {
	return numRegex.test(value);
}

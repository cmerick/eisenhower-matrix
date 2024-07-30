export function formatCpfCnpj(document?: string) {
	let formattedCpfCnpj = document?.toString() ?? '';

	formattedCpfCnpj = formattedCpfCnpj.replace(/\D/g, '');

	if (formattedCpfCnpj.length <= 14) {
		formattedCpfCnpj = formattedCpfCnpj.replace(/(\d{3})(\d)/, '$1.$2');
		formattedCpfCnpj = formattedCpfCnpj.replace(/(\d{3})(\d)/, '$1.$2');
		formattedCpfCnpj = formattedCpfCnpj.replace(
			/(\d{3})(\d{1,2})$/,
			'$1-$2',
		);
	} else {
		formattedCpfCnpj = formattedCpfCnpj.replace(/^(\d{2})(\d)/, '$1.$2');
		formattedCpfCnpj = formattedCpfCnpj.replace(
			/^(\d{2})\.(\d{3})(\d)/,
			'$1.$2.$3',
		);
		formattedCpfCnpj = formattedCpfCnpj.replace(/\.(\d{3})(\d)/, '.$1/$2');
		formattedCpfCnpj = formattedCpfCnpj.replace(/(\d{4})(\d)/, '$1-$2');
	}

	return formattedCpfCnpj;
}

export function formatCnpj(value?: string): string {
	return (
		value?.replace(
			/(\d{2})(\d{3})(\d{3})(\d{4})(\d{2})/,
			'$1.$2.$3/$4-$5',
		) ?? ''
	);
}

export function formatCurrency(
	value: number,
	options: { currency?: string; locale?: string } = {},
) {
	const { locale = 'pt-Br', currency = 'BRL' } = options;
	return value.toLocaleString(locale, { style: 'currency', currency });
}

export function formatStringOnlyNumber(value?: string): string {
	return value?.replace(/\D/g, '') ?? '';
}

export function formatNumber(
	amount: number,
	options?: {
		decimalCount?: number;
		decimal?: string;
		thousands?: string;
		prefix?: string;
		suffix?: string;
		showPositiveSing?: boolean;
	},
) {
	const o = {
		decimalCount: 2,
		decimal: ',',
		thousands: '.',
		prefix: '',
		suffix: '',
		showPositiveSing: false,
		...options,
	};

	const { decimal, thousands, prefix, suffix, showPositiveSing } = o;

	let { decimalCount } = o;

	try {
		decimalCount = Math.abs(decimalCount);
		decimalCount = isNaN(decimalCount) ? 2 : decimalCount;

		const negativeSign =
			amount < 0 ? '-' : showPositiveSing && amount > 0 ? '+' : '';
		amount = Math.abs(amount || 0);

		const i = parseInt(amount.toFixed(decimalCount)).toString();
		const j = i.length > 3 ? i.length % 3 : 0;

		return (
			negativeSign +
			(prefix.length > 0 ? ` ${prefix} ` : '') +
			(j ? i.substring(0, j) + thousands : '') +
			i.substring(j).replace(/(\d{3})(?=\d)/g, '$1' + thousands) +
			(decimalCount
				? decimal +
					Math.abs(amount - Number(i))
						.toFixed(decimalCount)
						.slice(2)
				: '') +
			(suffix.length > 0 ? ` ${suffix} ` : '')
		);
	} catch (e) {
		console.log(e);

		return '';
	}
}

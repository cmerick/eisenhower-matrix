import USER from '@configurations/user-types.ts';
import PrivateComponent, {
	PrivateComponentMode,
} from '@models/security/private-component.model.ts';

type CallbackValidation = (
	userType: USER[],
	roles: string[],
	mode?: PrivateComponentMode,
	resource?: string,
) => boolean;

export default function validatePrivateComponent(
	component: PrivateComponent,
	callbackValidation: CallbackValidation,
	resource?: string,
) {
	const {
		userType = [],
		roles = [],
		mode = PrivateComponentMode.SOME,
	} = component;
	if (!userType.length) {
		return true;
	} else {
		return callbackValidation(userType, roles, mode, resource);
	}
}

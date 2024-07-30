import { Subject } from 'rxjs';

import FeedbackMessage, {
	FEEDBACK_FORM_MESSAGE_TYPE,
	FEEDBACK_MESSAGE_TOAST_TYPE,
} from '@models/feedback-message/feedback-message.model.ts';
import FeedbackMessageWrapper from '@models/feedback-message/feedback-message-wrapper.model.ts';

const messages$ = new Subject<FeedbackMessageWrapper>();

export default function useFeedbackMessages() {
	const showToastMessage = (message: FeedbackMessage) => {
		messages$.next({ type: FEEDBACK_MESSAGE_TOAST_TYPE, message });
	};

	const showFormMessage = (message: FeedbackMessage) => {
		messages$.next({ type: FEEDBACK_FORM_MESSAGE_TYPE, message });
	};

	return {
		uiMessages$: messages$.asObservable(),
		showFormMessage,
		showToastMessage,
	};
}

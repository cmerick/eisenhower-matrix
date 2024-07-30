package br.com.mar.textpulse.dto.notification;

import br.com.mar.textpulse.dto.notification.enums.NotificationStatusEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NotificationResponse {

	@JsonProperty("id")
	private UUID id;

	@JsonProperty("recipients")
	private String recipients;

	@JsonProperty("title")
	private String title;

	@JsonProperty("content")
	private String content;

	@JsonProperty("status")
	private NotificationStatusEnum status;

	@JsonProperty("requestDate")
	private LocalDateTime requestDate;

	@JsonProperty("sentDate")
	private LocalDateTime sentDate;
}

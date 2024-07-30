package br.com.mar.textpulse.dto.notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NotificationRegisterRequest {

	@JsonProperty("title")
    private String title;

	@JsonProperty("content")
    private String content;

	@JsonProperty("recipients")
    private String recipients;

}

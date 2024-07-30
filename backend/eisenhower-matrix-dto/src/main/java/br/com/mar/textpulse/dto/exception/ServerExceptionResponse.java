package br.com.mar.textpulse.dto.exception;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
@Builder
public class ServerExceptionResponse {

	@JsonProperty("message")
	private final String message;

	@JsonProperty("date")
	private final LocalDateTime timestamp;

}

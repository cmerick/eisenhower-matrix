package com.cmerick.eisenhower_matrix.rest.dtos.exception;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
public class BadRequestException extends RuntimeException {

	private final String message;

}

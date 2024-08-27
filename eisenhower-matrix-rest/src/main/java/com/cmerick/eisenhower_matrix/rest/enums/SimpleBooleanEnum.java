package com.cmerick.eisenhower_matrix.rest.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SimpleBooleanEnum {
    TRUE("T"),
    FALSE("F"),
    ;
    private final String value;
}

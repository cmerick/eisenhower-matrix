package com.cmerick.eisenhower_matrix.rest.enums;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SimpleStatusEnum {
    ACTIVE("A"),
    INACTIVE("I"),
    ;
    private final String value;
}

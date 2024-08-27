package com.cmerick.eisenhower_matrix.rest.enums;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserRoleEnum {
    ADMIN("Admin"),
    USER("User")
    ;
    private final String value;

}

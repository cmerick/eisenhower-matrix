package br.com.mar.textpulse.dto.groups.enums;

import com.herculanoleo.spring.se.models.enums.SerializableEnum;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum GroupType implements SerializableEnum {

    ADMIN("A"),
    COMPANY("C"),
    SUPPORT("S"),
    ;

    private final String value;
}

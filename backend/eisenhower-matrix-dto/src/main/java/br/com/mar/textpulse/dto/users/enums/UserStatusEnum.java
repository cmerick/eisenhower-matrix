package br.com.mar.textpulse.dto.users.enums;

import com.herculanoleo.spring.se.database.models.annotation.SerializableEnumDBConverter;
import com.herculanoleo.spring.se.models.enums.SerializableEnum;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@SerializableEnumDBConverter
public enum UserStatusEnum implements SerializableEnum {
    ACTIVE("A"),
    INACTIVE("I"),
    ;

    private final String value;

}

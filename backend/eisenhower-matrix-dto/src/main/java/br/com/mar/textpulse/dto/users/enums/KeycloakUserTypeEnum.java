package br.com.mar.textpulse.dto.users.enums;

import com.herculanoleo.spring.se.database.models.annotation.SerializableEnumDBConverter;
import com.herculanoleo.spring.se.models.enums.SerializableEnum;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@SerializableEnumDBConverter
public enum KeycloakUserTypeEnum implements SerializableEnum {
    ADMIN_USER("AU"),
    ADMIN_CLIENT("AC"),
    ;

    private final String value;

    public static final String ATTRIBUTE_KEY = "application.type";
}

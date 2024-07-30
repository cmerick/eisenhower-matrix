package br.com.mar.textpulse.dto.common.enums;

import com.herculanoleo.spring.se.database.models.annotation.SerializableEnumDBConverter;
import com.herculanoleo.spring.se.models.enums.SerializableEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Schema(type = "string", allowableValues = {"A", "I"}, description = "A = ACTIVE; I = INACTIVE")
@Getter
@RequiredArgsConstructor
@SerializableEnumDBConverter
public enum SimpleStatusEnum implements SerializableEnum {
    ACTIVE("A"),
    INACTIVE("I"),
    ;

    private final String value;
}

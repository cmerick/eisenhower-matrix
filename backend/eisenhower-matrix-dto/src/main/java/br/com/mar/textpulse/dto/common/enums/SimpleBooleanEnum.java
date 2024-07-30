package br.com.mar.textpulse.dto.common.enums;

import com.herculanoleo.spring.se.database.models.annotation.SerializableEnumDBConverter;
import com.herculanoleo.spring.se.models.enums.SerializableEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Schema(type = "string", allowableValues = {"T", "F"}, description = "T = SIM; F = NAO" )
@Getter
@RequiredArgsConstructor
@SerializableEnumDBConverter
public enum SimpleBooleanEnum implements SerializableEnum {
    SIM("T"),
    NAO("F"),
    ;
    private final String value;
}

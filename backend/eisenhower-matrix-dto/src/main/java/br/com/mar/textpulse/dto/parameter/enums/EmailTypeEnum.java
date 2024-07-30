package br.com.mar.textpulse.dto.parameter.enums;

import com.herculanoleo.spring.se.database.models.annotation.SerializableEnumDBConverter;
import com.herculanoleo.spring.se.models.enums.SerializableEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Schema(type = "string", allowableValues = {"U", "P", "V"}, description = "U = CREATE USER, P = RESET PASSWORD, V = VALIDATION CODE")
@Getter
@RequiredArgsConstructor
@SerializableEnumDBConverter
public enum EmailTypeEnum implements SerializableEnum {
    CREATE_USER("U"),
    RESET_PASSWORD("P"),
    VALIDATION_CODE("V"),
    ;

    private final String value;

}



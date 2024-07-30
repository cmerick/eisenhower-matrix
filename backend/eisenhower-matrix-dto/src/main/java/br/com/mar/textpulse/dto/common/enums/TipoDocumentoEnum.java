package br.com.mar.textpulse.dto.common.enums;

import com.herculanoleo.spring.se.database.models.annotation.SerializableEnumDBConverter;
import com.herculanoleo.spring.se.models.enums.SerializableEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Schema(type = "string", allowableValues = {"F", "J"}, description = "F = FISICA; J = JURIDICA")
@Getter
@RequiredArgsConstructor
@SerializableEnumDBConverter
public enum TipoDocumentoEnum implements SerializableEnum {
    FISICA("F"),
    JURIDICA("J"),
    ;
    private final String value;
}

package br.com.mar.textpulse.dto.common.enums;

import com.herculanoleo.spring.se.database.models.annotation.SerializableEnumDBConverter;
import com.herculanoleo.spring.se.models.enums.SerializableEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Schema(type = "string", allowableValues = {"N", "M", "T", "D", "B", "L"}, description = "N = NUMBER; M = MONEY; T = TEXT; D = DATE; B = BOOLEAN; L = LIST;")
@Getter
@RequiredArgsConstructor
@SerializableEnumDBConverter
public enum FieldTypeEnum implements SerializableEnum {
    NUMBER("N"),
    MONEY("M"),
    TEXT("T"),
    DATE("D"),
    BOOLEAN("B"),
    LIST("L")
    ;
    private final String value;
}

package br.com.mar.textpulse.dto.notification.enums;

import com.herculanoleo.spring.se.database.models.annotation.SerializableEnumDBConverter;
import com.herculanoleo.spring.se.models.enums.SerializableEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Schema(type = "string", allowableValues = {"R", "S", "E"}, description = "R = REQUESTED; S = SENT; E = ERROR")
@Getter
@RequiredArgsConstructor
@SerializableEnumDBConverter
public enum NotificationStatusEnum implements SerializableEnum {
    REQUESTED("R"),
    SENT("S"),
    ERROR("E"),
    ;

    private final String value;

}

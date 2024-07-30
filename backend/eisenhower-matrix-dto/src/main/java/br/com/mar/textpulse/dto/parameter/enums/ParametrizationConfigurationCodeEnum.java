package br.com.mar.textpulse.dto.parameter.enums;

import com.herculanoleo.spring.se.models.enums.SerializableEnum;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ParametrizationConfigurationCodeEnum implements SerializableEnum {
    URL_WEB("url.web"),
    ;

    private final String value;
}

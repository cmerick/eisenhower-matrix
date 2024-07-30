package br.com.mar.textpulse.dto.users.enums.converters;

import br.com.mar.textpulse.dto.users.enums.KeycloakUserTypeEnum;
import com.herculanoleo.spring.se.models.enums.SerializableEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.lang.Override;
import java.lang.String;
import org.apache.commons.lang3.StringUtils;

@Converter(
    autoApply = true
)
public final class KeycloakUserTypeEnumEnumConverter implements AttributeConverter<KeycloakUserTypeEnum, String> {
  @Override
  public String convertToDatabaseColumn(KeycloakUserTypeEnum value) {
    if (null != value) {
      return value.getValue();
    }
    return null;
  }

  @Override
  public KeycloakUserTypeEnum convertToEntityAttribute(String value) {
    if (StringUtils.isNotBlank(value)) {
      return SerializableEnum.fromValue(value, KeycloakUserTypeEnum.class);
    }
    return null;
  }
}

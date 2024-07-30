package br.com.mar.textpulse.dto.users.enums.converters;

import br.com.mar.textpulse.dto.users.enums.PasswordStatusEnum;
import com.herculanoleo.spring.se.models.enums.SerializableEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.lang.Override;
import java.lang.String;
import org.apache.commons.lang3.StringUtils;

@Converter(
    autoApply = true
)
public final class PasswordStatusEnumEnumConverter implements AttributeConverter<PasswordStatusEnum, String> {
  @Override
  public String convertToDatabaseColumn(PasswordStatusEnum value) {
    if (null != value) {
      return value.getValue();
    }
    return null;
  }

  @Override
  public PasswordStatusEnum convertToEntityAttribute(String value) {
    if (StringUtils.isNotBlank(value)) {
      return SerializableEnum.fromValue(value, PasswordStatusEnum.class);
    }
    return null;
  }
}

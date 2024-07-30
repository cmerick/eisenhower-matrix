package br.com.mar.textpulse.dto.common.enums.converters;

import br.com.mar.textpulse.dto.common.enums.SimpleBooleanEnum;
import com.herculanoleo.spring.se.models.enums.SerializableEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.lang.Override;
import java.lang.String;
import org.apache.commons.lang3.StringUtils;

@Converter(
    autoApply = true
)
public final class SimpleBooleanEnumEnumConverter implements AttributeConverter<SimpleBooleanEnum, String> {
  @Override
  public String convertToDatabaseColumn(SimpleBooleanEnum value) {
    if (null != value) {
      return value.getValue();
    }
    return null;
  }

  @Override
  public SimpleBooleanEnum convertToEntityAttribute(String value) {
    if (StringUtils.isNotBlank(value)) {
      return SerializableEnum.fromValue(value, SimpleBooleanEnum.class);
    }
    return null;
  }
}

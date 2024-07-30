package br.com.mar.textpulse.dto.common.enums.converters;

import br.com.mar.textpulse.dto.common.enums.SimpleStatusEnum;
import com.herculanoleo.spring.se.models.enums.SerializableEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.lang.Override;
import java.lang.String;
import org.apache.commons.lang3.StringUtils;

@Converter(
    autoApply = true
)
public final class SimpleStatusEnumEnumConverter implements AttributeConverter<SimpleStatusEnum, String> {
  @Override
  public String convertToDatabaseColumn(SimpleStatusEnum value) {
    if (null != value) {
      return value.getValue();
    }
    return null;
  }

  @Override
  public SimpleStatusEnum convertToEntityAttribute(String value) {
    if (StringUtils.isNotBlank(value)) {
      return SerializableEnum.fromValue(value, SimpleStatusEnum.class);
    }
    return null;
  }
}

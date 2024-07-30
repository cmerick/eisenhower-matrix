package br.com.mar.textpulse.dto.parameter.enums.converters;

import br.com.mar.textpulse.dto.parameter.enums.EmailTypeEnum;
import com.herculanoleo.spring.se.models.enums.SerializableEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.lang.Override;
import java.lang.String;
import org.apache.commons.lang3.StringUtils;

@Converter(
    autoApply = true
)
public final class EmailTypeEnumEnumConverter implements AttributeConverter<EmailTypeEnum, String> {
  @Override
  public String convertToDatabaseColumn(EmailTypeEnum value) {
    if (null != value) {
      return value.getValue();
    }
    return null;
  }

  @Override
  public EmailTypeEnum convertToEntityAttribute(String value) {
    if (StringUtils.isNotBlank(value)) {
      return SerializableEnum.fromValue(value, EmailTypeEnum.class);
    }
    return null;
  }
}

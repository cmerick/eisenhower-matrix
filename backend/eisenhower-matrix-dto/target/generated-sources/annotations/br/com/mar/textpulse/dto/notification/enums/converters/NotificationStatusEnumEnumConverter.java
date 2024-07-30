package br.com.mar.textpulse.dto.notification.enums.converters;

import br.com.mar.textpulse.dto.notification.enums.NotificationStatusEnum;
import com.herculanoleo.spring.se.models.enums.SerializableEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.lang.Override;
import java.lang.String;
import org.apache.commons.lang3.StringUtils;

@Converter(
    autoApply = true
)
public final class NotificationStatusEnumEnumConverter implements AttributeConverter<NotificationStatusEnum, String> {
  @Override
  public String convertToDatabaseColumn(NotificationStatusEnum value) {
    if (null != value) {
      return value.getValue();
    }
    return null;
  }

  @Override
  public NotificationStatusEnum convertToEntityAttribute(String value) {
    if (StringUtils.isNotBlank(value)) {
      return SerializableEnum.fromValue(value, NotificationStatusEnum.class);
    }
    return null;
  }
}

package br.com.mar.textpulse.dto.users.enums.converters;

import br.com.mar.textpulse.dto.users.enums.UserStatusEnum;
import com.herculanoleo.spring.se.models.enums.SerializableEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.lang.Override;
import java.lang.String;
import org.apache.commons.lang3.StringUtils;

@Converter(
    autoApply = true
)
public final class UserStatusEnumEnumConverter implements AttributeConverter<UserStatusEnum, String> {
  @Override
  public String convertToDatabaseColumn(UserStatusEnum value) {
    if (null != value) {
      return value.getValue();
    }
    return null;
  }

  @Override
  public UserStatusEnum convertToEntityAttribute(String value) {
    if (StringUtils.isNotBlank(value)) {
      return SerializableEnum.fromValue(value, UserStatusEnum.class);
    }
    return null;
  }
}

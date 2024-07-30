package br.com.mar.textpulse.dto.common.enums.converters;

import br.com.mar.textpulse.dto.common.enums.TipoDocumentoEnum;
import com.herculanoleo.spring.se.models.enums.SerializableEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.lang.Override;
import java.lang.String;
import org.apache.commons.lang3.StringUtils;

@Converter(
    autoApply = true
)
public final class TipoDocumentoEnumEnumConverter implements AttributeConverter<TipoDocumentoEnum, String> {
  @Override
  public String convertToDatabaseColumn(TipoDocumentoEnum value) {
    if (null != value) {
      return value.getValue();
    }
    return null;
  }

  @Override
  public TipoDocumentoEnum convertToEntityAttribute(String value) {
    if (StringUtils.isNotBlank(value)) {
      return SerializableEnum.fromValue(value, TipoDocumentoEnum.class);
    }
    return null;
  }
}

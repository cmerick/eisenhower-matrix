package br.com.mar.textpulse.dto.common.enums;

import com.herculanoleo.spring.se.database.models.annotation.SerializableEnumDBConverter;
import com.herculanoleo.spring.se.models.enums.SerializableEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Schema(type = "string", allowableValues = {"A", "R", "E", "N"}, description = "A = APROVADO; R = REJEITADO; E = EM_ANALISE; N = NAO_AVALIADO")
@Getter
@RequiredArgsConstructor
@SerializableEnumDBConverter
public enum LicitacaoEmpresaStatusEnum implements SerializableEnum {
    APROVADO("A"),
    REJEITADO("R"),
    EM_ANALISE("E"),
    NAO_AVALIADO("N"),
    ;
    private final String value;
}

package br.com.mar.textpulse.dto.licitacaoEmpresaStatus;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LicitacaoEmpresaStatusIdDto {

    @JsonProperty("idEmpresa")
    private UUID idEmpresa;

    @JsonProperty("idDocumentoMongodb")
    private UUID idDocumentoMongodb;

}
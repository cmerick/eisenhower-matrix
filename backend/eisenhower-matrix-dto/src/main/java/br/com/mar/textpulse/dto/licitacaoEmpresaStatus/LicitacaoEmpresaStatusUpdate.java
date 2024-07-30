package br.com.mar.textpulse.dto.licitacaoEmpresaStatus;

import br.com.mar.textpulse.dto.common.enums.LicitacaoEmpresaStatusEnum;
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
public class LicitacaoEmpresaStatusUpdate {

    @JsonProperty("idEmpresa")
    private UUID idEmpresa;

    @JsonProperty("idDocumentoMongodb")
    private UUID idDocumentoMongodb;

    @JsonProperty("autor")
    private String autor;

    @JsonProperty("status")
    private LicitacaoEmpresaStatusEnum status;




}

package br.com.mar.textpulse.dto.licitacaoEmpresaStatus;

import br.com.mar.textpulse.dto.common.enums.LicitacaoEmpresaStatusEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LicitacaoEmpresaStatusResponse {

    @JsonProperty("ids")
    private LicitacaoEmpresaStatusIdDto ids;

    @JsonProperty("autor")
    private String autor;

    @JsonProperty("status")
    private LicitacaoEmpresaStatusEnum status;

}

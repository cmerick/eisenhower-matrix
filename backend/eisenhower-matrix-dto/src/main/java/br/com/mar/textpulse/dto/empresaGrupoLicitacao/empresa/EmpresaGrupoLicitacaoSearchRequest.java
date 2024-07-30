package br.com.mar.textpulse.dto.empresaGrupoLicitacao.empresa;

import br.com.mar.textpulse.dto.common.enums.SimpleStatusEnum;
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
public class EmpresaGrupoLicitacaoSearchRequest {

    @JsonProperty("idEmpresa")
    private UUID idEmpresa;

    @JsonProperty("idGrupoLicitacao")
    private UUID idGrupoLicitacao;

    @JsonProperty("status")
    private SimpleStatusEnum status;
}

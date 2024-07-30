package br.com.mar.textpulse.dto.empresaGrupoLicitacao.empresa;

import br.com.mar.textpulse.dto.visaoConfiguracao.VisaoConfiguracaoResponse;
import br.com.mar.textpulse.dto.visaoConfiguracao.VisaoConfiguracaoUpdateRequest;
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
public class EmpresaGrupoLicitacaoUpdateRequest {

    @JsonProperty("idEmpresa")
    private UUID idEmpresa;

    @JsonProperty("idGrupoLicitacao")
    private UUID idGrupoLicitacao;

    @JsonProperty("visaoConfiguracao")
    private VisaoConfiguracaoUpdateRequest visaoConfiguracao;

}

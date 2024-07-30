package br.com.mar.textpulse.dto.empresaGrupoLicitacao.empresa;


import br.com.mar.textpulse.dto.common.enums.SimpleStatusEnum;
import br.com.mar.textpulse.dto.visaoConfiguracao.VisaoConfiguracaoResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
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
public class EmpresaGrupoLicitacaoResponse {

    @JsonProperty("id")
    private UUID id;

    @JsonProperty("idEmpresa")
    private UUID idEmpresa;

    @JsonProperty("idGrupoLicitacao")
    private UUID idGrupoLicitacao;

    @JsonProperty("visaoConfiguracao")
    private VisaoConfiguracaoResponse visaoConfiguracao;

    @JsonProperty("nomeEmpresa")
    private String nomeEmpresa;

    @JsonProperty("nomeGrupo")
    private String nomeGrupo;

    @JsonProperty("status")
    private SimpleStatusEnum status;


}

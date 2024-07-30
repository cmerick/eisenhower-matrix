package br.com.mar.textpulse.dto.grupoLicitacao;

import br.com.mar.textpulse.dto.common.enums.SimpleStatusEnum;
import br.com.mar.textpulse.dto.licitacoes.LicitacaoResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GrupoLicitacaoRegisterRequest {

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("codigoPerfilVisao")
    private String codigoPerfilVisao;

    @JsonProperty("status")
    private SimpleStatusEnum status;

    @JsonProperty("licitacoes")
    private Collection<LicitacaoResponse> licitacoes;
}

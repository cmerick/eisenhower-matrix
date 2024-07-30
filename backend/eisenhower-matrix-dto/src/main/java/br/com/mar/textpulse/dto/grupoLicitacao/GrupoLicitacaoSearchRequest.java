package br.com.mar.textpulse.dto.grupoLicitacao;

import br.com.mar.textpulse.dto.common.enums.SimpleStatusEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GrupoLicitacaoSearchRequest {

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("codigoPerfilVisao")
    private String codigoPerfilVisao;

    @JsonProperty("status")
    private SimpleStatusEnum status;
}
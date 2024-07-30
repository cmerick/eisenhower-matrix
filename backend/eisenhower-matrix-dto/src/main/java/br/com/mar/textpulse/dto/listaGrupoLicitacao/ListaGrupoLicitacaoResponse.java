package br.com.mar.textpulse.dto.listaGrupoLicitacao;

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
public class ListaGrupoLicitacaoResponse {

    @JsonProperty("idLicitacao")
    private UUID idLicitacao;

    @JsonProperty("idGrupoLicitacao")
    private UUID idGrupoLicitacao;
}

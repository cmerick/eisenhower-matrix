package br.com.mar.textpulse.dto.licitacoes;

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
public class LicitacaoResponse {

    @JsonProperty("id")
    private UUID id;

    @JsonProperty("nomeSite")
    private String nomeSite;

    @JsonProperty("idTipo")
    private Long idTipo;

    @JsonProperty("idModalidade")
    private Long idModalidade;

    @JsonProperty("status")
    private SimpleStatusEnum status;

    @JsonProperty("nomeModalidade")
    private String nomeModalidade;

    @JsonProperty("nomeTipo")
    private String nomeTipo;


}

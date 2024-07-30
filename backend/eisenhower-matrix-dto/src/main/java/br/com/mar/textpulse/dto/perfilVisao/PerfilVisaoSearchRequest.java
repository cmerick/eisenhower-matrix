package br.com.mar.textpulse.dto.perfilVisao;

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
public class PerfilVisaoSearchRequest {

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("idTipo")
    private Long idTipo;

    @JsonProperty("idModalidade")
    private Long idModalidade;

    @JsonProperty("status")
    private SimpleStatusEnum status;
}

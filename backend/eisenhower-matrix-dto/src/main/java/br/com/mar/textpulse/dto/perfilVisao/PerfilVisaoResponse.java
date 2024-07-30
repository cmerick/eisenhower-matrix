package br.com.mar.textpulse.dto.perfilVisao;

import br.com.mar.textpulse.dto.campos.CampoResponse;
import br.com.mar.textpulse.dto.common.enums.SimpleStatusEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PerfilVisaoResponse {

    @JsonProperty("codigo")
    private String codigo;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("idTipo")
    private Long idTipo;

    @JsonProperty("idModalidade")
    private Long idModalidade;

    @JsonProperty("status")
    private SimpleStatusEnum status;

    @JsonProperty("campos")
    private Collection<CampoResponse> campos;
}

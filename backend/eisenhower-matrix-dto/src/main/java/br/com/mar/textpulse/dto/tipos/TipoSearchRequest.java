package br.com.mar.textpulse.dto.tipos;

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
public class TipoSearchRequest {

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("status")
    private SimpleStatusEnum status;
}
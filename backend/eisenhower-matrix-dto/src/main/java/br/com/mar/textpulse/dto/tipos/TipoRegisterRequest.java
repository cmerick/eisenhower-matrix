package br.com.mar.textpulse.dto.tipos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TipoRegisterRequest {

    @JsonProperty("nome")
    private String nome;

}

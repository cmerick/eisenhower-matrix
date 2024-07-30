package br.com.mar.textpulse.dto.filtroConfiguracao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FiltroConfiguracaoRegisterRequest {

    @JsonProperty("filtro")
    private String filtro;

}

package br.com.mar.textpulse.dto.filtroConfiguracao;

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
public class FiltroConfiguracaoUpdateRequest {

    @JsonProperty("idVisaoConfiguracao")
    private UUID idVisaoConfiguracao;

    @JsonProperty("filtro")
    private String filtro;

}

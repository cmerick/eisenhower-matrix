package br.com.mar.textpulse.dto.visaoConfiguracao;

import br.com.mar.textpulse.dto.filtroConfiguracao.FiltroConfiguracaoRegisterRequest;
import br.com.mar.textpulse.dto.filtroConfiguracao.FiltroConfiguracaoUpdateRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VisaoConfiguracaoUpdateRequest {

    @JsonProperty("campos")
    private Integer[] campos;

    @JsonProperty("filtroConfiguracao")
    private FiltroConfiguracaoUpdateRequest filtroConfiguracao;
}

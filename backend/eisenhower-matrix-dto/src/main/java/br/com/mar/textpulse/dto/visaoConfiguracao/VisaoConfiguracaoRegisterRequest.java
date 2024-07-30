package br.com.mar.textpulse.dto.visaoConfiguracao;

import br.com.mar.textpulse.dto.common.enums.SimpleStatusEnum;
import br.com.mar.textpulse.dto.filtroConfiguracao.FiltroConfiguracaoRegisterRequest;
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
public class VisaoConfiguracaoRegisterRequest {

    @JsonProperty("campos")
    private Integer[] campos;

    @JsonProperty("idEmpresaGrupoLicitacao")
    private UUID idEmpresaGrupoLicitacao;

    @JsonProperty("filtroConfiguracao")
    private FiltroConfiguracaoRegisterRequest filtroConfiguracao;
}

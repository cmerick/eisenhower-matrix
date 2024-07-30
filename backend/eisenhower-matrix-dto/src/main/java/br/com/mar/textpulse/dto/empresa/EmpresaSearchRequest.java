package br.com.mar.textpulse.dto.empresa;

import br.com.mar.textpulse.dto.common.enums.SimpleStatusEnum;
import br.com.mar.textpulse.dto.common.enums.TipoDocumentoEnum;
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
public class EmpresaSearchRequest {


    @JsonProperty("razaoSocial")
    private String razaoSocial;

    @JsonProperty("nomeFantasia")
    private String nomeFantasia;

    @JsonProperty("cnpj")
    private String cnpj;

    @JsonProperty("status")
    private SimpleStatusEnum status;
}

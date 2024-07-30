package br.com.mar.textpulse.dto.empresa;


import br.com.mar.textpulse.dto.common.enums.SimpleStatusEnum;

import com.fasterxml.jackson.annotation.JsonInclude;
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
public class EmpresaResponse {

    @JsonProperty("id")
    private UUID id;

    @JsonProperty("razaoSocial")
    private String razaoSocial;

    @JsonProperty("nomeFantasia")
    private String nomeFantasia;

    @JsonProperty("cnpj")
    private String cnpj;

    @JsonProperty("telefone")
    private String telefone;

    @JsonProperty("email")
    private String email;

    @JsonProperty("status")
    private SimpleStatusEnum status;

    @JsonProperty("endereco")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private EmpresaEnderecoResponse endereco;


}

package br.com.mar.textpulse.dto.empresa;

import br.com.mar.textpulse.dto.common.enums.SimpleStatusEnum;
import br.com.mar.textpulse.dto.common.enums.TipoDocumentoEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmpresaRegisterRequest {

    @JsonProperty("nomeFantasia")
    private String nomeFantasia;

    @JsonProperty("razaoSocial")
    private String razaoSocial;

    @JsonProperty("cnpj")
    private String cnpj;

    @JsonProperty("telefone")
    private String telefone;

    @JsonProperty("email")
    private String email;

    @JsonProperty("status")
    private SimpleStatusEnum status;

    @JsonProperty("endereco")
    private EmpresaEnderecoResponse endereco;
}

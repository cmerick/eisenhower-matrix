package br.com.mar.textpulse.dto.empresa;

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
public class EmpresaEnderecoResponse {

    @JsonProperty("idEmpresa")
    private UUID idEmpresa;

    @JsonProperty("idMunicipio")
    private Long idMunicipio;

    @JsonProperty("cep")
    private String cep;

    @JsonProperty("bairro")
    private String bairro;

    @JsonProperty("logradouro")
    private String logradouro;

    @JsonProperty("numero")
    private String numero;

    @JsonProperty("complemento")
    private String complemento;

    @JsonProperty("idEstado")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long idEstado;

}

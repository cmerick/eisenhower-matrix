package br.com.mar.textpulse.dto.documento;

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
public class DocumentoTipoDeObrasSearchRequest {

    @JsonProperty("idLicitacao")
    private UUID idLicitacao;

    @JsonProperty("nomeLocal")
    private String nomeLocal;

    @JsonProperty("endereco")
    private String endereco;

    @JsonProperty("bairro")
    private String bairro;

    @JsonProperty("cep")
    private String cep;

    @JsonProperty("cidade")
    private String cidade;

    @JsonProperty("estado")
    private String estado;

}

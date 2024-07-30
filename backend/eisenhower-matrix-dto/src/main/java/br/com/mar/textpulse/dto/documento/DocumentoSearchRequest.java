package br.com.mar.textpulse.dto.documento;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DocumentoSearchRequest {

    @JsonProperty("id")
    private UUID id;

    @JsonProperty
    private UUID idEmpresa;

    @JsonProperty("site")
    private String site;

    @JsonProperty("idModalidade")
    private String idModalidade;

    @JsonProperty("diTipo")
    private String idTipo;

    @JsonProperty("objetivo")
    private String objetivo ;

    @JsonProperty("tipo_de_edificacoes")
    private Long tpEdificacoes;

    @JsonProperty("empreitada")
    private String empreitada;

    @JsonProperty("valor")
    private String valor;

    @JsonProperty("garantia")
    private String garantia;

    @JsonProperty("composicao_de_precos")
    private String compPrecos;

    @JsonProperty("recurso")
    private String recurso;

    @JsonProperty("nr_edital")
    private String nrEdital;

    @JsonProperty("dtAbertura")
    private String dtAbertura;

    @JsonProperty("tipoDeObras")
    private Collection<DocumentoTipoDeObrasSearchRequest> uniEscolares;
}

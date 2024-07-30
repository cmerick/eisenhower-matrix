package br.com.mar.textpulse.dto.documento;

import br.com.mar.textpulse.dto.licitacaoEmpresaStatus.LicitacaoEmpresaStatusResponse;
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
public class DocumentoResponse {

    @JsonProperty("id")
    private UUID id;

    @JsonProperty("site")
    private String site;

    @JsonProperty("objetivo")
    private String objetivo ;

    @JsonProperty("tpEdificacoes")
    private String tpEdificacoes;

    @JsonProperty("empreitada")
    private String empreitada;

    @JsonProperty("valor")
    private String valor;

    @JsonProperty("visita")
    private String visita;

    @JsonProperty("garantia")
    private String garantia;

    @JsonProperty("compPrecos")
    private String compPrecos;

    @JsonProperty("recurso")
    private String recurso;

    @JsonProperty("nrEdital")
    private String nrEdital;

    @JsonProperty("dtAbertura")
    private String dtAbertura;

    @JsonProperty("tipoDeObras")
    private Collection<TipoDeObrasResponse> tipoDeObrasResponses;

    @JsonProperty("licitacaoEmpresaStatus")
    private LicitacaoEmpresaStatusResponse licitacaoEmpresaStatus;
}

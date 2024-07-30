package br.com.mar.textpulse.dto.campos;

import br.com.mar.textpulse.dto.common.enums.FieldTypeEnum;
import br.com.mar.textpulse.dto.common.enums.SimpleStatusEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CampoUpdateRequest {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("mongodbCampo")
    private String mongodbCampo;

    @JsonProperty("tipo")
    private FieldTypeEnum tipo;

    @JsonProperty("status")
    private SimpleStatusEnum status;
}

package br.com.mar.textpulse.dto.parameter;


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
public class StateResponse {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("uf")
    private String uf;

    @JsonProperty("status")
    private SimpleStatusEnum status;

}

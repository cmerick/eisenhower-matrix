package br.com.mar.textpulse.dto.parameter;


import br.com.mar.textpulse.dto.common.enums.SimpleStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StateSearchRequest {

    private String name;

    private SimpleStatusEnum status;

}

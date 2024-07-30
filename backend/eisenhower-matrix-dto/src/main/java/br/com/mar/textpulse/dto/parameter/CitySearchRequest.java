package br.com.mar.textpulse.dto.parameter;


import br.com.mar.textpulse.dto.common.enums.SimpleStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CitySearchRequest {

    private Collection<Long> ids;

    private String name;

    private Long stateId;

    private SimpleStatusEnum status;

}

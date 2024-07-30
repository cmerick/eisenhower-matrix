package br.com.mar.textpulse.dto.parameter;

import br.com.mar.textpulse.dto.common.enums.SimpleStatusEnum;
import br.com.mar.textpulse.dto.parameter.enums.EmailTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmailSearchRequest {

    private Collection<Long> ids;

    private String title;

    private String body;

    private EmailTypeEnum type;

    private SimpleStatusEnum status;

}
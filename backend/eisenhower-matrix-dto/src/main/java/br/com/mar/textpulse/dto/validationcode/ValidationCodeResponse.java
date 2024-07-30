package br.com.mar.textpulse.dto.validationcode;

import br.com.mar.textpulse.dto.common.enums.SimpleStatusEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ValidationCodeResponse {

    @JsonProperty("id")
    private UUID id;

    @JsonProperty("email")
    private String email;

    @JsonProperty("name")
    private String name;

    @JsonProperty("requestAt")
    private LocalDateTime requestAt;

    @JsonProperty("validAt")
    private LocalDateTime validAt;

    @JsonProperty("status")
    private SimpleStatusEnum status;

}

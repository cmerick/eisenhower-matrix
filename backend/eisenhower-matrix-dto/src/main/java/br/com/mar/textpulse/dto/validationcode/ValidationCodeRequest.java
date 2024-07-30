package br.com.mar.textpulse.dto.validationcode;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ValidationCodeRequest {

    @JsonProperty("email")
    private String email;

    @JsonProperty("code")
    private String code;

}

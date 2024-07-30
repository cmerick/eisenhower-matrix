package br.com.mar.textpulse.dto.audit;

import br.com.mar.textpulse.dto.users.enums.KeycloakUserTypeEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserLoginSearchRequest {

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("tp_user")
    private KeycloakUserTypeEnum userType;

    @JsonProperty("dateFrom")
    private LocalDateTime dateFrom;

    @JsonProperty("dateTo")
    private LocalDateTime dateTo;

}

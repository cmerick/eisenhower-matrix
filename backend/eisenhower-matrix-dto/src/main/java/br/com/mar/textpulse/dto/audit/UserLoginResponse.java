package br.com.mar.textpulse.dto.audit;

import br.com.mar.textpulse.dto.users.enums.KeycloakUserTypeEnum;
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
public class UserLoginResponse {

    @JsonProperty("id")
    private UUID id;

    @JsonProperty("userId")
    private String userId;

    @JsonProperty("date")
    private LocalDateTime date;

    @JsonProperty("ipOrigin")
    private String ipOrigin;

    @JsonProperty("userType")
    private KeycloakUserTypeEnum userType;

    @JsonProperty("userName")
    private String userName;

}
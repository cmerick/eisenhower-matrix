package br.com.mar.textpulse.dto.keycloak;

import br.com.mar.textpulse.dto.users.enums.KeycloakUserTypeEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KeycloakCreateUserRequest {

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("username")
    private String username;

    @JsonProperty("credential")
    private String credential;

    @JsonProperty("type")
    private KeycloakUserTypeEnum type;

}

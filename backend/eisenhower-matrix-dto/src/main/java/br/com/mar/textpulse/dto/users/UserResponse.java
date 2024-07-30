package br.com.mar.textpulse.dto.users;

import br.com.mar.textpulse.dto.users.enums.KeycloakUserTypeEnum;
import br.com.mar.textpulse.dto.users.enums.PasswordStatusEnum;
import br.com.mar.textpulse.dto.users.enums.UserStatusEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponse {

    @JsonProperty("id")
    private UUID id;

    @JsonProperty("keycloakId")
    private UUID keycloakId;

    @JsonProperty("email")
    private String email;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("type")
    private KeycloakUserTypeEnum type;

    @JsonProperty("status")
    private UserStatusEnum status;

    @JsonProperty("passwordStatus")
    private PasswordStatusEnum passwordStatus;

}

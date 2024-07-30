package br.com.mar.textpulse.dto.users;

import br.com.mar.textpulse.dto.users.enums.PasswordStatusEnum;
import br.com.mar.textpulse.dto.users.enums.UserStatusEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEmpresaResponse {

    @JsonProperty("id")
    private UUID id;

    @JsonProperty("email")
    private String email;

    @Column(name = "keycloak_id", nullable = false)
    private UUID keycloakId;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("idEmpresa")
    private UUID idEmpresa;

    @JsonProperty("passwordStatus")
    private PasswordStatusEnum passwordStatus;

    @JsonProperty("status")
    private UserStatusEnum status;

    @JsonProperty("groupIds")
    private Collection<UUID> groupIds;

}

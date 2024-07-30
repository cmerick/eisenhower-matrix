package br.com.mar.textpulse.dto.users;

import br.com.mar.textpulse.dto.common.enums.SimpleStatusEnum;
import br.com.mar.textpulse.dto.users.enums.UserStatusEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class UserEmpresaMeResponse {
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

    @JsonProperty("status")
    private UserStatusEnum status;

    @JsonProperty("groups")
    private Collection<UserGroupResponse> groups;
}

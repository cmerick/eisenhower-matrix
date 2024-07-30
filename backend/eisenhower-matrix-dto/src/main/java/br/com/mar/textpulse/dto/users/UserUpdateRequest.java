package br.com.mar.textpulse.dto.users;

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
public class UserUpdateRequest {

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("credential")
    private String credential;

    @JsonProperty("temporaryCredential")
    private boolean temporaryCredential;

    @JsonProperty("groupIds")
    private Collection<UUID> groupIds;
}

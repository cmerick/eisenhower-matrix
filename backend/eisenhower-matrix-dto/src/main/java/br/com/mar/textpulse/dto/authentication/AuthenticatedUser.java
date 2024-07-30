package br.com.mar.textpulse.dto.authentication;

import lombok.*;
import org.keycloak.representations.UserInfo;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthenticatedUser {

    private UserInfo info;

    private String tokenType;

    private String accessToken;

    private String realm;

    private String clientId;

    private KeycloakApplicationAttributes applicationAttributes;

    public UUID getSub() {
        if (null != this.info) {
            return UUID.fromString(this.info.getSub());
        }
        return null;
    }
}

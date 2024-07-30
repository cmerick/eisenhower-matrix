package br.com.mar.textpulse.dto.authentication;

import br.com.mar.textpulse.dto.users.UserGroupResponse;
import br.com.mar.textpulse.dto.users.enums.KeycloakUserTypeEnum;
import br.com.mar.textpulse.dto.users.enums.PasswordStatusEnum;
import br.com.mar.textpulse.dto.users.enums.UserStatusEnum;

import java.util.Collection;
import java.util.UUID;

public interface AuthenticateUserResponse {

    UUID getId();

    UUID getKeycloakId();

    String getEmail();

    String getFirstName();

    String getLastName();

    KeycloakUserTypeEnum getType();

    UserStatusEnum getStatus();

    PasswordStatusEnum getPasswordStatus();

    Collection<UserGroupResponse> getGroups();

}

package br.com.mar.textpulse.dto.keycloak;

import feign.form.FormProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RefreshTokenRequest {

    @FormProperty("client_id")
    private String clientId;

    @FormProperty("refresh_token")
    private String refreshToken;

    @FormProperty("grant_type")
    private final String grantType = "refresh_token";

}

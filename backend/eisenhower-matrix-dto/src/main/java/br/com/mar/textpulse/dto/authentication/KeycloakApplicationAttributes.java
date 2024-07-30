package br.com.mar.textpulse.dto.authentication;

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
public class KeycloakApplicationAttributes {

    @JsonProperty("type")
    private KeycloakUserTypeEnum type;

}

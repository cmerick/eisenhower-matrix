package com.cmerick.eisenhower_matrix.rest.dtos.authentication;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class AuthenticationRequestDto {

    @JsonProperty("userName")
    private String userName;

    @JsonProperty("password")
    private String password;

}

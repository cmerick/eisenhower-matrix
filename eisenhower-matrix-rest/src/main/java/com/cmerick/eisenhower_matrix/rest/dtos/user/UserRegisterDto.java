package com.cmerick.eisenhower_matrix.rest.dtos.user;

import com.cmerick.eisenhower_matrix.rest.enums.UserRoleEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRegisterDto {

    @JsonProperty("userName")
    private String userName;

    @JsonProperty("password")
    private String password;

    @JsonProperty("role")
    private UserRoleEnum role;

}

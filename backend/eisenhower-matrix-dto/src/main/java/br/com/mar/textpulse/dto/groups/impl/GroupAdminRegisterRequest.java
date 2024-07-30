package br.com.mar.textpulse.dto.groups.impl;

import br.com.mar.textpulse.dto.groups.abstraction.GroupRegisterRequest;
import br.com.mar.textpulse.dto.groups.enums.GroupType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GroupAdminRegisterRequest implements GroupRegisterRequest {

    @JsonIgnore
    private final GroupType type = GroupType.ADMIN;

    @JsonProperty("name")
    private String name;

    @JsonProperty("roles")
    private Collection<String> roles;

}

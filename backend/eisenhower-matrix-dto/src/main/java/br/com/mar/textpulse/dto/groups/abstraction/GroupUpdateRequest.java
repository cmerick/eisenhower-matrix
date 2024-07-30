package br.com.mar.textpulse.dto.groups.abstraction;

import br.com.mar.textpulse.dto.groups.enums.GroupType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collection;

public interface GroupUpdateRequest {

    @JsonProperty("name")
    String getName();

    @JsonProperty("roles")
    Collection<String> getRoles();

    @JsonIgnore
    GroupType getType();

}

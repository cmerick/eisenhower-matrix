package br.com.mar.textpulse.dto.groups;

import br.com.mar.textpulse.dto.groups.enums.GroupType;
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
public class GroupResponse {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("roles")
    private Collection<String> roles;

    @JsonProperty("type")
    private GroupType type;

}

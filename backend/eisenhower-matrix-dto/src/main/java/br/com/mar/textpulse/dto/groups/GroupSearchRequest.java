package br.com.mar.textpulse.dto.groups;

import br.com.mar.textpulse.dto.groups.enums.GroupType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GroupSearchRequest {

    private String search;

    private GroupType type;

}

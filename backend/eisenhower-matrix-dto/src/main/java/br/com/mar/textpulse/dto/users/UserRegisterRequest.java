package br.com.mar.textpulse.dto.users;

import br.com.mar.textpulse.dto.common.enums.TipoDocumentoEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRegisterRequest {
    @JsonProperty("email")
    private String email;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("groupIds")
    private Collection<UUID> groupIds;

    @JsonProperty("tipoDocumento")
    private TipoDocumentoEnum tipoDocumento;

    @JsonProperty("idCategoria")
    private Long idCategoria;

    @JsonProperty("documento")
    private String documento;

    @JsonProperty("telefone")
    private String telefone;

}

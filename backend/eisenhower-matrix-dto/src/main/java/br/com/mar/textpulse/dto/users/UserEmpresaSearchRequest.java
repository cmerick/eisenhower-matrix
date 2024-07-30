package br.com.mar.textpulse.dto.users;

import br.com.mar.textpulse.dto.users.enums.UserStatusEnum;
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
public class UserEmpresaSearchRequest {

    private String firstName;

    private String lastName;

    private String email;

    private UUID idEmpresa;

    private UserStatusEnum status;

    private Collection<UUID> inIds;

}

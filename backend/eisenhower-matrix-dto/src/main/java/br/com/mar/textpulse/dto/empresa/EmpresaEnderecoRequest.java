package br.com.mar.textpulse.dto.empresa;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmpresaEnderecoRequest {

    @JsonProperty("idEmpresa")
    private UUID idEmpresa;

}

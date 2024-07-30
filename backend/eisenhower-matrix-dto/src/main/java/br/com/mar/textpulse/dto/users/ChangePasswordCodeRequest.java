package br.com.mar.textpulse.dto.users;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChangePasswordCodeRequest {

	private String email;

	private String code;

	private String password;

	private String confirmPassword;

}

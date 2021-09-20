package br.com.alura.carteira.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UsuarioFormDto {

	@NotNull
	@NotEmpty
	private String nome;
	@NotBlank
	@NotEmpty
	private String login;
	@NotBlank
	@NotEmpty
	private String senha;

}

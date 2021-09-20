package br.com.alura.carteira.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import br.com.alura.carteira.modelo.TipoTransacao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class TransacaoFormDto {

	@NotNull
	@NotEmpty
	@Size(min = 5, max = 6)
	private String ticker;
	
	@NotNull
	@DecimalMin("0.1")
	private BigDecimal preco;
	
	@NotNull
	@DecimalMin("1")
	private int quantidade;
	
	@PastOrPresent
	private LocalDate data;
	
	@NotNull
	private TipoTransacao tipo;

}

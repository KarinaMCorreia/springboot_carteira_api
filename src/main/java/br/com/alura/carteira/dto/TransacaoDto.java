package br.com.alura.carteira.dto;

import java.math.BigDecimal;

import br.com.alura.carteira.modelo.TipoTransacao;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TransacaoDto {

	
	private String ticker;
	private BigDecimal preco;
	private int quantidade;
	private TipoTransacao tipo;

}

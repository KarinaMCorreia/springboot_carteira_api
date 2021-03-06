
package br.com.alura.carteira.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Transacao {

	private String ticker;
	private BigDecimal preco;
	private int quantidade;
	private LocalDate data;
	private TipoTransacao tipo;

}

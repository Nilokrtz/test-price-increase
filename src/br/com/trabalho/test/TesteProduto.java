package br.com.trabalho.test;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.trabalho.modelo.Aumento;
import br.com.trabalho.modelo.Produto;
import br.com.trabalho.services.AumentoProduto;
import br.com.trabalho.services.AutorizacaoProduto;

public class TesteProduto {
	
	// Aqui é onde o projeto é rodado, além de fazer o teste JUnit
	
	@Test
	public void cotacaoAprovadaProduto() {
		
		Produto p = new Produto("Cerveja", new BigDecimal("1"), new BigDecimal("100.00"),new BigDecimal("300.00"), new BigDecimal("100.00"), "CONCEDIDA");
		AumentoProduto a = new AumentoProduto();
		AutorizacaoProduto autorizacao = new AutorizacaoProduto();
		try{
			autorizacao.cotacaoProduto(p);
		}
		catch(Exception e){
			
		}
		
		//Confirmação do teste Junit, atualização do estoque e aplicação do aumento percentual
		
		p.Update();
		a.aumento(p, Aumento.CINQUENTAPORCENTO);
		Assertions.assertEquals(new BigDecimal("150.00"),p.getPreco());
		Assertions.assertEquals(new BigDecimal("200.00"),p.getEstoque());
		
	}
}
	

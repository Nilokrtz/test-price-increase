package br.com.trabalho.services;

import java.math.BigDecimal;

import br.com.trabalho.modelo.Aumento;
import br.com.trabalho.modelo.Produto;

public class AumentoProduto {
	
	//Lógica dos métodos de Aumento dos produtos 
	
	public void aumento(Produto p, Aumento a) {
		if(a == Aumento.DEZPORCENTO){
			BigDecimal aumento10 = p.getPreco().multiply(new BigDecimal("0.10"));
			p.Aumento10(aumento10);
		}
		else if(a == Aumento.VINTECINCOPORCENTO){
			BigDecimal aumento25 = p.getPreco().multiply(new BigDecimal("0.25"));
			p.Aumento25(aumento25);
		}
		else if(a == Aumento.CINQUENTAPORCENTO){
			BigDecimal aumento50 = p.getPreco().multiply(new BigDecimal("0.50"));
			p.Aumento50(aumento50);
		}
	}
}

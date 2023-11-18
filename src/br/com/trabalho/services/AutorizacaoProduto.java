package br.com.trabalho.services;

import br.com.trabalho.modelo.Produto;

public class AutorizacaoProduto {

public void cotacaoProduto(Produto p) {
		
	//Método para ver se o produto foi autorizado ou não
	
		if(p.getAutorizacao() == "CONCEDIDA") {
			System.out.println("Autorização concedida");
		}
		else if(p.getAutorizacao() == "NEGADA") {
			System.out.println("Autorização negada");
		}
		else{
			System.out.println("O produto não pode ser encontrado em nosso estoque");
		}
	}
}

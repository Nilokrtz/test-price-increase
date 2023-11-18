package br.com.trabalho.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Produto {
	
	//Definindo as variáveis e métodos que serão utilizados
	
	String NomeProduto;
	BigDecimal numeroProduto;
	BigDecimal preco;
	BigDecimal estoque;
	BigDecimal quantidadeDeVendas;
	String autorizacao;
	
	public Produto(String nomeProduto, BigDecimal numeroProduto, BigDecimal preco, BigDecimal estoque,
			BigDecimal quantidadeDeVendas, String autorizacao) {
		super();
		NomeProduto = nomeProduto;
		this.numeroProduto = numeroProduto;
		this.preco = preco;
		this.estoque = estoque;
		this.quantidadeDeVendas = quantidadeDeVendas;
		this.autorizacao = autorizacao;
	}
	public String getNomeProduto() {
		return NomeProduto;
	}
	public String getAutorizacao() {
		return autorizacao;
	}
	public void setAutorizacao(String autorizacao) {
		this.autorizacao = autorizacao;
	}
	public void setNomeProduto(String nomeProduto) {
		NomeProduto = nomeProduto;
	}
	public BigDecimal getNumeroProduto() {
		return numeroProduto;
	}
	public void setNumeroProduto(BigDecimal numeroProduto) {
		this.numeroProduto = numeroProduto;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public BigDecimal getEstoque() {
		return estoque;
	}
	public void setEstoque(BigDecimal estoque) {
		this.estoque = estoque;
	}
	public BigDecimal getQuantidadeDeVendas() {
		return quantidadeDeVendas;
	}
	public void setQuantidadeDeVendas(BigDecimal quantidadeDeVendas) {
		this.quantidadeDeVendas = quantidadeDeVendas;
	}
	
	// Definindo os métodos de aumento
	
	public void Aumento10(BigDecimal aumento10) {
		this.preco = this.preco.add(aumento10).setScale(2,RoundingMode.HALF_UP);
	}
	public void Aumento25(BigDecimal aumento25) {
		this.preco = this.preco.add(aumento25).setScale(2,RoundingMode.HALF_UP);
	}
	public void Aumento50(BigDecimal aumento50) {
		this.preco = this.preco.add(aumento50).setScale(2,RoundingMode.HALF_UP);
	}
	
	//Atualizando o estoque após a compra de um produto
	
	public void Update() {
		BigDecimal atualizar = this.getEstoque().subtract(this.getQuantidadeDeVendas());
		this.estoque = atualizar;
		
	}
}

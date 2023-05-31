package br.com.fiap.kraftHeinz.targetManagement.model;

public class ProdutoModel {

	private String idProduto;
	private String nomeProduto;
	private Boolean embalagemReciclavel;
	private Integer diasValidade;
	
	public ProdutoModel() {
		
	}
	
	public ProdutoModel(String idProduto, String nomeProduto, Boolean embalagemReciclavel, Integer diasValidade) {
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.embalagemReciclavel = embalagemReciclavel;
		this.diasValidade = diasValidade;
	}

	public String getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Boolean getEmbalagemReciclavel() {
		return embalagemReciclavel;
	}

	public void setEmbalagemReciclavel(Boolean embalagemReciclavel) {
		this.embalagemReciclavel = embalagemReciclavel;
	}

	public Integer getDiasValidade() {
		return diasValidade;
	}

	public void setDiasValidade(Integer diasValidade) {
		this.diasValidade = diasValidade;
	}
	
	@Override
	public String toString() {
		return "ProdutoModel [idProduto=" + idProduto + ", nomeProduto=" + nomeProduto + ", embalagemReciclavel="
				+ embalagemReciclavel + ", diasValidade=" + diasValidade + "]";
	}
	
}

package br.com.fiap.kraftHeinz.targetManagement.model;

public class FabricaProdutoModel {
	private String	idFabrica;
	private String idProduto;
	
	public FabricaProdutoModel() {
		
	}
	
	public FabricaProdutoModel(String idFabrica, String idProduto) {
		super();
		this.idFabrica = idFabrica;
		this.idProduto = idProduto;
	}

	public String getIdFabrica() {
		return idFabrica;
	}

	public void setIdFabrica(String idFabrica) {
		this.idFabrica = idFabrica;
	}

	public String getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}

	@Override
	public String toString() {
		return "FabricaProdutoModel [idFabrica=" + idFabrica + ", idProduto=" + idProduto + "]";
	}	
}

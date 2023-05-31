package br.com.fiap.kraftHeinz.targetManagement.model;

public class FornecimentoModel {

	private String idFornecedor;
	private String idIngrediente;
	private Boolean codigoOrganico;
	
	public FornecimentoModel() {
		
	}
	
	public FornecimentoModel(String idFornecedor, String idIngrediente, Boolean codigoOrganico) {
		super();
		this.idFornecedor = idFornecedor;
		this.idIngrediente = idIngrediente;
		this.codigoOrganico = codigoOrganico;
	}

	public String getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(String idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getIdIngrediente() {
		return idIngrediente;
	}

	public void setIdIngrediente(String idIngrediente) {
		this.idIngrediente = idIngrediente;
	}

	public Boolean getCodigoOrganico() {
		return codigoOrganico;
	}

	public void setCodigoOrganico(Boolean codigoOrganico) {
		this.codigoOrganico = codigoOrganico;
	}

	@Override
	public String toString() {
		return "FornecimentoModel [idFornecedor=" + idFornecedor + ", idIngrediente=" + idIngrediente
				+ ", codigoOrganico=" + codigoOrganico + "]";
	}
	
}

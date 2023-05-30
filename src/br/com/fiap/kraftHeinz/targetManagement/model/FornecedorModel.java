package br.com.fiap.kraftHeinz.targetManagement.model;

public class FornecedorModel {
	
	private String idFornecedor;
	private String nomeFornecedor;
	private String tipoTransporte;
	private Boolean frotaSustentavel;
	private String nomeCidade;
	
	public FornecedorModel() {
		
	}
	
	public FornecedorModel(String idFornecedor, String nomeFornecedor, String tipoTransporte, Boolean frotaSustentavel,
			String nomeCidade) {
		super();
		this.idFornecedor = idFornecedor;
		this.nomeFornecedor = nomeFornecedor;
		this.tipoTransporte = tipoTransporte;
		this.frotaSustentavel = frotaSustentavel;
		this.nomeCidade = nomeCidade;
	}
	
	public String getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(String idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

	public String getTipoTransporte() {
		return tipoTransporte;
	}

	public void setTipoTransporte(String tipoTransporte) {
		this.tipoTransporte = tipoTransporte;
	}

	public Boolean getFrotaSustentavel() {
		return frotaSustentavel;
	}

	public void setFrotaSustentavel(Boolean frotaSustentavel) {
		this.frotaSustentavel = frotaSustentavel;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	@Override
	public String toString() {
		return "FornecedorModel [idFornecedor=" + idFornecedor + ", nomeFornecedor=" + nomeFornecedor
				+ ", tipoTransporte=" + tipoTransporte + ", frotaSustentavel=" + frotaSustentavel + ", nomeCidade="
				+ nomeCidade + "]";
	}
	
	
}

package br.com.fiap.kraftHeinz.targetManagement.model;

public class ReceitaModel {
	
	private String idReceita;
	private String idProduto;
	private String idIngrediente;
	private Integer volumeIngrediente;
	private String codigoUnidadeMedida;
	
	public ReceitaModel() {
	}
	
	public ReceitaModel(String idReceita, String idProduto, String idIngrediente, Integer volumeIngrediente,
			String codigoUnidadeMedida) {
		super();
		this.idReceita = idReceita;
		this.idProduto = idProduto;
		this.idIngrediente = idIngrediente;
		this.volumeIngrediente = volumeIngrediente;
		this.codigoUnidadeMedida = codigoUnidadeMedida;
	}

	public String getIdReceita() {
		return idReceita;
	}

	public void setIdReceita(String idReceita) {
		this.idReceita = idReceita;
	}

	public String getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}

	public String getIdIngrediente() {
		return idIngrediente;
	}

	public void setIdIngrediente(String idIngrediente) {
		this.idIngrediente = idIngrediente;
	}

	public Integer getVolumeIngrediente() {
		return volumeIngrediente;
	}

	public void setVolumeIngrediente(Integer volumeIngrediente) {
		this.volumeIngrediente = volumeIngrediente;
	}

	public String getCodigoUnidadeMedida() {
		return codigoUnidadeMedida;
	}

	public void setCodigoUnidadeMedida(String codigoUnidadeMedida) {
		this.codigoUnidadeMedida = codigoUnidadeMedida;
	}

	@Override
	public String toString() {
		return "ReceitaModel [idReceita=" + idReceita + ", idProduto=" + idProduto + ", idIngrediente=" + idIngrediente
				+ ", volumeIngrediente=" + volumeIngrediente + ", codigoUnidadeMedida=" + codigoUnidadeMedida + "]";
	}
	
}

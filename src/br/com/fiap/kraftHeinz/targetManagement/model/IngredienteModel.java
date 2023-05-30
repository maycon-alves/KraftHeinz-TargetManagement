package br.com.fiap.kraftHeinz.targetManagement.model;

public class IngredienteModel {

	private String idIngrediente;
	private String nomeIngrediente;
	private Integer impactoAmbiental;
	
	public IngredienteModel() {

	}
	
	public IngredienteModel(String idIngrediente, String nomeIngrediente, Integer impactoAmbiental) {
		this.idIngrediente = idIngrediente;
		this.nomeIngrediente = nomeIngrediente;
		this.impactoAmbiental = impactoAmbiental;
	}

	public String getIdIngrediente() {
		return idIngrediente;
	}

	public void setIdIngrediente(String idIngrediente) {
		this.idIngrediente = idIngrediente;
	}

	public String getNomeIngrediente() {
		return nomeIngrediente;
	}

	public void setNomeIngrediente(String nomeIngrediente) {
		this.nomeIngrediente = nomeIngrediente;
	}

	public Integer getImpactoAmbiental() {
		return impactoAmbiental;
	}

	public void setImpactoAmbiental(Integer impactoAmbiental) {
		this.impactoAmbiental = impactoAmbiental;
	}

	@Override
	public String toString() {
		return "IngredienteModel [idIngrediente=" + idIngrediente + ", nomeIngrediente=" + nomeIngrediente
				+ ", impactoAmbiental=" + impactoAmbiental + "]";
	}
	
	
	
}

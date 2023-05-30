package br.com.fiap.kraftHeinz.targetManagement.model;

public class FabricaModel {
	
	private String idFabrica;
	private String nmCidadeFabrica;
	private String nomeFabrica;
	private Boolean cdFabricaSustentavel;
	private Boolean cdAguaReuso;
	private Boolean cdEnergiaSustentavel;
	
	public FabricaModel() {
		
	}
	
	public FabricaModel(String idFabrica, String nmCidadeFabrica, String nomeFabrica, Boolean cdFabricaSustentavel,Boolean cdAguaReuso,Boolean cdEnergiaSustentavel) {
		this.idFabrica = idFabrica;
		this.nmCidadeFabrica = nmCidadeFabrica;
		this.nomeFabrica = nomeFabrica;
		this.cdFabricaSustentavel = cdFabricaSustentavel;
		this.cdAguaReuso = cdAguaReuso;
		this.cdEnergiaSustentavel = cdEnergiaSustentavel;
	}

	public String getIdFabrica() {
		return idFabrica;
	}

	public void setIdFabrica(String idFabrica) {
		this.idFabrica = idFabrica;
	}

	public String getNmCidadeFabrica() {
		return nmCidadeFabrica;
	}

	public void setNmCidadeFabrica(String nmCidadeFabrica) {
		this.nmCidadeFabrica = nmCidadeFabrica;
	}

	public String getNomeFabrica() {
		return nomeFabrica;
	}

	public void setNomeFabrica(String nomeFabrica) {
		this.nomeFabrica = nomeFabrica;
	}
	
	public Boolean getCdFabricaSustentavel() {
		return cdFabricaSustentavel;
	}

	public void setCdFabricaSustentavel(Boolean cdFabricaSustentavel) {
		this.cdFabricaSustentavel = cdFabricaSustentavel;
	}

	public Boolean getCdAguaReuso() {
		return cdAguaReuso;
	}

	public void setCdAguaReuso(Boolean cdAguaReuso) {
		this.cdAguaReuso = cdAguaReuso;
	}

	public Boolean getCdEnergiaSustentavel() {
		return cdEnergiaSustentavel;
	}

	public void setCdEnergiaSustentavel(Boolean cdEnergiaSustentavel) {
		this.cdEnergiaSustentavel = cdEnergiaSustentavel;
	}

	@Override
	public String toString() {
		return "FabricaModel [idFabrica=" + idFabrica + ", nmCidadeFabrica=" + nmCidadeFabrica + ", nomeFabrica="
				+ nomeFabrica + ", cdFabricaSustentavel=" + cdFabricaSustentavel + ", cdAguaReuso=" + cdAguaReuso
				+ ", cdEnergiaSustentavel=" + cdEnergiaSustentavel + "]";
	}

	
	
	
	
}

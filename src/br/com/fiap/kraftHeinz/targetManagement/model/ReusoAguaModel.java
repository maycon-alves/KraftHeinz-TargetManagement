package br.com.fiap.kraftHeinz.targetManagement.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReusoAguaModel {

	private String idReuso;
	private Integer volumeReutilizado;
	private Date dataReuso;
	// private Fabrica idFabrica;
	
	public ReusoAguaModel() {
		
	}
	
	public ReusoAguaModel(String idReuso, Integer volumeReutilizado, Date dataReuso) {
		super();
		this.idReuso = idReuso;
		this.volumeReutilizado = volumeReutilizado;
		this.dataReuso = dataReuso;
		//this.idFabrica = idFabrica;
	}

	
	public String getIdReuso() {
		return idReuso;
	}




	public void setIdReuso(String idReuso) {
		this.idReuso = idReuso;
	}




	public Integer getVolumeReutilizado() {
		return volumeReutilizado;
	}




	public void setVolumeReutilizado(Integer volumeReutilizado) {
		this.volumeReutilizado = volumeReutilizado;
	}




	public Date getDataReuso() {
		return dataReuso;
	}

	public String getDataReusoSql() {
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = formato.format(dataReuso); 
		return strDate;
	}
	
	public void setDataReuso(Date dataReuso) {
		this.dataReuso = dataReuso;
	}

	/*
	 * public Fabrica getidFabrica() { return idFabrica; }
	 */
	/*
	 * public void setidFabrica(Fabrica ifFabrica) { this.idFabrica = idFabrica; }
	 */


	@Override
	public String toString() {
		return "ReusoAguaModel [idReuso=" + idReuso + ", volumeReutilizado=" + volumeReutilizado + ", dataReuso="
				+ dataReuso + "]";
	}
	
	
	
}



package br.com.fiap.kraftHeinz.targetManagement.model;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class MetaChallengeModel {

	private String idMeta;
	private String descricaoMeta;
	private Date dataPrazo;
	private Boolean codigoMetaDone;

	public MetaChallengeModel() {

	}

	public MetaChallengeModel(String idMeta, String descricaoMeta, Date dataPrazo, Boolean codigoMetaDone) {
		this.idMeta = idMeta;
		this.descricaoMeta = descricaoMeta;
		this.dataPrazo = dataPrazo;
		this.codigoMetaDone = codigoMetaDone;
	}

	public String getIdMeta() {
		return idMeta;
	}

	public void setIdMeta(String idMeta) {
		this.idMeta = idMeta;
	}

	public String getDescricaoMeta() {
		return descricaoMeta;
	}

	public void setDescricaoMeta(String descricaoMeta) {
		this.descricaoMeta = descricaoMeta;
	}

	public Date getDataPrazo() {
		return dataPrazo;
	}
	
	public String getDataPrazoSql() {
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = formato.format(dataPrazo); 
		return strDate;
	}
	
	public void setDataPrazo(Date dataPrazo) {
		this.dataPrazo = dataPrazo;
	}

	public Boolean getCodigoMetaDone() {
		return codigoMetaDone;
	}

	public void setCodigoMetaDone(Boolean codigoMetaDone) {
		this.codigoMetaDone = codigoMetaDone;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		return "MetaChallengeModel [idMeta=" + idMeta + ", descricaoMeta=" + descricaoMeta + ", dataPrazo=" + formato.format(dataPrazo)
				+ ", codigoMetaDone=" + codigoMetaDone + "]";
	}

}

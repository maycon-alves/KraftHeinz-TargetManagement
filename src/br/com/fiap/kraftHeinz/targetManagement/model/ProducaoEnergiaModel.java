package br.com.fiap.kraftHeinz.targetManagement.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProducaoEnergiaModel {

	private String idProducao;
	private Integer quantidadeWatts;
	private Date dataProducao;
	private FabricaModel fabrica;

	public ProducaoEnergiaModel() {

	}

	public ProducaoEnergiaModel(String idProducao, Integer quantidadeWatts, Date dataProducao, FabricaModel fabrica) {
		this.idProducao = idProducao;
		this.quantidadeWatts = quantidadeWatts;
		this.dataProducao = dataProducao;
		this.fabrica = fabrica;
	}

	public String getIdProducao() {
		return idProducao;
	}

	public void setIdProducao(String idProducao) {
		this.idProducao = idProducao;
	}

	public Integer getQuantidadeWatts() {
		return quantidadeWatts;
	}

	public void setQuantidadeWatts(Integer quantidadeWatts) {
		this.quantidadeWatts = quantidadeWatts;
	}

	public Date getDataProducao() {
		return dataProducao;
	}

	public String getDataProducaoSql() {
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = formato.format(dataProducao);
		return strDate;
	}

	public void setDataProducao(Date dataProducao) {
		this.dataProducao = dataProducao;
	}

	public FabricaModel getFabrica() {
		return fabrica;
	}

	public void setFabrica(FabricaModel fabrica) {
		this.fabrica = fabrica;
	}

	public void setFabricaId(String idFabrica) {
		FabricaModel fabrica = new FabricaModel();
		fabrica.setIdFabrica(idFabrica);
		this.fabrica = fabrica;
	}
	
	@Override
	public String toString() {
		return "ProducaoEnergiaModel [idProducao=" + idProducao + ", quantidadeWatts=" + quantidadeWatts
				+ ", dataProducao=" + dataProducao + "]";
	}

}

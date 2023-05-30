package br.com.fiap.kraftHeinz.targetManagement.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LoteModel {

	private String idLote;
	private FabricaModel fabrica;
	private ProdutoModel produto;
	private Integer quantidadeProduto;
	private Integer quantidadeDoada;
	private Date dataProducaoLote;
	private Integer quantidadeAguaGasto;
	private Integer quantidadeEnergiaGasto;

	public LoteModel() {

	}

	public LoteModel(String idLote, FabricaModel fabrica, Integer quantidadeProduto, Integer quantidadeDoada,
			Date dataProducaoLote, Integer quantidadeAguaGasto, Integer quantidadeEnergiaGasto) {
		super();
		this.idLote = idLote;
		this.fabrica = fabrica;
		this.quantidadeProduto = quantidadeProduto;
		this.quantidadeDoada = quantidadeDoada;
		this.dataProducaoLote = dataProducaoLote;
		this.quantidadeAguaGasto = quantidadeAguaGasto;
		this.quantidadeEnergiaGasto = quantidadeEnergiaGasto;
	}

	public String getIdLote() {
		return idLote;
	}

	public void setIdLote(String idLote) {
		this.idLote = idLote;
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

	public ProdutoModel getProduto() {
		return produto;
	}

	public void setProduto(ProdutoModel produto) {
		this.produto = produto;
	}

	public void setProdutoId(String idProduto) {
		ProdutoModel produto = new ProdutoModel();
		produto.setIdProduto(idProduto);
		this.produto = produto;
	}

	public Date getDataProducaoLote() {
		return dataProducaoLote;
	}

	public String getDataProducaoLoteSql() {
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = formato.format(dataProducaoLote);
		return strDate;
	}

	public void setDataProducaoLote(Date dataProducaoLote) {
		this.dataProducaoLote = dataProducaoLote;
	}

	public Integer getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(Integer quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public Integer getQuantidadeDoada() {
		return quantidadeDoada;
	}

	public void setQuantidadeDoada(Integer quantidadeDoada) {
		this.quantidadeDoada = quantidadeDoada;
	}

	public void setDataProducao(Date dataProducao) {
		this.dataProducaoLote = dataProducao;
	}

	public Integer getQuantidadeAguaGasto() {
		return quantidadeAguaGasto;
	}

	public void setQuantidadeAguaGasto(Integer quantidadeAguaGasto) {
		this.quantidadeAguaGasto = quantidadeAguaGasto;
	}

	public Integer getQuantidadeEnergiaGasto() {
		return quantidadeEnergiaGasto;
	}

	public void setQuantidadeEnergiaGasto(Integer quantidadeEnergiaGasto) {
		this.quantidadeEnergiaGasto = quantidadeEnergiaGasto;
	}

	@Override
	public String toString() {
		return "LoteModel [idLote=" + idLote + ", fabrica=" + fabrica + ", quantidadeProduto=" + quantidadeProduto
				+ ", quantidadeDoada=" + quantidadeDoada + ", dataProducao=" + dataProducaoLote
				+ ", quantidadeAguaGasto=" + quantidadeAguaGasto + ", quantidadeEnergiaGasto=" + quantidadeEnergiaGasto
				+ "]";
	}

}

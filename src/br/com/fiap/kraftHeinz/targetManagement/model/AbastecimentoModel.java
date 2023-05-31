package br.com.fiap.kraftHeinz.targetManagement.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AbastecimentoModel {

	private String idFabricaAbastecimento;
	private String idFornecedorAbastecimento;
	private Date abastecimento;

	public AbastecimentoModel() {

	}

	public AbastecimentoModel(String idFabricaAbastecimento, String idFornecedorAbastecimento, Date abastecimento) {
		super();
		this.idFabricaAbastecimento = idFabricaAbastecimento;
		this.idFornecedorAbastecimento = idFornecedorAbastecimento;
		this.abastecimento = abastecimento;
	}

	public String getIdFabricaAbastecimento() {
		return idFabricaAbastecimento;
	}

	public void setIdFabricaAbastecimento(String idFabricaAbastecimento) {
		this.idFabricaAbastecimento = idFabricaAbastecimento;
	}

	public String getIdFornecedorAbastecimento() {
		return idFornecedorAbastecimento;
	}

	public void setIdFornecedorAbastecimento(String idFornecedorAbastecimento) {
		this.idFornecedorAbastecimento = idFornecedorAbastecimento;
	}

	public Date getAbastecimento() {
		return abastecimento;
	}
	
	public String getAbastecimentoSql() {
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = formato.format(abastecimento); 
		return strDate;
	}

	public void setAbastecimento(Date abastecimento) {
		this.abastecimento = abastecimento;
	}

	@Override
	public String toString() {
		return "AbastecimentoModel [idFabricaAbastecimento=" + idFabricaAbastecimento + ", idFornecedorAbastecimento="
				+ idFornecedorAbastecimento + ", abastecimento=" + abastecimento + "]";
	}

}

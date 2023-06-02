package br.com.fiap.kraftHeinz.targetManagement.teste;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.fiap.kraftHeinz.targetManagement.DAO.LoteDAO;
import br.com.fiap.kraftHeinz.targetManagement.DAO.ProdutoDAO;
import br.com.fiap.kraftHeinz.targetManagement.model.LoteModel;

public class ProdutoGastoAguaInsigthTeste {
	
	private List<LoteModel> loteList = new ArrayList<LoteModel>();
	private LoteDAO loteDAO = new LoteDAO();
	private ProdutoDAO produtoDAO = new ProdutoDAO();
	private LoteModel lote = null;
	private Integer maiorGasto = 0;
	private String nomeProduto = null;

	
	
	public String recuperaProdutoComMaiorGasto() throws SQLException {
		this.loteList = loteDAO.getAll();
		//System.out.println("Recuperado todos os lotes [TODOS]:\n" + loteDAO);

		
		for (int i = 0; i < loteList.size(); i++) {
			lote = new LoteModel(loteList.get(i));
			calculaGasto(lote);
		}
		return "O produto com maior gasto de agua em sua fabricação foi o [" + nomeProduto + "] com uma media de [" + maiorGasto + "] litros de agua por cada produto";
	}

	private void calculaGasto(LoteModel lote) throws SQLException {
		Integer agua = lote.getQuantidadeAguaGasto();
		Integer unidade = lote.getQuantidadeProduto();
		if ( agua/unidade > this.maiorGasto) {
			this.maiorGasto = agua/unidade;
			this.nomeProduto = produtoDAO.selectProductNameById(lote.getProduto().getIdProduto());
		}		
	}

	@Override
	public String toString() {
		return "ProdutoGastoAguaInsigthTeste [maiorGasto=" + maiorGasto + ", nomeProduto=" + nomeProduto + "]";
	}
	
	
	
}

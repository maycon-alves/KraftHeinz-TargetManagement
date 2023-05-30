package br.com.fiap.kraftHeinz.targetManagement.teste;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.fiap.kraftHeinz.targetManagement.DAO.FabricaDAO;
import br.com.fiap.kraftHeinz.targetManagement.DAO.FornecedorDAO;
import br.com.fiap.kraftHeinz.targetManagement.DAO.IngredienteDAO;
import br.com.fiap.kraftHeinz.targetManagement.DAO.LoteDAO;
import br.com.fiap.kraftHeinz.targetManagement.DAO.MetaChallengeDAO;
import br.com.fiap.kraftHeinz.targetManagement.DAO.ProducaoEnergiaDAO;
import br.com.fiap.kraftHeinz.targetManagement.DAO.ProdutoDAO;
import br.com.fiap.kraftHeinz.targetManagement.DAO.ReusoAguaDAO;
import br.com.fiap.kraftHeinz.targetManagement.DAO.TesteDAO;
import br.com.fiap.kraftHeinz.targetManagement.model.FabricaModel;
import br.com.fiap.kraftHeinz.targetManagement.model.FornecedorModel;
import br.com.fiap.kraftHeinz.targetManagement.model.IngredienteModel;
import br.com.fiap.kraftHeinz.targetManagement.model.LoteModel;
import br.com.fiap.kraftHeinz.targetManagement.model.MetaChallengeModel;
import br.com.fiap.kraftHeinz.targetManagement.model.ProducaoEnergiaModel;
import br.com.fiap.kraftHeinz.targetManagement.model.ProdutoModel;
import br.com.fiap.kraftHeinz.targetManagement.model.ReusoAguaModel;

public class TesteMain {

	public static void main(String[] args) throws ParseException, SQLException {
		/*
		 * bloco para formatação das datas
		 */
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd"); 
		
		/*
		 * bloco para a inicialização das DAOs
		 */
		TesteDAO testeDAO = new TesteDAO();
		MetaChallengeDAO metaDAO = new MetaChallengeDAO();
		FabricaDAO fabricaDAO = new FabricaDAO();
		ProducaoEnergiaDAO producaoDAO = new ProducaoEnergiaDAO();
		ReusoAguaDAO reusoDAO = new ReusoAguaDAO();
		FornecedorDAO fornecedorDAO = new FornecedorDAO();
		IngredienteDAO ingredienteDAO = new IngredienteDAO();
		ProdutoDAO produtoDAO = new ProdutoDAO();
		LoteDAO loteDAO = new LoteDAO();
		
		/*
		 * bloco para criação das Models
		 */
		Date dataMeta = formato.parse("2025-01-01");
		MetaChallengeModel meta = new MetaChallengeModel("meta-2", "concluir o desenvolvimento", dataMeta, false);
		
		FabricaModel fabrica = new FabricaModel("10","Brasília","Heinz",true,true,false);

		Date dataProducao = formato.parse("2023-05-27");
		ProducaoEnergiaModel producao = new ProducaoEnergiaModel("energia-1" , 150, dataProducao , fabrica);
		
		Date dataReuso = formato.parse("2023-05-27");
		ReusoAguaModel reuso = new ReusoAguaModel("reuso-1" , 500, dataReuso , fabrica);
		
		FornecedorModel fornecedor = new FornecedorModel("3" , "tomarilho", "caminhao", false, "Goiás");
		
		IngredienteModel ingrediente = new IngredienteModel("25", "Tomate", 2);
		
		ProdutoModel produto = new ProdutoModel("30", "Molho de Tomate", false, 365);
		
		Date dataProducaoLote = formato.parse("2023-05-27");
		LoteModel lote = new LoteModel("555", fabrica, produto, 1000, 100, dataProducaoLote, 1000, 300);
		/*
		 * bloco para execução dos comandos e instruções
		 */
		System.out.println(meta.toString());
		//metaDAO.insert(meta);
		//System.out.println("meta inserida com sucesso: " + meta.toString());
		System.out.println("\nRecuperado o registro [meta-2]:\n" + metaDAO.selectById("meta-2"));
		
		System.out.println(fabrica.toString());
		//fabricaDAO.insert(fabrica);
		System.out.println("\nRecuperado o registro [10]:\n" + fabricaDAO.selectById("10"));
		
		System.out.println(producao.toString());
		//producaoDAO.insert(producao);
		System.out.println("\nRecuperado o registro [energia-1]:\n" + producaoDAO.selectById("energia-1"));
		
		
		System.out.println(reuso.toString());
		//reusoDAO.insert(reuso);
		System.out.println("\nRecuperado o registro [reuso-1]:\n" + reusoDAO.selectById("reuso-1"));
		
		System.out.println(fornecedor.toString());
		//fornecedorDAO.insert(fornecedor);
		System.out.println("\nRecuperado o registro [3]:\n" + fornecedorDAO.selectById("3"));
		
		System.out.println(ingrediente.toString());
		//ingredienteDAO.insert(ingrediente);
		System.out.println("\nRecuperado o registro [25]:\n" + ingredienteDAO.selectById("25"));
		
		System.out.println(produto.toString());
		//produtoDAO.insert(produto);
		System.out.println("\nRecuperado o registro [30]:\n" + produtoDAO.selectById("30"));
		
		System.out.println(lote.toString());
		//loteDAO.insert(lote);
		System.out.println("\nRecuperado o registro [555]:\n" + loteDAO.selectById("555"));
	}

}

package br.com.fiap.kraftHeinz.targetManagement.teste;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.fiap.kraftHeinz.targetManagement.DAO.MetaChallengeDAO;
import br.com.fiap.kraftHeinz.targetManagement.DAO.ProducaoEnergiaDAO;
import br.com.fiap.kraftHeinz.targetManagement.DAO.ReusoAguaDAO;
import br.com.fiap.kraftHeinz.targetManagement.DAO.TesteDAO;
import br.com.fiap.kraftHeinz.targetManagement.model.MetaChallengeModel;
import br.com.fiap.kraftHeinz.targetManagement.model.ProducaoEnergiaModel;
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
		ProducaoEnergiaDAO producaoDAO = new ProducaoEnergiaDAO();
		ReusoAguaDAO reusoDAO = new ReusoAguaDAO();
		
		/*
		 * bloco para criação das Models
		 */
		Date dataMeta = formato.parse("2025-01-01");
		MetaChallengeModel meta = new MetaChallengeModel("meta-2", "concluir o desenvolvimento", dataMeta, false);
		Date dataProducao = formato.parse("2023-05-27");
		ProducaoEnergiaModel producao = new ProducaoEnergiaModel("energia-1" , 150, dataProducao /*,"10"*/);
		Date dataReuso = formato.parse("2023-05-27");
		ReusoAguaModel reuso = new ReusoAguaModel("reuso-1" , 500, dataReuso /*,"10"*/);
		
		/*
		 * bloco para execução dos comandos e instruções
		 */
		System.out.println(meta.toString());
		//metaDAO.insert(meta);
		//System.out.println("meta inserida com sucesso: " + meta.toString());
		System.out.println("\nRecuperado o registro " + "meta-2:\n" + metaDAO.selectById("meta-2"));
		
		
		System.out.println(producao.toString());
		producaoDAO.insert(producao);
		System.out.println("\nRecuperado o registro " + "energia-1:\n" + producaoDAO.selectById("energia-1"));
		
		
		System.out.println(reuso.toString());
		reusoDAO.insert(reuso);
		System.out.println("\nRecuperado o registro " + "reuso-1:\n" + reusoDAO.selectById("reuso-1"));
		
	}

}

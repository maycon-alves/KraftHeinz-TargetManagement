package br.com.fiap.kraftHeinz.targetManagement.teste;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.fiap.kraftHeinz.targetManagement.model.MetaChallengeModel;
import br.com.fiap.kreftHeinz.targetManagement.DAO.MetaChallengeDAO;
import br.com.fiap.kreftHeinz.targetManagement.DAO.TesteDAO;

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
		
		
		/*
		 * bloco para criação das Models
		 */
		Date data = formato.parse("2025-01-01");
		MetaChallengeModel meta = new MetaChallengeModel("meta-2", "concluir o desenvolvimento", data, false);
		
		/*
		 * bloco para execução dos comandos e instruções
		 */
		System.out.println(meta.toString());
		metaDAO.insert(meta);
		System.out.println("meta inserida com sucesso: " + meta.toString());
		
	}

}

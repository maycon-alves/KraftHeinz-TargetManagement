package br.com.fiap.kreftHeinz.targetManagement.DAO;

import java.sql.Connection;

import br.com.fiap.kreftHeinz.targetManagement.factory.ConnectionFactory;

public class TesteDAO {
	private Connection conexao;

	public TesteDAO() {
		this.conexao = new ConnectionFactory().conectar();
		System.out.println("Conectou!");
	}
}

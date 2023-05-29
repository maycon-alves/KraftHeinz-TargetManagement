package br.com.fiap.kraftHeinz.targetManagement.DAO;

import java.sql.Connection;

import br.com.fiap.kraftHeinz.targetManagement.factory.ConnectionFactory;

public class TesteDAO {
	private Connection conexao;

	public TesteDAO() {
		this.conexao = new ConnectionFactory().conectar();
		System.out.println("Conectou!");
	}
}

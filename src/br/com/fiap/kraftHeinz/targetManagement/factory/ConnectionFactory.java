package br.com.fiap.kraftHeinz.targetManagement.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private final String ORACLE = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	
	public Connection conectar() {
		try {
			return DriverManager.getConnection(ORACLE, "RM", "SENHA");
		} catch (SQLException e) {
			System.out.println("Erro ao conectar na base de dados...");
			throw new RuntimeException(e);
		}
	}
	
}

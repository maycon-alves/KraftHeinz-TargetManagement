package br.com.fiap.kraftHeinz.targetManagement.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.kraftHeinz.targetManagement.factory.ConnectionFactory;
import br.com.fiap.kraftHeinz.targetManagement.model.FabricaModel;

public class FabricaDAO {
private Connection conexao;
	
	public FabricaDAO() {
		this.conexao = new ConnectionFactory().conectar();
	}
	
	public void insert(FabricaModel fabrica) throws SQLException{
		String sql = "INSERT INTO T_FABRICA (t_fabrica.id_fabrica, nm_cidade_fabrica,nm_fabrica,cd_fabrica_sustentavel,cd_agua_reuso,cd_energia_sustentavel)\r\n"
				+ "VALUES (?,?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1,fabrica.getIdFabrica());
		stmt.setString(2,fabrica.getNmCidadeFabrica());
		stmt.setString(3,fabrica.getNomeFabrica());
		stmt.setBoolean(4,fabrica.getCdFabricaSustentavel());
		stmt.setBoolean(5,fabrica.getCdAguaReuso());
		stmt.setBoolean(6,fabrica.getCdEnergiaSustentavel());
		
		stmt.execute();
		stmt.close();
		System.out.println("FABRICA - Inserida com sucesso.");
	}
	
	public FabricaModel selectById (String id) throws SQLException{
		FabricaModel fabrica = null;
		String sql = "SELECT * FROM T_FABRICA WHERE id_fabrica = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, id);
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			fabrica = new FabricaModel();
			fabrica.setIdFabrica(rs.getString("id_fabrica"));
			fabrica.setNmCidadeFabrica(rs.getString("nm_cidade_fabrica"));
			fabrica.setNomeFabrica(rs.getString("nm_fabrica"));
			fabrica.setCdFabricaSustentavel(rs.getBoolean("cd_fabrica_sustentavel"));
			fabrica.setCdAguaReuso(rs.getBoolean("cd_agua_reuso"));
			fabrica.setCdEnergiaSustentavel(rs.getBoolean("cd_energia_sustentavel"));
		}
		
		rs.close();
		stmt.close();
		return fabrica;
	}
}

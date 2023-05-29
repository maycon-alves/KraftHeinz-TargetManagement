package br.com.fiap.kraftHeinz.targetManagement.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.kraftHeinz.targetManagement.factory.ConnectionFactory;
import br.com.fiap.kraftHeinz.targetManagement.model.ProducaoEnergiaModel;

public class ProducaoEnergiaDAO {
	private Connection conexao;
	
	public ProducaoEnergiaDAO () {
		this.conexao = new ConnectionFactory().conectar();
	}
	
	public void insert(ProducaoEnergiaModel producao) throws SQLException{
		String sql = "INSERT INTO T_PRODUCAO_ENERGIA(t_producao_energia.id_producao_eng, qt_watts,dt_registro, t_producao_energia.fabrica_id_fabrica)\r\n"
				+ "VALUES (?,?,to_date(?, 'yyyy-mm-dd'), ?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1, producao.getIdProducao());
		stmt.setInt(2, producao.getQuantidadeWatts());
		stmt.setString(3, producao.getDataProducaoSql());
		stmt.setString(4,"10");
		
		stmt.execute();
		stmt.close();
		System.out.println("Inserido com sucesso.");
	}
	
	public ProducaoEnergiaModel selectById (String id) throws SQLException{
		ProducaoEnergiaModel producao = null;
		String sql = "SELECT * FROM T_PRODUCAO_ENERGIA WHERE id_producao_eng = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, id);
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			producao = new ProducaoEnergiaModel();
			producao.setIdProducao(rs.getString("id_producao_eng"));
			producao.setQuantidadeWatts(rs.getInt("qt_watts"));
			producao.setDataProducao(rs.getDate("dt_registro"));
		}
		
		rs.close();
		stmt.close();
		return producao;
		
	}
}

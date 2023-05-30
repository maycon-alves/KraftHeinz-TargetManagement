package br.com.fiap.kraftHeinz.targetManagement.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.kraftHeinz.targetManagement.factory.ConnectionFactory;
import br.com.fiap.kraftHeinz.targetManagement.model.ReusoAguaModel;

public class ReusoAguaDAO {
	private Connection conexao;
	
	public ReusoAguaDAO () {
		this.conexao = new ConnectionFactory().conectar();
	}
	
	public void insert(ReusoAguaModel reuso) throws SQLException{
		String sql = "INSERT INTO T_REUSO_AGUA (t_reuso_agua.id_reuso, vl_reutilizado,dt_registro, t_reuso_agua.fabrica_id_fabrica)\r\n"
				+ "VALUES (?, ?, to_date(?, 'yyyy-mm-dd'), ?);";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1, reuso.getIdReuso());
		stmt.setInt(2, reuso.getVolumeReutilizado());
		stmt.setString(3, reuso.getDataReusoSql());
		stmt.setString(4,"10");
		
		stmt.execute();
		stmt.close();
		System.out.println("Inserido com sucesso.");
	}
	
	public ReusoAguaModel selectById (String id) throws SQLException{
		ReusoAguaModel reuso = null;
		String sql = "SELECT * FROM T_REUSO_AGUA WHERE id_reuso = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, id);
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			reuso = new ReusoAguaModel();
			reuso.setIdReuso(rs.getString("id_reuso"));
			reuso.setVolumeReutilizado(rs.getInt("vl_reutilizado"));
			reuso.setDataReuso(rs.getDate("dt_registro"));
		}
		
		rs.close();
		stmt.close();
		return reuso;
		
	}
}

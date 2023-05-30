package br.com.fiap.kraftHeinz.targetManagement.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.kraftHeinz.targetManagement.factory.ConnectionFactory;
import br.com.fiap.kraftHeinz.targetManagement.model.FornecedorModel;


public class FornecedorDAO {
private Connection conexao;
	
	public FornecedorDAO() {
		this.conexao = new ConnectionFactory().conectar();
	}
	
	public void insert(FornecedorModel fornecedor) throws SQLException{
		String sql = "INSERT INTO T_FORNECEDOR (id_fncd, nm_nome, cd_tipo_transporte, cd_frota_sustentavel, nm_cidade)\r\n"
				+ "VALUES (?,?,?,?,?);";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1,fornecedor.getIdFornecedor());
		stmt.setString(2,fornecedor.getNomeFornecedor());
		stmt.setString(3,fornecedor.getTipoTransporte());
		stmt.setBoolean(4,fornecedor.getFrotaSustentavel());
		stmt.setString(5,fornecedor.getNomeCidade());
		
		stmt.execute();
		stmt.close();
		System.out.println("FORNECEDOR: Inserido com sucesso.");
	}
	
	public FornecedorModel selectById (String id) throws SQLException{
		FornecedorModel fornecedor = null;
		String sql = "SELECT * FROM T_FORNECEDOR WHERE id_fncd = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, id);
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			fornecedor = new FornecedorModel();
			fornecedor.setIdFornecedor(rs.getString("id_fncd"));
			fornecedor.setNomeFornecedor(rs.getString("nm_nome"));
			fornecedor.setTipoTransporte(rs.getString("cd_tipo_transporte"));
			fornecedor.setFrotaSustentavel(rs.getBoolean("cd_frota_sustentavel"));
			fornecedor.setNomeCidade(rs.getString("nm_cidade"));
		}
		
		rs.close();
		stmt.close();
		return fornecedor;
	}
}

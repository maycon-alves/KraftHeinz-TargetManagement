package br.com.fiap.kraftHeinz.targetManagement.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.kraftHeinz.targetManagement.factory.ConnectionFactory;
import br.com.fiap.kraftHeinz.targetManagement.model.FabricaProdutoModel;
import br.com.fiap.kraftHeinz.targetManagement.model.FornecimentoModel;

public class FornecimentoDAO {

	private Connection conexao;
	
	public FornecimentoDAO(){
		this.conexao = new ConnectionFactory().conectar();
	}
	
	public void insert(FornecimentoModel fornecimento) throws SQLException {
		String sql = "INSERT INTO t_fornece VALUES (?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		stmt.setBoolean(1, fornecimento.getCodigoOrganico());
		stmt.setString(2, fornecimento.getIdFornecedor());
		stmt.setString(3, fornecimento.getIdIngrediente());
		stmt.execute();
		stmt.close();

		System.out.println("INGREDIENTE <> FORNECEDOR - Relacionados com sucesso.");
	}
	
	public List<FornecimentoModel> getIngredientesByFornecedor(String idFornecedor) throws SQLException {
		List<FornecimentoModel> fornecimentoList = new ArrayList<FornecimentoModel>();
		String sql = "SELECT * FROM t_fornece WHERE t_fornece.fornecedor_id_fncd = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, idFornecedor);
		
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			FornecimentoModel fornecimento = new FornecimentoModel() {
			};
			fornecimento.setIdFornecedor(rs.getString("fornecedor_id_fncd"));
			fornecimento.setIdIngrediente(rs.getString("ingrediente_id_ingr"));
			fornecimento.setCodigoOrganico(rs.getBoolean("cd_organico"));
			fornecimentoList.add(fornecimento);
		}
		stmt.close();
		rs.close();
		return fornecimentoList;
	}
	
	public List<FornecimentoModel> getFornecedoresByIngrediente(String idIngrediente) throws SQLException {
		List<FornecimentoModel> fornecimentoList = new ArrayList<FornecimentoModel>();
		String sql = "SELECT * FROM t_fornece WHERE t_fornece.ingrediente_id_ingr = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, idIngrediente);
		
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			FornecimentoModel fornecimento = new FornecimentoModel() {
			};
			fornecimento.setIdFornecedor(rs.getString("fornecedor_id_fncd"));
			fornecimento.setIdIngrediente(rs.getString("ingrediente_id_ingr"));
			fornecimento.setCodigoOrganico(rs.getBoolean("cd_organico"));
			fornecimentoList.add(fornecimento);
		}
		stmt.close();
		rs.close();
		return fornecimentoList;
	}
}

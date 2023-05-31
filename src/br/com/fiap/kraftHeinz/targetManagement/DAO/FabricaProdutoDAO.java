package br.com.fiap.kraftHeinz.targetManagement.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.kraftHeinz.targetManagement.factory.ConnectionFactory;
import br.com.fiap.kraftHeinz.targetManagement.model.FabricaProdutoModel;

public class FabricaProdutoDAO {

	private Connection conexao;

	public FabricaProdutoDAO() {
		this.conexao = new ConnectionFactory().conectar();
	}

	public void insert(FabricaProdutoModel fabricaProduto) throws SQLException {
		String sql = "INSERT INTO t_fabrica_produto VALUES (?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		stmt.setString(1, fabricaProduto.getIdProduto());
		stmt.setString(2, fabricaProduto.getIdFabrica());
		stmt.execute();
		stmt.close();

		System.out.println("PRODUTO <> FABRICA - Relacionados com sucesso.");
	}
	
	public List<FabricaProdutoModel> getProdutosByFabrica(String idFabrica) throws SQLException {
		List<FabricaProdutoModel> fabricaProdutoList = new ArrayList<FabricaProdutoModel>();
		String sql = "SELECT * FROM t_fabrica_produto WHERE t_fabrica_produto.fabrica_id_fabrica = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, idFabrica);
		
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			FabricaProdutoModel fabricaProduto = new FabricaProdutoModel() {
			};
			fabricaProduto.setIdProduto(rs.getString("produto_id_produto"));
			fabricaProduto.setIdFabrica(rs.getString("fabrica_id_fabrica"));
			fabricaProdutoList.add(fabricaProduto);
		}
		stmt.close();
		rs.close();
		return fabricaProdutoList;
	}
	
	public List<FabricaProdutoModel> getFabricasByProduto(String idProduto) throws SQLException {
		List<FabricaProdutoModel> fabricaProdutoList = new ArrayList<FabricaProdutoModel>();
		String sql = "SELECT * FROM t_fabrica_produto WHERE t_fabrica_produto.fabrica_id_fabrica = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, idProduto);
		
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			FabricaProdutoModel fabricaProduto = new FabricaProdutoModel() {
			};
			fabricaProduto.setIdProduto(rs.getString("produto_id_produto"));
			fabricaProduto.setIdFabrica(rs.getString("fabrica_id_fabrica"));
			fabricaProdutoList.add(fabricaProduto);
		}
		stmt.close();
		rs.close();
		return fabricaProdutoList;
	}
}

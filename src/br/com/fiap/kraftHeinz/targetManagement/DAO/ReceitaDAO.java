package br.com.fiap.kraftHeinz.targetManagement.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.kraftHeinz.targetManagement.factory.ConnectionFactory;
import br.com.fiap.kraftHeinz.targetManagement.model.FornecimentoModel;
import br.com.fiap.kraftHeinz.targetManagement.model.ReceitaModel;

public class ReceitaDAO {

	private Connection conexao;
	
	public ReceitaDAO() {
		this.conexao = new ConnectionFactory().conectar();
	}
	
	public void insert(ReceitaModel receita) throws SQLException {
		String sql = "INSERT INTO t_produto_ingrediente VALUES (?, ?, ?, ?, ?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		stmt.setString(1, receita.getIdReceita());
		stmt.setInt(2, receita.getVolumeIngrediente());
		stmt.setString(3, receita.getCodigoUnidadeMedida());
		stmt.setString(4, receita.getIdProduto());
		stmt.setString(5, receita.getIdIngrediente());
		
		stmt.execute();
		stmt.close();

		System.out.println("INGREDIENTE <> PRODUTO - Relacionados com sucesso.");
	}
	
	public List<ReceitaModel> getIngredientesByProduto(String idProduto) throws SQLException {
		List<ReceitaModel> receitaList = new ArrayList<ReceitaModel>();
		String sql = "SELECT * FROM t_produto_ingrediente WHERE t_produto_ingrediente.produto_id_produto = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, idProduto);
		
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			ReceitaModel receita = new ReceitaModel() {
			};
			receita.setIdReceita(rs.getString("id_utilizacao"));
			receita.setVolumeIngrediente(rs.getInt("vl_ingrediente"));
			receita.setCodigoUnidadeMedida(rs.getString("cd_unidade_medida"));
			receita.setIdProduto(rs.getString("produto_id_produto"));
			receita.setIdIngrediente(rs.getString("ingrediente_id_ingr"));
			
			receitaList.add(receita);
		}
		stmt.close();
		rs.close();
		return receitaList;
	}
	
	public List<ReceitaModel> getProdutosByIngrediente(String idIngrediente) throws SQLException {
		List<ReceitaModel> receitaList = new ArrayList<ReceitaModel>();
		String sql = "SELECT * FROM t_produto_ingrediente WHERE t_produto_ingrediente.ingrediente_id_ingr = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, idIngrediente);
		
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			ReceitaModel receita = new ReceitaModel() {
			};
			receita.setIdReceita(rs.getString("id_utilizacao"));
			receita.setVolumeIngrediente(rs.getInt("vl_ingrediente"));
			receita.setCodigoUnidadeMedida(rs.getString("cd_unidade_medida"));
			receita.setIdProduto(rs.getString("produto_id_produto"));
			receita.setIdIngrediente(rs.getString("ingrediente_id_ingr"));
			
			receitaList.add(receita);
		}
		stmt.close();
		rs.close();
		return receitaList;
	}
	
}

package br.com.fiap.kraftHeinz.targetManagement.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.kraftHeinz.targetManagement.factory.ConnectionFactory;

import br.com.fiap.kraftHeinz.targetManagement.model.ProdutoModel;

public class ProdutoDAO {

private Connection conexao;
	
	public ProdutoDAO () {
		this.conexao = new ConnectionFactory().conectar();
	} 

	public void insert(ProdutoModel produto) throws SQLException{
		String sql = "INSERT INTO T_PRODUTO (t_produto.id_produto, nm_nome,cd_embalagem_reciclavel,nr_dias_validade)\r\n"
				+ "VALUES (?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1, produto.getIdProduto());
		stmt.setString(2, produto.getNomeProduto());
		stmt.setBoolean(3, produto.getEmbalagemReciclavel());
		stmt.setInt(4, produto.getDiasValidade());
		
		stmt.execute();
		stmt.close();
		System.out.println("PRODUTO: Inserido com sucesso.");
	}
	
	public ProdutoModel selectById (String id) throws SQLException{
		ProdutoModel produto = null;
		String sql = "SELECT * FROM T_LOTE WHERE id_produto = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, id);
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			produto = new ProdutoModel();
			produto.setIdProduto(rs.getString("id_produto"));
			produto.setNomeProduto(rs.getString("nm_nome"));
			produto.setEmbalagemReciclavel(rs.getBoolean("cd_embalagem_reciclavel"));
			produto.setDiasValidade(rs.getInt("nr_dias_validade"));
			
		}
		
		rs.close();
		stmt.close();
		return produto;
		
	}
	
}

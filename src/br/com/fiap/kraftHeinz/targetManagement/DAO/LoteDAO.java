package br.com.fiap.kraftHeinz.targetManagement.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.kraftHeinz.targetManagement.factory.ConnectionFactory;
import br.com.fiap.kraftHeinz.targetManagement.model.LoteModel;

public class LoteDAO {

private Connection conexao;
	
	public LoteDAO () {
		this.conexao = new ConnectionFactory().conectar();
	} 
	
	public void insert(LoteModel lote) throws SQLException{
		String sql = "INSERT INTO T_LOTE (t_lote.id_lote, t_lote.fabrica_id_fabrica , t_lote.produto_id_produto, qt_produto,qt_doada,dt_producao,qt_agua_gasto,qt_energia_gasto)\r\n"
				+ "VALUES (?, ?, ?, ?, ?, to_date(?, 'yyyy-mm-dd'),?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1, lote.getIdLote());
		stmt.setString(2, lote.getFabrica().getIdFabrica());
		stmt.setString(3, lote.getProduto().getIdProduto());
		stmt.setInt(4, lote.getQuantidadeProduto());
		stmt.setInt(5, lote.getQuantidadeDoada());
		stmt.setString(6, lote.getDataProducaoLoteSql());
		stmt.setInt(7, lote.getQuantidadeAguaGasto());
		stmt.setInt(8, lote.getQuantidadeEnergiaGasto());
		
		stmt.execute();
		stmt.close();
		System.out.println("LOTE: Inserido com sucesso.");
	}
	
	public LoteModel selectById (String id) throws SQLException{
		LoteModel lote = null;
		String sql = "SELECT * FROM T_LOTE WHERE id_lote = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, id);
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			lote = new LoteModel();
			lote.setIdLote(rs.getString("id_lote"));
			lote.setFabricaId(rs.getString("fabrica_id_fabrica"));
			lote.setProdutoId(rs.getString("produto_id_produto"));
			lote.setQuantidadeProduto(rs.getInt("qt_produto"));
			lote.setQuantidadeDoada(rs.getInt("qt_doada"));
			lote.setDataProducao(rs.getDate("dt_producao"));
			lote.setQuantidadeAguaGasto(rs.getInt("qt_agua_gasto"));
			lote.setQuantidadeEnergiaGasto(rs.getInt("qt_energia_gasto"));
		}
		
		rs.close();
		stmt.close();
		return lote;
		
	}
	
	
}

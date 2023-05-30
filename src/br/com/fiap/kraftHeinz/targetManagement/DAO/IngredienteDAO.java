package br.com.fiap.kraftHeinz.targetManagement.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.kraftHeinz.targetManagement.factory.ConnectionFactory;
import br.com.fiap.kraftHeinz.targetManagement.model.IngredienteModel;

public class IngredienteDAO {

private Connection conexao;
	
	public IngredienteDAO () {
		this.conexao = new ConnectionFactory().conectar();
	} 

	public void insert(IngredienteModel ingrediente) throws SQLException{
		String sql = "INSERT INTO T_INGREDIENTE (t_ingrediente.id_ingr, nm_ingrediente,nr_impacto_amb)\r\n"
				+ "VALUES (?,?,?);";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1, ingrediente.getIdIngrediente());
		stmt.setString(2, ingrediente.getNomeIngrediente());
		stmt.setInt(3, ingrediente.getImpactoAmbiental());
		
		stmt.execute();
		stmt.close();
	}
	
	public IngredienteModel selectById (String id) throws SQLException{
		IngredienteModel ingrediente = null;
		String sql = "SELECT * FROM T_LOTE WHERE id_ingr = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, id);
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			ingrediente = new IngredienteModel();
			ingrediente.setIdIngrediente(rs.getString("id_ingr"));
			ingrediente.setNomeIngrediente(rs.getString("nm_ingrediente"));
			ingrediente.setImpactoAmbiental(rs.getInt("nr_impacto_amb"));
			
		}
		
		rs.close();
		stmt.close();
		return ingrediente;
		
	}
	
}

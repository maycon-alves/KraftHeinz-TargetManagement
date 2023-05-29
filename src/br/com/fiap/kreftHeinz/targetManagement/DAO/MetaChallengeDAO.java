package br.com.fiap.kreftHeinz.targetManagement.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.kraftHeinz.targetManagement.model.MetaChallengeModel;
import br.com.fiap.kreftHeinz.targetManagement.factory.ConnectionFactory;

public class MetaChallengeDAO {
	private Connection conexao;
	
	public MetaChallengeDAO () {
		this.conexao = new ConnectionFactory().conectar();
	}
	
	public void insert(MetaChallengeModel meta) throws SQLException{
		String sql = "INSERT INTO T_META_CHALLENGE(t_meta_challenge.id_meta_challenge,ds_meta_challenge,dt_prazo,cd_meta_done)\r\n"
				+ "VALUES (?,?,to_date(?, 'yyyy-mm-dd'),?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1, meta.getIdMeta());
		stmt.setString(2, meta.getDescricaoMeta());
		stmt.setString(3, meta.getDataPrazoSql());
		stmt.setBoolean(4, meta.getCodigoMetaDone());
		
		stmt.execute();
		stmt.close();
	}
	
	public MetaChallengeModel selectById (String id) throws SQLException{
		MetaChallengeModel meta = null;
		String sql = "";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, id);
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			meta = new MetaChallengeModel();
			meta.setIdMeta(rs.getString("id_meta_challenge"));
			meta.setDescricaoMeta(rs.getString("ds_meta_challenge"));
			meta.setDataPrazo(rs.getDate("dt_prazo"));
			meta.setCodigoMetaDone(rs.getBoolean("cd_meta_done"));
		}
		
		rs.close();
		stmt.close();
		return meta;
		
	}
}

package br.com.fiap.kraftHeinz.targetManagement.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.kraftHeinz.targetManagement.factory.ConnectionFactory;
import br.com.fiap.kraftHeinz.targetManagement.model.EnergiaLoteFabricaModel;

public class EnergiaLoteFabricaDAO {
	
	private Connection conexao;
	
	public EnergiaLoteFabricaDAO() {
		this.conexao = new ConnectionFactory().conectar();
	}
	
	public EnergiaLoteFabricaModel getPercentualAutoSustentavel (String idFabrica) throws SQLException {
		EnergiaLoteFabricaModel fabrica = new EnergiaLoteFabricaModel();
		fabrica.setIdFabrica(idFabrica);
		List<Integer> loteEnergiaGasta = new ArrayList<Integer>();
		List<Integer> fabricaEnergiaProduzida = new ArrayList<Integer>();
		String sql = "SELECT t_lote.qt_energia_gasto, t_producao_energia.qt_watts FROM t_lote JOIN t_producao_energia ON t_producao_energia.fabrica_id_fabrica = t_lote.fabrica_id_fabrica WHERE t_lote.fabrica_id_fabrica = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, idFabrica);
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			loteEnergiaGasta.add(rs.getInt("qt_energia_gasto"));
			fabricaEnergiaProduzida.add(rs.getInt("qt_watts"));
		}
		fabrica.setLoteEnergiaGasta(loteEnergiaGasta);
		fabrica.setFabricaEnergiaProduzida(fabricaEnergiaProduzida);
		
		rs.close();
		stmt.close();
		return fabrica;
	}
	
}

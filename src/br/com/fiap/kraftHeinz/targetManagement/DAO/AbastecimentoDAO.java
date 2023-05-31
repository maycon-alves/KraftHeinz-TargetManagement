package br.com.fiap.kraftHeinz.targetManagement.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.kraftHeinz.targetManagement.factory.ConnectionFactory;
import br.com.fiap.kraftHeinz.targetManagement.model.AbastecimentoModel;
import br.com.fiap.kraftHeinz.targetManagement.model.FabricaProdutoModel;

public class AbastecimentoDAO {
	private Connection conexao;

	public AbastecimentoDAO() {
		this.conexao = new ConnectionFactory().conectar();
	}

	public void insert(AbastecimentoModel abastecimento) throws SQLException {
		String sql = "INSERT INTO t_fabrica_fornecedor VALUES (?,?,to_date(?, 'yyyy-mm-dd'))";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		stmt.setString(1, abastecimento.getIdFabricaAbastecimento());
		stmt.setString(2, abastecimento.getIdFornecedorAbastecimento());
		stmt.setString(3, abastecimento.getAbastecimentoSql());
		stmt.execute();
		stmt.close();

		System.out.println("FABRICA <> FORNECEDOR - Relacionados com sucesso.");
	}

	public List<AbastecimentoModel> getFornecedoresByFabrica(String idFabrica) throws SQLException {
		List<AbastecimentoModel> abastecimentoList = new ArrayList<AbastecimentoModel>();
		String sql = "SELECT * FROM t_fabrica_fornecedor WHERE t_fabrica_fornecedor.fabrica_id_fabrica = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, idFabrica);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			AbastecimentoModel abastecimento = new AbastecimentoModel() {
			};
			abastecimento.setIdFabricaAbastecimento(rs.getString("fabrica_id_fabrica"));
			abastecimento.setIdFornecedorAbastecimento(rs.getString("fornecedor_id_fncd"));
			abastecimento.setAbastecimento(rs.getDate("dt_abastecimento"));
			abastecimentoList.add(abastecimento);
		}
		stmt.close();
		rs.close();
		return abastecimentoList;
	}

	public List<AbastecimentoModel> getFabricaByFornecedores(String idFornecedor) throws SQLException {
		List<AbastecimentoModel> abastecimentoList = new ArrayList<AbastecimentoModel>();
		String sql = "SELECT * FROM t_fabrica_fornecedor WHERE t_fabrica_fornecedor.fornecedor_id_fncd = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, idFornecedor);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			AbastecimentoModel abastecimento = new AbastecimentoModel() {
			};
			abastecimento.setIdFabricaAbastecimento(rs.getString("fabrica_id_fabrica"));
			abastecimento.setIdFornecedorAbastecimento(rs.getString("fornecedor_id_fncd"));
			abastecimento.setAbastecimento(rs.getDate("dt_abastecimento"));
			abastecimentoList.add(abastecimento);
		}
		stmt.close();
		rs.close();
		return abastecimentoList;
	}
}

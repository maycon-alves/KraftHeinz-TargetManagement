package br.com.fiap.kraftHeinz.targetManagement.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.kraftHeinz.targetManagement.DAO.EnergiaLoteFabricaDAO;
import br.com.fiap.kraftHeinz.targetManagement.model.EnergiaLoteFabricaModel;

public class EnergiaLoteFabricaInsigthTest {

	private EnergiaLoteFabricaDAO energiaLoteFabricaDAO = new EnergiaLoteFabricaDAO();
	private Integer energiaGasta = 0;
	private Integer energiaProduzida = 0;	
	private Integer percentual = 0;
	
	public String recuperaPercentualAutoSustentavelFabrica(String idFabrica) throws SQLException {
		EnergiaLoteFabricaModel fabricaInsigth = new EnergiaLoteFabricaModel(energiaLoteFabricaDAO.getPercentualAutoSustentavel(idFabrica));
		System.out.println(fabricaInsigth);
		somaGastos(fabricaInsigth.getLoteEnergiaGasta());
		somaEnergiaProduzida(fabricaInsigth.getFabricaEnergiaProduzida());
		if (energiaGasta > 0 && energiaGasta != null ) {
			percentual = ((energiaProduzida*100)/energiaGasta);
			return percentual + "% Da energia utilizada na fabrica [" + idFabrica + "] é proveniente de fonte sustentavel\nEnquanto a quantidade total de energia gasta na frabica foi de [" + energiaGasta + "] Watts,\n a quantidade total de energia produzida foi de [" + energiaProduzida
					+ "] Watts";
		}else {
			return "0% da Da energia utilizada na fabrica [" + idFabrica + "] é proveniente de fonte sustentavel\nEnquanto a quantidade total de energia gasta na frabica foi de [" + energiaGasta + "] Watts,\n a fabrica não produziu energia";
		}
	}
	
	private void somaGastos(List<Integer> loteEnergiaGasta) {
		for (int i = 0; i < loteEnergiaGasta.size(); i++) {
			energiaGasta =+ loteEnergiaGasta.get(i);
		}
	}
	
	private void somaEnergiaProduzida(List<Integer> loteEnergiaProduzida) {
		for (int i = 0; i < loteEnergiaProduzida.size(); i++) {
			energiaProduzida =+ loteEnergiaProduzida.get(i);
		}
	}
	
}

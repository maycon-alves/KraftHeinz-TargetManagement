package br.com.fiap.kraftHeinz.targetManagement.model;

import java.util.ArrayList;
import java.util.List;

public class EnergiaLoteFabricaModel {
	
	private String idFabrica;
	private List<Integer> loteEnergiaGasta = new ArrayList<Integer>();
	private List<Integer> fabricaEnergiaProduzida = new ArrayList<Integer>();
	
	public EnergiaLoteFabricaModel() {
	}
	
	public EnergiaLoteFabricaModel(String idFabrica, List<Integer> loteEnergiaGasta,
			List<Integer> fabricaEnergiaProduzida) {
		super();
		this.idFabrica = idFabrica;
		this.loteEnergiaGasta = loteEnergiaGasta;
		this.fabricaEnergiaProduzida = fabricaEnergiaProduzida;
	}
	
	public EnergiaLoteFabricaModel(EnergiaLoteFabricaModel fabrica) {
		super();
		this.idFabrica = fabrica.getIdFabrica();
		this.loteEnergiaGasta = fabrica.getLoteEnergiaGasta();
		this.fabricaEnergiaProduzida = fabrica.getFabricaEnergiaProduzida();
	}

	public String getIdFabrica() {
		return idFabrica;
	}

	public void setIdFabrica(String idFabrica) {
		this.idFabrica = idFabrica;
	}

	public List<Integer> getLoteEnergiaGasta() {
		return loteEnergiaGasta;
	}

	public void setLoteEnergiaGasta(List<Integer> loteEnergiaGasta) {
		this.loteEnergiaGasta = loteEnergiaGasta;
	}

	public List<Integer> getFabricaEnergiaProduzida() {
		return fabricaEnergiaProduzida;
	}

	public void setFabricaEnergiaProduzida(List<Integer> fabricaEnergiaProduzida) {
		this.fabricaEnergiaProduzida = fabricaEnergiaProduzida;
	}

	@Override
	public String toString() {
		return "EnergiaLoteFabricaModel [idFabrica=" + idFabrica + ", loteEnergiaGasta=" + loteEnergiaGasta
				+ ", fabricaEnergiaProduzida=" + fabricaEnergiaProduzida + "]";
	}
	
}

package br.com.fiap.kraftHeinz.targetManagement.teste;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import br.com.fiap.kraftHeinz.targetManagement.DAO.AbastecimentoDAO;
import br.com.fiap.kraftHeinz.targetManagement.DAO.FabricaDAO;
import br.com.fiap.kraftHeinz.targetManagement.DAO.FabricaProdutoDAO;
import br.com.fiap.kraftHeinz.targetManagement.DAO.FornecedorDAO;
import br.com.fiap.kraftHeinz.targetManagement.DAO.FornecimentoDAO;
import br.com.fiap.kraftHeinz.targetManagement.DAO.IngredienteDAO;
import br.com.fiap.kraftHeinz.targetManagement.DAO.LoteDAO;
import br.com.fiap.kraftHeinz.targetManagement.DAO.MetaChallengeDAO;
import br.com.fiap.kraftHeinz.targetManagement.DAO.ProducaoEnergiaDAO;
import br.com.fiap.kraftHeinz.targetManagement.DAO.ProdutoDAO;
import br.com.fiap.kraftHeinz.targetManagement.DAO.ReceitaDAO;
import br.com.fiap.kraftHeinz.targetManagement.DAO.ReusoAguaDAO;
import br.com.fiap.kraftHeinz.targetManagement.DAO.TesteDAO;
import br.com.fiap.kraftHeinz.targetManagement.model.AbastecimentoModel;
import br.com.fiap.kraftHeinz.targetManagement.model.FabricaModel;
import br.com.fiap.kraftHeinz.targetManagement.model.FabricaProdutoModel;
import br.com.fiap.kraftHeinz.targetManagement.model.FornecedorModel;
import br.com.fiap.kraftHeinz.targetManagement.model.FornecimentoModel;
import br.com.fiap.kraftHeinz.targetManagement.model.IngredienteModel;
import br.com.fiap.kraftHeinz.targetManagement.model.LoteModel;
import br.com.fiap.kraftHeinz.targetManagement.model.MetaChallengeModel;
import br.com.fiap.kraftHeinz.targetManagement.model.ProducaoEnergiaModel;
import br.com.fiap.kraftHeinz.targetManagement.model.ProdutoModel;
import br.com.fiap.kraftHeinz.targetManagement.model.ReceitaModel;
import br.com.fiap.kraftHeinz.targetManagement.model.ReusoAguaModel;

public class TesteMain {

	public static void main(String[] args) throws ParseException, SQLException {
		/*
		 * bloco para formatação das datas
		 */
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd"); 
		
		/*
		 * bloco para a inicialização das DAOs
		 */
		//TesteDAO testeDAO = new TesteDAO();
		//MetaChallengeDAO metaDAO = new MetaChallengeDAO();
		//FabricaDAO fabricaDAO = new FabricaDAO();
		//ProducaoEnergiaDAO producaoDAO = new ProducaoEnergiaDAO();
		//ReusoAguaDAO reusoDAO = new ReusoAguaDAO();
		//FornecedorDAO fornecedorDAO = new FornecedorDAO();
		//IngredienteDAO ingredienteDAO = new IngredienteDAO();
		//ProdutoDAO produtoDAO = new ProdutoDAO();
		//LoteDAO loteDAO = new LoteDAO();
		//FabricaProdutoDAO fabricaProdutoDAO = new FabricaProdutoDAO();
		//AbastecimentoDAO abastecimentoDAO = new AbastecimentoDAO();
		//FornecimentoDAO fornecimentoDAO = new FornecimentoDAO();
		//ReceitaDAO receitaDAO = new ReceitaDAO();
		
		/*
		 * bloco para criação das Models
		 */
		Date dataMeta = formato.parse("2025-01-01");
		MetaChallengeModel meta = new MetaChallengeModel("meta-3", "concluir o desenvolvimento", dataMeta, false);
		
		FabricaModel fabrica = new FabricaModel("10", "Brasília", "Heinz", true, true, false);

		Date dataProducao = formato.parse("2023-05-27");
		ProducaoEnergiaModel producao = new ProducaoEnergiaModel("energia-1" , 150, dataProducao , fabrica);
		
		Date dataReuso = formato.parse("2023-05-27");
		ReusoAguaModel reuso = new ReusoAguaModel("reuso-1" , 500, dataReuso , fabrica);
		
		FornecedorModel fornecedor = new FornecedorModel("3" , "tomarilho", "caminhao", false, "Goiás");
		
		IngredienteModel ingrediente = new IngredienteModel("25", "Tomate", 2);
		
		ProdutoModel produto = new ProdutoModel("30", "Molho de Tomate", false, 365);
		
		Date dataProducaoLote = formato.parse("2023-05-27");
		LoteModel lote = new LoteModel("555", fabrica, produto, 1000, 100, dataProducaoLote, 1000, 300);
		
		FabricaProdutoModel fabricaProduto = new FabricaProdutoModel("10","30");
		
		Date dataAbastecimento = formato.parse("2023-05-27");
		AbastecimentoModel abastecimento = new AbastecimentoModel("10", "3", dataAbastecimento);
		
		FornecimentoModel fornecimento = new FornecimentoModel("3", "25", true);
		
		ReceitaModel receita = new ReceitaModel("RECEITA-1", "30", "25", 1, "Kg");
		
		/*
		 * bloco para execução dos comandos e instruções
		 */
		/*
		System.out.println(meta.toString());
		//metaDAO.insert(meta);
		//System.out.println("meta inserida com sucesso: " + meta.toString());
		//System.out.println("Recuperado o registro [meta-2]:\n" + metaDAO.selectById("meta-2") + "\n");
		
		System.out.println(fabrica.toString());
		//fabricaDAO.insert(fabrica);
		//System.out.println("Recuperado o registro [10]:\n" + fabricaDAO.selectById("10") + "\n");
		
		System.out.println(producao.toString());
		//producaoDAO.insert(producao);
		//System.out.println("Recuperado o registro [energia-1]:\n" + producaoDAO.selectById("energia-1") + "\n");
		
		
		System.out.println(reuso.toString());
		//reusoDAO.insert(reuso);
		//System.out.println("Recuperado o registro [reuso-1]:\n" + reusoDAO.selectById("reuso-1") + "\n");
		
		System.out.println(fornecedor.toString());
		//fornecedorDAO.insert(fornecedor);
		//System.out.println("Recuperado o registro [3]:\n" + fornecedorDAO.selectById("3") + "\n");
		
		System.out.println(ingrediente.toString());
		//ingredienteDAO.insert(ingrediente);
		//System.out.println("Recuperado o registro [25]:\n" + ingredienteDAO.selectById("25") + "\n");
		
		System.out.println(produto.toString());
		//produtoDAO.insert(produto);
		//System.out.println("Recuperado o registro [30]:\n" + produtoDAO.selectById("30") + "\n");
		
		System.out.println(lote.toString());
		//loteDAO.insert(lote);
		//System.out.println("Recuperado o registro [555]:\n" + loteDAO.selectById("555") + "\n");
		//System.out.println("Recuperado todos os lotes [TODOS]:\n" + loteDAO.getAll() + "\n");
		
		System.out.println(fabricaProduto.toString());
		//fabricaProdutoDAO.insert(fabricaProduto);
		//System.out.println("Recuperado os produtos produzidos na Fabrica [10]:\n" + fabricaProdutoDAO.getProdutosByFabrica("10") + "\n");
		
		System.out.println(abastecimento.toString());
		//abastecimentoDAO.insert(abastecimento);
		//System.out.println("Recuperado as fabricas atendidas pelo fornecedor [3]" + abastecimentoDAO.getFabricaByFornecedores("3") + "\n");
		
		System.out.println(fornecimento.toString());
		//fornecimentoDAO.insert(fornecimento);
		//System.out.println("Recuperado os fornecedores do produto [25]" + fornecimentoDAO.getFornecedoresByIngrediente("25") + "\n");
		
		System.out.println(receita.toString());
		//receitaDAO.insert(receita);
		//System.out.println("Recuperado as ingredientes utilizados no produto [30]" + receitaDAO.getIngredientesByProduto("30") + "\n");
		*/
		/*
		 * Bloco para construção de um menu de interação
		 */
		String insigth = "inicial";
		while (!insigth.equalsIgnoreCase("quit")) {
			insigth = JOptionPane.showInputDialog("Por Favor selecione uma das opções:\n[1] Metas em andamento\n[2] Consumo de energia em determinada fabrica\n[3] Produto com maior consumo de agua em sua fabricação\n[4] Quantidade de produtos doados\n[quit] Finalizar");	
			
			switch (insigth) {
			case "1": {
				MetaChallengeDAO metaDAO = new MetaChallengeDAO();
				String idMeta = JOptionPane.showInputDialog("Insira o Identificador da meta: ");
				JOptionPane.showMessageDialog(null, "Recuperado o registro [meta-2]:\n" + metaDAO.selectById(idMeta).toString() + "\n");
				break;
			}
			case "2":{
				//consumo de energia vs energia produzida
				//merge das tabelas de lotes da mesma fabrica vs quantidade de watts da mesma fabrica no mesmo periodo
				EnergiaLoteFabricaInsigthTest consumo = new EnergiaLoteFabricaInsigthTest();
				String resultado = consumo.recuperaPercentualAutoSustentavelFabrica(JOptionPane.showInputDialog("Insira o Identificador da fabrica que deseja analisar: "));
				JOptionPane.showMessageDialog(null, resultado);
				break;
			}
			case "3":{
				//produto que consome mais agua em sua fabricação
				// verificar numero mais alto de gasto de agua no lote, e trazer o produto
				// para cada produto, pega o valor gasto com agua > divide pelo tanto de unidades produzidas > e verifica se é maior que o anterior, até acabar os produtos
				ProdutoGastoAguaInsigthTeste gasto = new ProdutoGastoAguaInsigthTeste();
				String resultado = gasto.recuperaProdutoComMaiorGasto();
				JOptionPane.showMessageDialog(null, resultado);
				break;
			}
			case "4":{
				//quantidade de produtos doados
				LoteDAO loteDAO = new LoteDAO();
				String resultado = loteDAO.getProdutosDoados();
				JOptionPane.showMessageDialog(null, resultado);
				System.out.println(insigth);
				break;
			}
			case "5":{
				//percentual de energia sustentavel utilizada em determinada fabrica em determinado periodo
				System.out.println(insigth);
				break;
			}
			case "quit":{
				JOptionPane.showMessageDialog(null, "Obrigado!");
				break;
			}
			default:
				JOptionPane.showMessageDialog(null, "OPIÇÃO_INVALIDA");
			}
		}
		System.out.println("FINALIZOU");
	}

}

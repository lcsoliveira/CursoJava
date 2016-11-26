package com.dextraining.investimento;

import java.util.List;
import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import com.dextraining.exception.ValidacaoException;
import com.dextraining.jpa.EntityManagerUtil;

public class InvestimentoServiceTest {

	// Classe Test sempre é uma boa pratica terminar a nomeção em Test

	@After
	public void close() {
		EntityManagerUtil.fechar();
	}

	@Test
	public void salvarComSucessso() {
		
		//Criamos um método para criar os investimentos
		Investimento investimento = criarInvestimento("Meu Investimento", 1000.00, 0.5);
		
		InvestimentoService investimentoService = new InvestimentoService();

		investimentoService.salvar(investimento);
		
		Investimento investimentoSalvo = investimentoService.buscarPorId(investimento.getId());

		// Verificamos se o ID está diferente de null
		Assert.assertNotNull(investimentoSalvo);

	}



	@Test(expected = ValidacaoException.class) // notação que identifica que
												// este método é um teste
	public void salvarComErro() {

		Investimento investimento = criarInvestimento(null, 1000.00, 0.5);	
		
		InvestimentoService investimentoService = new InvestimentoService();		
		investimentoService.salvar(investimento);
		
		// Verificamos se o ID está diferente de null
		Assert.assertNotNull("Investimento não pode ser null", investimento.getId());
	}

	
	@Test //O teste sempre vai ser void 
	public void listarInvestimentosOrdenadosTeste() {
		
		
		InvestimentoService investimentoService = new InvestimentoService();
		

		int quantidade = 2;
		
		criarInvestimento(quantidade);
		
	
	List<Investimento> investimentos	= investimentoService.buscaValorDecrescente();
	Assert.assertEquals(quantidade, investimentos.size());
	
	assertEstaEmDesc(investimentos);
	
	}
	
	
	@Test
	public void listarTodosRendtimentosValores(){
		
		InvestimentoService  investimentoService = new InvestimentoService();
		
		investimentoService.salvar(criarInvestimento("Meu investimento 1 ", 1500.00,   0.20));
		investimentoService.salvar(criarInvestimento("Meu investimento 2 ", 500.00,    0.25));
		investimentoService.salvar(criarInvestimento("Meu investimento 3 ", 2500.00,   0.30));
		investimentoService.salvar(criarInvestimento("Meu investimento 4 ", 1000.00,   0.30));
		investimentoService.salvar(criarInvestimento("Meu investimento 5 ", 1000.00,   0.25));
		
					
		List<Investimento> investimentos = investimentoService.buscaRendimento();
		Assert.assertEquals(2, investimentos.size());
		
		for(Investimento investimento : investimentos){
			
				Assert.assertTrue(investimento.getRendimentoMensal()>25);
				Assert.assertTrue(investimento.getValor() >= 1000);
		}
		
	}
	
	
	

	//Verificamos se a consulta está em Desc
	private void assertEstaEmDesc(List<Investimento> investimentos) {
		for (int i = 0; i < investimentos.size() - 1; i++){
			
			Investimento atual = investimentos.get(i);
			Investimento proximo = investimentos.get(i + 1);
			
			Assert.assertTrue(atual.getValor() >= proximo.getValor());	
		}
	}
	
	//Passamos a quantidade de investimentos que queremos criar 
	private void criarInvestimento(int quantidade){
		
		InvestimentoService investimentoService = new InvestimentoService();
		
		
		for(int i = 0;  i < quantidade; i ++){
			
			Double valor = 1000 + new Random().nextDouble();
			Double rendimento =  new Random().nextDouble();
			
			investimentoService.salvar(criarInvestimento("Investimento " + i, rendimento, valor));
		}
	}
	
	//Método para criar investimento
	private Investimento criarInvestimento(String descricao, Double valor, Double rendimento) {
		
		Investimento investimento = new Investimento();
		investimento.setDescricao(descricao);
		investimento.setValor(valor);
		investimento.setRendimentoMensal(rendimento);
		
		return investimento;
	}
	
	

	
}

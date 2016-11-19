package com.dextraining.investimento;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.dextraining.Service.GenericService;
import com.dextraining.exception.ValidacaoException;
import com.dextraining.jpa.EntityManagerUtil;

public class InvestimentoService extends GenericService<Investimento> {

	public InvestimentoService() {
		super(Investimento.class);
	}

	// Vamos sobreescrever o método salvar do generic

	@Override
	public void salvar(Investimento investimento) {

		if (investimento.getDescricao() == null) {
			throw new ValidacaoException("Descrição não pode estar vazia");
		}

		if (investimento.getValor() == null || investimento.getValor() <= 0) {
			throw new ValidacaoException("Valor inválido");
		}

		if (investimento.getRendimentoMensal() == null || investimento.getRendimentoMensal() <= 0) {
			throw new ValidacaoException("Rendimento Mensal Inválido");
		}

		// Depois que passamos pelas validações padrão chamamos o super.salvar()
		// pois ele é quem possui a lógica de salvar
		super.salvar(investimento);
	}
	
	
	public  List<Investimento>  buscaValorDecrescente(){

		EntityManager em = EntityManagerUtil.criarEntityMaganer();
		
		//A consulta com o banco é muito parecido com SQL 
		//A Diferença é aqui consultamos através do nome da classe e os  seus atributos 
		try{
			String jpql = "SELECT i FROM Investimento i ORDER BY i.valor DESC";
					
			TypedQuery<Investimento> query = em.createQuery(jpql, Investimento.class);
			
			return query.getResultList();
		}
		
		finally{
			em.close();
		}

	}

	
	
	public  List<Investimento>  buscaRendimento(){

		EntityManager em = EntityManagerUtil.criarEntityMaganer();
		
		//A consulta com o banco é muito parecido com SQL 
		//A Diferença é aqui consultamos através do nome da classe e os  seus atributos 
		try{
			String jpql = "SELECT i FROM Investimento i WHERE i.valor >= 1000 AND i.rendimentoMensal > 0.25 ";
					
			TypedQuery<Investimento> query = em.createQuery(jpql, Investimento.class);
			
			return query.getResultList();
		}
		
		finally{
			em.close();
		}

	}

	
	
	
	
	
	
}

package com.dextraining.Service;

import java.text.MessageFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.dextraining.banco.Banco;
import com.dextraining.jpa.EntityManagerUtil;

public class GenericService<T> {

	private Class<T> targetClass;
	
	public GenericService (Class<T> targetClass){
		this.targetClass = targetClass;
	}
	
	
	public void salvar(T entidade) {
		EntityManager em = EntityManagerUtil.criarEntityMaganer();

		try {
			em.getTransaction().begin(); // abrindo a transação
			// CÓDIGO CONSIDERADO COMO BLOCO (OU VAI TUDO OU NÃO VAI NADA )

			// Aqui estamos salvando no banco
			em.persist(entidade);
			// Se deu certo salvar ele vai estar com a Id preenchido

			em.getTransaction().commit();

			// Usamos o try/catch só para garantir que a aplicação a ser
			// executada
			// vai fechar

		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new RuntimeException(e);
		}

		finally {
			em.close();
		}
	}
	
	public T buscarPorId(Long id) {
		EntityManager em = EntityManagerUtil.criarEntityMaganer();
		
		try{

		return em.find(targetClass, id); // O método find ele busca o id no
											// banco através da chave primaria
										// que é um id
		}finally{
			em.close();
		}
	}
	
	public List<T> buscarTodos(){
		
	
		EntityManager em = EntityManagerUtil.criarEntityMaganer();
		
		try{
			String jpql = MessageFormat.format("SELECT e FROM {0} e", targetClass.getSimpleName());
			TypedQuery<T> query = em.createQuery(jpql, targetClass);
			
			return query.getResultList();
		}
		finally{
			em.close();
		}
			
		
	}

}

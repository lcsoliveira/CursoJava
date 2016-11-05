package com.dextraining.garagem.dominio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import com.dexraining.garagem.jpa.EntityManagerUtil;
import com.dextraining.garagem.dominio.veiculo.Veiculo;
import com.dextraining.garagem.exception.VeiculoDuplicadoException;
import com.dextraining.garagem.exception.VeiculoNaoEncontradoException;

public class GaragemJPA implements Garagem {

	@Override
	public void adicionar(Veiculo veiculo) {
		// TODO Salvar novo veiculo no banco de dados
		// TODO IMPORTANTE: Validar duplicidade da placa do veiculo
			
		//buscar(veiculo.getPlaca());
		
		if (buscar(veiculo.getPlaca()) == null) {

			EntityManager em = EntityManagerUtil.criarEntityManager();

			try {
				em.getTransaction().begin();

				em.persist(veiculo);

				em.getTransaction().commit();
			} catch (Exception e) {
				em.getTransaction().rollback();
				throw e;
			} finally {
				em.close();
			}
		} else {
			throw new VeiculoDuplicadoException("Veiculo Duplicado, favor inserir uma placa válida");
		}
	}

	@Override
	public void vender(String placa) {
		// TODO Implementar venda de veiculo por placa
				Veiculo veiculo = buscar(placa);
		if(veiculo == null){
			
			throw new VeiculoNaoEncontradoException("Não existe nenhum veiculo cadastrado com esta placa");
			
		}
		
		else{
			
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try{
			
			
			em.getTransaction().begin();
			
			Veiculo veiculoGerenciado = em.merge(veiculo);
			em.remove(veiculoGerenciado);

			em.getTransaction().commit();
			
			
			
		} catch (NoResultException e) {
			return;
		} finally {
			em.close();
		}

		}
	}

	@Override
	public Veiculo buscar(String placa) {
		// TODO Implementar busca de veiculo por placa

		EntityManager em = EntityManagerUtil.criarEntityManager();
		try {

			String jpql = "SELECT v FROM Veiculo v WHERE v.placa = :placa "; //Usamos dois pontos e nome do parametro para indicar qual parametro estamos passando pra consulta

			TypedQuery<Veiculo> query = em.createQuery(jpql, Veiculo.class);
			query.setParameter("placa", placa);//Aqui estamos passando qual é o parametro que foi retornado
			
			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		} finally {
			em.close();
		}

	}

	@Override
	public List<Veiculo> listar() {
		// TODO: Implementar consulta que lista todos os veiculos ordenados por:
		// marca;
		// modelo;
		// ano;
		// preco;
		
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try {

			String jpql = "SELECT v FROM Veiculo v ORDER BY v.marca, v.modelo, v.placa, v.ano, v.preco DESC";

			TypedQuery<Veiculo> query = em.createQuery(jpql, Veiculo.class);

			return query.getResultList();
		} catch (NoResultException e) {
			return null;
		} finally {
			em.close();
		}

	}
}

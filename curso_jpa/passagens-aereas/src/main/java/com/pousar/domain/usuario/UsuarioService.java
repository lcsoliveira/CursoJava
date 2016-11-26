package com.pousar.domain.usuario;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import com.pousar.app.util.Strings;
import com.pousar.domain.ValidacaoException;
import com.pousar.jpa.BaseService;
import com.pousar.jpa.EntityManagerUtil;

public class UsuarioService extends BaseService<Usuario> {

	public UsuarioService() {
		super(Usuario.class);
	}

	@Override
	public Usuario salvar(Usuario usuario) {
		// TODO: Implementar validacoes e salvar usuario no banco de dados.

		if (Strings.isEmpty(usuario.getEmail())) {
			throw new ValidacaoException("Email é obrigatório");
		}

		if (Strings.isEmpty(usuario.getSenha())) {
			throw new ValidacaoException("Senha é obrigatória");
		}

		// Criamos uma novo objeto do tipo usuario para para verificar se o
		// usuario já existe
		
		Usuario usuarioEncontrado = buscarPorEmail(usuario.getEmail());
		//Verificamos se o usuario é diferente de null
		
		if(usuarioEncontrado != null){
			if(!usuarioEncontrado.getId().equals(usuario.getId())){
				throw new ValidacaoException("Email ja cadastrado");
			}
		}

		return super.salvar(usuario);

	}

	public Usuario buscarParaLogin(String email, String senha) {
		
	EntityManager em = EntityManagerUtil.criarEntityManager();
	
	try{
		
		StringBuilder jpql= new StringBuilder();
		
		jpql.append("SELECT u FROM Usuario u "); 	// sempre que usar o StringBuilder não esquecer de utilizar o espaço no final do codigo SQL
		jpql.append("WHERE UPPER(u.email) = UPPER(:email) "); //Utilizamos  o : para compara com o parametro que eu to passando em parameter
		jpql.append("AND u.senha = :senha");
		
		//Criamos uma Query passando o tipo da query que queremos retornar 
		//Asssim não precisamos fazer um Cast na hora de retornar o objeto 
		
		TypedQuery<Usuario> query = em.createQuery(jpql.toString(), Usuario.class);
		query.setParameter("email", email);
		query.setParameter("senha", senha);
		
		return query.getSingleResult();
	}catch(NoResultException e){
		return null;
	}finally{
		em.close();
	}
				
	}

	/********************************* Método para buscar por Email *********************************/

	public Usuario buscarPorEmail(String email) {
		EntityManager em = EntityManagerUtil.criarEntityManager();
		
		try{
			TypedQuery<Usuario> query = em
					.createQuery("SELECT u FROM Usuario u WHERE UPPER(u.email) = UPPER(u.email) ", Usuario.class);
			query.setParameter("email",email);
			return query.getSingleResult();
		}catch(NoResultException e ){
			return null;
		}finally{
			em.close();
		}	
	}

	/********************************* Método para Listar ****************************************/

	public List<Usuario> buscarPor(String email, String nome) {
		
			EntityManager em = EntityManagerUtil.criarEntityManager();
		
		try{
			
			StringBuilder jpql = new StringBuilder();
			jpql.append("SELECT u FROM Usuario u WHERE 1=1 " );
			
			if(Strings.isNotEmpty(email)){
				jpql.append("AND UPPPER(u.email) LIKE UPPER(:email) ");
			}
			

			if(Strings.isNotEmpty(nome)){
				jpql.append("AND UPPPER(u.nome) LIKE UPPER(:nome) ");
			}

			
			TypedQuery<Usuario> query = em.createQuery(jpql.toString(), Usuario.class);	
		
			if(Strings.isNotEmpty(email)){
				query.setParameter("email", "%" + email + "%");
			}
			

			if(Strings.isNotEmpty(nome)){
				query.setParameter("nome","%" + nome + "%"); //utilizamos os % para buscar pelos caracteres onde ele esteja 
			}
		
		
			return query.getResultList();
			
		
		}finally{
			em.close();
		}	
		
	}
}

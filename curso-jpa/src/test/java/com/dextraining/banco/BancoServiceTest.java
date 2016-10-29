package com.dextraining.banco;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import com.dextraining.jpa.EntityManagerUtil;

public class BancoServiceTest {
	// ClasseTest sempre quando for usar o Test é uma boa pratica toda classe
	// terminar em "ClasseTest"
	
	@After
	public  void close(){
		EntityManagerUtil.fechar();
	}
	
	@Test
	public void salvar() {

		BancoService bancoService = new BancoService();

		// Criamos os banco e setamos os nomes
		Banco bancoBradesco = new Banco();
		bancoBradesco.setNome("Bradesco");

		Banco bancoBrasil = new Banco();
		bancoBrasil.setNome("Banco do Brasil");

		// Aqui o objeto de banco service vai salvar no banco através do método
		// Salvar da classe BancoService
		bancoService.salvar(bancoBradesco);
		bancoService.salvar(bancoBrasil);

		Assert.assertNotNull("Id do Bradesco não pode ser nulo ", bancoBradesco.getId());
		Assert.assertNotNull("Id do Banco do Brasil não pode ser nulo ", bancoBrasil.getId());

	}
	
	@Test
	public void bucarPorId(){
		BancoService bancoService = new BancoService();
		Banco bancoBrasil = new Banco();
		bancoBrasil.setNome("Banco do Brasil");
		
		bancoService.salvar(bancoBrasil);
		
	Banco banco 		  = bancoService.buscarPorId(-1L);
	Banco bancoEncontrado = bancoService.buscarPorId(bancoBrasil.getId());
	
	Assert.assertNull(banco); //checa se é nulo se for vai dar certo se não vai quebrar o teste
	Assert.assertNotNull(bancoEncontrado); //Este é o contrário de assertNull
	Assert.assertEquals(bancoBrasil.getNome(), bancoEncontrado.getNome());
	}

}

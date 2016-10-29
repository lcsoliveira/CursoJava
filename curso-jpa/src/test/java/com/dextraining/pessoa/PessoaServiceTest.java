package com.dextraining.pessoa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import com.dextraining.jpa.EntityManagerUtil;

public class PessoaServiceTest {

	// Este método vai fechar a EntityManagerUtil
	@After
	public  void close() {
		EntityManagerUtil.fechar();
	}

	@Test
	public void salvar() throws ParseException {

		PessoaService pessoaService = new PessoaService(); // Criamos este
															// objeto
															// do tipo serviço
															// pois é através
															// dele que vamos
															// salvar os
															// arquivos do tipo
															// Pessoa

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Lucas");

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		pessoa.setDataDeNascimento(dateFormat.parse("04/07/1994"));

		pessoaService.salvar(pessoa);

		// Aqui vamos restringir como null ou notNull nas tabelas

		Assert.assertNotNull("Pessoa não pode ser null ", pessoa.getId());

	}

	@Test
	public void bucarPorId() throws ParseException {
		PessoaService pessoaService = new PessoaService();

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Lucas");

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		pessoa.setDataDeNascimento(dateFormat.parse("04/07/1994"));

		pessoaService.salvar(pessoa);

		Pessoa pessoaBusca = pessoaService.buscarPorId(-1L);
		Pessoa pessoaEncontrada = pessoaService.buscarPorId(pessoa.getId());

		Assert.assertNull(pessoaBusca);
		Assert.assertNotNull(pessoaEncontrada);
		Assert.assertEquals(pessoaEncontrada.getNome(), pessoa.getNome()); // Aqui
																			// ele
																			// vai
																			// compara
																			// se
																			// o
																			// id
																			// que
																			// está
																			// no
																			// banco
																			// é
																			// igual
																			// ao
																			// id
																			// que
																			// eu
																			// esperava
		
		

	}
	
	@Test
	public void buscarTodosTeste() throws ParseException{
		PessoaService pessoaService = new PessoaService();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Lucas");

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		pessoa.setDataDeNascimento(dateFormat.parse("04/07/1994"));

		pessoaService.salvar(pessoa);
		
		List<Pessoa> pessoas = pessoaService.buscarTodos();
		Assert.assertEquals(1, pessoas.size());
	}

}

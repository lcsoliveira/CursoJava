package com.dextraining.locadora;

import java.util.Arrays;
import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.dextraining.jpa.EntityManagerUtil;

public class FilmeServiceTest {

	// Criamos os objetos p/ serem inicializados

	private AtorService atorService;
	private FilmesService filmeService;
	private DiretorService diretorService;
	private CategoriasService categoriasService;

	// A notação @Before executa o comando antes de cada teste
	// Aqui no caso ela inicializa todos os Serviços antes de cada teste (todas
	// as vezes)

	@Before
	public void init() {
		this.atorService = new AtorService();
		this.filmeService = new FilmesService();
		this.diretorService = new DiretorService();
		this.categoriasService = new CategoriasService();
	}

	//Esta notação é executada depois de cada teste
	@After
	public void close() {
		EntityManagerUtil.fechar();
	}

	//lembrar que a notação @Test sempre vai ser void
	
	@Test
	public void salvarFilmeTest(){
		
		//Criamos um objeto do tipo CATEGORIA
		Categoria categoriaAcao = new Categoria();
		
		//Setamos um nome para a o objeto criado
		categoriaAcao.setNome("Ação");
		
		//No serviço categoriasService chamamos o método salvar passando o objeto caterioa ação 
		this.categoriasService.salvar(categoriaAcao);
		
		
		Categoria categoriaDrama = new Categoria();
		categoriaDrama.setNome("Drama");
		this.categoriasService.salvar(categoriaDrama);
		Diretor diretor = new Diretor();
		diretor.setNome("Copola");
		this.diretorService.salvar(diretor);

		Ator allPacino = new Ator();
		allPacino.setNome("All pacino");
		this.atorService.salvar(allPacino);

		Ator marlonBrando = new Ator();
		marlonBrando.setNome("Marlon Brando");
		this.atorService.salvar(marlonBrando);
		
		Filme filme = new Filme();
		
		filme.setNome("Poderoso Chefão");
		filme.setDataDeLancamento(new Date());
		
		//Passamos os filmes que vão ser adicionados nas listas
		filme.setCategorias(Arrays.asList(categoriaAcao, categoriaDrama));
		filme.setDiretor(diretor);
		filme.setAtores(Arrays.asList(allPacino, marlonBrando));
		
		
		filmeService.salvar(filme);
	
		//Comparamos se o ID do filme é null
		Assert.assertNotNull(filme.getId());
		
		
	}
	
	
}

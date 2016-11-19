package com.dextraining.locadora;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.dextraining.entidade.Entidade;

@Entity
public class Filme extends Entidade {

	@Column
	private Date dataDeLancamento;

	@Column
	private String nome;

	// Obs.: Sempre o que vem antes do TO é a classe onde eu estou no caso FILME
	// E depois do do TO vem a classe para onde quero relacionar no CASO diretor
	// Então le-se VARIOS FILMES PARA UM DIRETOR
	// SEMPRE QUE TERMINAR EM ONE Retorna um objeto e quando TERMINAR EM MANY
	// retorna uma LISTA

	@ManyToOne
	private Diretor diretor;

	@ManyToMany
	private List<Categoria> categorias;

	@OneToMany
	private List<Ator> atores;

	public Date getDataDeLancamento() {
		return dataDeLancamento;
	}

	public void setDataDeLancamento(Date dataDeLancamento) {
		this.dataDeLancamento = dataDeLancamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public List<Ator> getAtores() {
		return atores;
	}

	public void setAtores(List<Ator> atores) {
		this.atores = atores;
	}

}

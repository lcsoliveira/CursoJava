package com.dextraining.banco;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Banco {

	// Por padrão toda entidade tem um Id
	// Obs.: Ctrl + shift + o comando para importar tudo que estiver sendo
	// reclamado

	@Id

	@GeneratedValue(strategy = GenerationType.AUTO) // Para o banco gerar uma
													// entidade para mim ,
													// passamos o Id em branco o
													// banco gera e devolve um
													// Id
	private Long id;

	@Column
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

package com.dextraining.locadora;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.dextraining.entidade.Entidade;

@Entity
public class Ator extends Entidade {

	@Column
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

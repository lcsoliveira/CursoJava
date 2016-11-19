package com.dextraining.locadora;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.dextraining.entidade.Entidade;

//Definimaos como uma entidade 
@Entity
public class Categoria extends Entidade {

	@Column
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

package com.dextraining.pessoa;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Pessoa {

	@Id
	
	@GeneratedValue(strategy = GenerationType.AUTO) 
	
	private Long id;
	
	@Column(length = 50, nullable = false) //difine o tamanho da String nome, e diz que ela não pode ser nula
	private String nome;
	
	@Column(name = "data_nascimento") //notação column é opcional tudo que estiver dentro de uma Entity
	
	
	@Temporal(TemporalType.DATE)
	private Date dataDeNascimento;

	
		
	
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

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		
		
		this.dataDeNascimento = dataDeNascimento;
	} 
	
	
	
	
	
	
	
	
}

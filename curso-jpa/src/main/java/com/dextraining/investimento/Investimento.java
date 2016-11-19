package com.dextraining.investimento;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.dextraining.jpa.EntityManagerUtil;

@Entity
public class Investimento {

	@Id 
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	
	private Long id;
	
	
	@Column(nullable = false) // aqui não permitimos valores nulos 
	private String descricao;
	
	
	@Column(nullable = false)
	private Double valor;

	@Column(nullable = false)
	private Double rendimentoMensal;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getRendimentoMensal() {
		return rendimentoMensal;
	}

	public void setRendimentoMensal(Double rendimentoMensal) {
		this.rendimentoMensal = rendimentoMensal;
	}
	
	
	
	
	

}

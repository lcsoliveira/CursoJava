package Equipamento;

import java.io.ObjectInputStream.GetField;

public class Impressora extends Eletronico {

	private int pontosPorPolegada;

	/**
	 * Toda vez que fazemos um extends os construtores não serão herdados pelas
	 * classes filhas Temos que criar um construtor manualmente existem duas
	 * maneiras pra isso
	 */

	// toda classe em java extends da classe em Object

	// o super tem que ser o primeiro argumento a ser chamado pelo construtor
	// "pois um filho não pode existir antes de existir o pai"
	
	public Impressora(String fabricante, double preco, int pontosPorPolegada) {
		super(fabricante, preco);
		this.pontosPorPolegada = pontosPorPolegada;
	}

	
	
	public int getPontosPorPolegada() {
		return pontosPorPolegada;
	}

	public void setPontosPorPolegada(int pontosPorPolegada) {
		this.pontosPorPolegada = pontosPorPolegada;
	}

	public void imprimir() {
		System.out.println("imprimir");
	}
	
	
	/*public double getPreco(){
		System.out.println("Exemplo sobre escrevendo o método da classe pai");
		
		return super.getPreco(); // aqui estamos chamando o super lá da classe pai 
		
	}*/
	
}

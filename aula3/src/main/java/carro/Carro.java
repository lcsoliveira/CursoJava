package carro;

public class Carro {

	String marca; 
	String modelo;
	String cor;
	
	int anoFabricacao;
	int velocidade;
	
	public Carro(String marca, String modelo, String cor, int anoDeFabricacao){
		
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.anoFabricacao = anoDeFabricacao;
		this.velocidade = 0;
	}
	
	public void acelerar(){
		velocidade++;
	}
	
	public void freiar(){
		
		if(velocidade > 0){
		velocidade --;
		}
	
	}
	
	
	
	
	
}

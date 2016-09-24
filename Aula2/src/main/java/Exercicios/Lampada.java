package Exercicios;

public class Lampada {

	
	String 	watts;
	String  fabricante;
	
	boolean ligada;
	
	public Lampada(String watts, String Fabricante){
		this.watts = watts;
		this.fabricante = Fabricante;
	}
	
	public void ligar(){
		
		System.out.println("Ligada");
		this.ligada = true;
	}
	
	public void Desligar(){
		
		System.out.println("Desligada");
		this.ligada = false;
	}
	
	public boolean estaLigada(){
		return  ligada;
	}
	
	public String toString(){
		return watts +"\n"+ fabricante+"\n";
	}
	
}

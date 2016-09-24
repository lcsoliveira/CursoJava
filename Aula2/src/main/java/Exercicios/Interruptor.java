package Exercicios;

public class Interruptor {
	
	Lampada lampada; 
	/* -> significa que está classe
					interruptor está recebendo um objeto do tipo lampada */
	
	public Interruptor(Lampada lampada){
				
		this.lampada = lampada;
		
	}
	
	public void apertar(){
		if(lampada.estaLigada()){
			lampada.Desligar();
		}
		else{
			lampada.ligar();
		}
		
	}
	
	
	
}

package Exercicios;

public class TestaLampada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Lampada lampada = new Lampada("260 W", "100%");
		
		Interruptor interruptor = new Interruptor(lampada);
		
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		
		System.out.println("potência: "+ lampada);
		
	}

}

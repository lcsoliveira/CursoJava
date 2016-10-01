package carro;

public class Testacarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Carro primeiroCarro = new Carro("Ferrari", "430 scudeira", "vermelha",2009);
		
		Carro segundoCarro = new Carro("Fiat", "Uno", "Branco",2012);
		
		primeiroCarro.acelerar();
		primeiroCarro.acelerar();
		primeiroCarro.freiar();
		primeiroCarro.acelerar();
		
		segundoCarro.acelerar();
		segundoCarro.acelerar();
		segundoCarro.acelerar();
		segundoCarro.freiar();
		segundoCarro.freiar();
		
		System.out.println(primeiroCarro.velocidade);
		System.out.println(segundoCarro.velocidade);
		
		
		
		
	}

}

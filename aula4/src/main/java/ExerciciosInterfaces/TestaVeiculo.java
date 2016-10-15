package ExerciciosInterfaces;

import java.util.Scanner;

public class TestaVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Garagem garagem = new Garagem();

		//CalcularPedagio calcularPedagio = new CalcularPedagio(2);

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("menu");
		System.out.println("1-adicionar: ");
		System.out.println("2-vender: ");
		System.out.println("3-Buscar: ");
		System.out.println("4-Listar: ");
		System.out.println("5-Sair: ");
		
		
		
		int op = scanner.nextInt();
			
			switch (op) {
					
			case 1:
				
				
				Carro carro = new Carro();
				
				System.out.println("Informe a placa: ");
				carro.setPlaca(scanner.next());		
				
				System.out.println("Informe o modelo: ");
				carro.setModelo(scanner.next()) ;
				
				System.out.println("Informe a marca: ");
				carro.setMarca(scanner.next());
				
				System.out.println("Informe o ano: ");
				carro.setAno(scanner.nextInt())  ;
				
				System.out.println("Informe o preco: ");
				carro.setPreco(scanner.nextDouble());
				
				
				garagem.Adicionar(carro);
				
				
				garagem.Adicionar(null);
				break;
			case 2:
				 garagem.Vender();
				break;
			case 3:
				garagem.Buscar();
				break;
			case 4:
				garagem.Listar();
				break;
		
			case 5:
				break;

			default:
				System.out.println("Opção inválida");

			}

		

		//System.out.println(carro.getClass().getSimpleName() + ": "
		//		+ calcularPedagio.calcular(carro));
		//System.out.println("Caminhao: " + calcularPedagio.calcular(caminhao));
		//System.out.println("Moto: " + calcularPedagio.calcular(moto));
		// System.out.println("Bicicleta: " );

	}

}

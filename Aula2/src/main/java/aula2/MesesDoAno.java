package aula2;

import java.util.Scanner;

public class MesesDoAno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int meses;
		
		System.out.println("Informe o mês desejado: ");
		
		Scanner scanner = new Scanner(System.in);
		
		meses = scanner.nextInt();
		
		// você entra direto no mês desejado 
		switch (meses) {
			
				case 1:  System.out.println("Janeiro");
				case 2:  System.out.println("Fevereiro");
				case 3:  System.out.println("Março");		
				case 4:  System.out.println("Abril");
				case 5:  System.out.println("Maio");
				case 6:  System.out.println("Junho");
				case 7:  System.out.println("Julho");
				case 8:  System.out.println("Agosto");
				case 9:  System.out.println("Setembro");
				case 10: System.out.println("Outubro");
				case 11: System.out.println("Novembro");
				case 12: System.out.println("Dezembro");
		
		break;
		
		default:
			System.out.println("Digite um mês válido");
		
		}
		
		
		
		
	}

}

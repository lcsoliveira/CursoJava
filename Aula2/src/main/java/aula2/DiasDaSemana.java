package aula2;

import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("informe o valor numerico do dia da semana desejado: ");
		int diaSemana = scanner.nextInt();
		
		
		
		
		switch (diaSemana) {
		
		case 1: System.out.println("segunda");  break;
		case 2: System.out.println("terça"); 	break;
		case 3: System.out.println("quarta");   break;
		case 4: System.out.println("quinta"); 	break;
		case 5: System.out.println("sexta"); 	break;
		case 6: System.out.println("sábado");   break;
		case 7: System.out.println("domingo");  break;
		
		default:
			System.out.println("dia inválido");
		
			
		
		
	}

}
}

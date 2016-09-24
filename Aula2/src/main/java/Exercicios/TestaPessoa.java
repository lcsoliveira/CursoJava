package Exercicios;

import java.util.Scanner;

public class TestaPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Entre com seus dados: ");
	
		Scanner scanner = new Scanner(System.in);
		
		String nome =  scanner.nextLine();
		String rg = scanner.nextLine();
		String cpf = scanner.nextLine();
		
		
		Pessoa pessoa = new Pessoa(nome,rg,cpf);
				
		System.out.println(pessoa);
		
	}

}

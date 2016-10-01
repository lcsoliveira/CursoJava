package Arrays;

import java.util.Scanner;

public class InverteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/**
		 * le a os numeros pelo teclado
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("informe a quantidade de numeros: ");

		int n = scanner.nextInt();
		
		/**
		 * Cria um array de numeros do tipo iteiro 
		 */
		int[] numeros = new int[n];

		
		
		/**
		 * Laço de repetição vai de zero até numeros
		 * vai pegar a posição do array
		 * e vamos entrar com  valores dentro da posição de cada elemento do vetor
		 */
		for (int i = 0; i < numeros.length; i++) {

			System.out.println("informe os numero na posição " + i + " :");
			numeros[i] = scanner.nextInt();

		}
		
		/**
		 * aqui vamos inverter o numeros 
		 * de forma que o laço vai iniciar no final do array  int j = numeros.length - 1
		 * ele pega o valor informado de numeros e faz menos um para ilustrar a posição do vetor
		 * Ele vai do final do vetor até a posição zero 
		 * E o decremento é porque em vez de aumentar estamos fazendo processo contrário 
		 */

		for (int j = numeros.length - 1; j >= 0; j--) {
			System.out.println(numeros[j]);
		}
	}

}

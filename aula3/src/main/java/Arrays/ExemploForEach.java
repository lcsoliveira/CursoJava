package Arrays;

import java.util.Scanner;

public class ExemploForEach {
	
	public static void main(String[] args) {
			
	

		int[] arrayDeNumeros = new int[10];
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		/**
		 * Você criou um FOR que ele vai de que vai contar as posições de um array através do length
		 * E insirir em cada posição do vetor um valor lido pelo teclado
		 */
		
		
		for(int i = 0; i < arrayDeNumeros.length ; i ++ ){
			
			System.out.println("numeros ["+ i + "] = ");
			arrayDeNumeros[i] = scanner.nextInt();
		}
		
		/**
		 * Este é o forEach
		 * Aqui o própio for vai determinar seu ponto de partida, não precisamos inicializalo
		 * Ideal para laços interativos onde se deseja percorrer os elementos do vetor 
		 */
		
		for(int numero : arrayDeNumeros ){
			
			System.out.println(numero);
		}
	
	scanner.close();
	
	}
}

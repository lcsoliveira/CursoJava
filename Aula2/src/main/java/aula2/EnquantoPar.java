package aula2;

import java.util.Scanner;

public class EnquantoPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 0, numerosPares = 0 ; 
		
		System.out.println("informe um numero: ");
	
		Scanner scanner = new Scanner(System.in);
		
		numero = scanner.nextInt();
		
		for(int i = 1 ; i <= numero ; i ++){
						
			if(i % 2 == 0 ){
			
				System.out.println(i);
				numerosPares++;
			}
			
			if(numerosPares == 10){
				break;
			}
			
			scanner.close();
		}
		
	
		
		
		
	}

}

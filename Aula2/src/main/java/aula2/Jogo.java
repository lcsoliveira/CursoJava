package aula2;

import java.util.Random;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tentativas = 0, numero, jogueDeNovo= 0;
		
		numero = new Random().nextInt(10) + 1; 
		
		// o numero tem que ser gerado fora do laço para pois este é gerado uma unica vez
		
		do{	
		 
			System.out.println("informe um numero: ");
			
			Scanner scanner  = new Scanner(System.in);
			
			jogueDeNovo = scanner.nextInt(); 
			
			// aqui você cria uma terceira variavel porque NUMERO é a varial gerada inicial
			// tentativas ela vai ficar contando toda vez que der um loop(rodar de novo) 
			// então jogueDeNovo ela só vai ser informada caso o usuário errar o numero gerado pela variavel numero
			
			tentativas++;
			
			if(numero != jogueDeNovo){
				System.out.println("Você erroru, joque de novo!");
			}
		}
		
		while(numero != jogueDeNovo); 
		
		/* você usa a comparação diferente  ( != ) porque ENQUANTO  o numero random gerado
		 não for igual ao JogueDeNovo ele continua rodando   */
		
		System.out.println("Parabéns você acertou em "+ tentativas +" tentativas");
		
		
		
		
		
		
	}

}

package Set;

import java.util.HashSet;
import java.util.Set;

public class TestarSets {

	public static void main(String[] args) {
		// Quando eu uso set não podemos utilizar parametros iguais

		Set<String> meuSet = new HashSet<>();

		// Com set nós não conseguimos dizer onde o elemento vai ser adicionado
		// porque não temos indice
		// meuSet.add(e);

		// Quando criamos uma lista de um tipo especifico para comparar temos
		// que usar o comparable ou comparartor

		meuSet.add("valor 1");
		meuSet.add("valor 2");
		meuSet.add("valor 3");
		meuSet.add("valor 4");
		meuSet.add("valor 4"); // observe que o quatro não foi adicionado duas vezes
		
		//no set não podemos usar o método sort para ordenação, ele só pode ser utilizado por uma lista
								

		for (String valor : meuSet) {
			System.out.println(valor);
		}

	}

}

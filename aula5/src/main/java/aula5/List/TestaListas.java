package aula5.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		List minhaLista = new ArrayList();
		List minhaOutraList = new LinkedList();
		
		minhaLista.add("Teste");
		minhaLista.add("Outra coisa");
		minhaLista.add(1);
		
		
		for(Object object  : minhaLista){
			System.err.println( object);
		}
			
		System.out.println();
		
		List<String> minhaListaString = new ArrayList<String>();
		
		minhaListaString.add("valor 1");
		minhaListaString.add("valor 2");
		minhaListaString.add("valor 3");
		minhaListaString.add("valor 4");
		
		
		int indexOf = minhaListaString.indexOf("valor 3");
		System.out.println("Valor 3 está na posicao " + indexOf);
		
		
		System.out.println("minhaListaString");
		for(String valor : minhaListaString){
			System.out.println(valor);
		}
		
		
		
	}

}

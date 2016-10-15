package aula5.List;

import java.util.ArrayList;
import java.util.List;

public class TestaListaPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		
		pessoas.add(new Pessoa("Juquinha ", "1" ));
		pessoas.add(new Pessoa("Zequinha ", "2" ));
		pessoas.add(new Pessoa("Joao ", 	"3" ));
		pessoas.add(new Pessoa("Maria ", 	"4" ));
		pessoas.add(new Pessoa("José ", 	"5" ));
		
		boolean contains = pessoas.contains(PessoaParaBusca));
		
		int indexOf = pessoas.indexOf(pessoaParaBusca);
		
		
		System.out.println("indexOf Jose"+ indexOf);
		System.out.println("Pessoas.contains" + contains);
		System.out.println("pessoas.size "+ pessoas.size());
		System.out.println("pessoas.isEmpty "+ pessoas.isEmpty());
		
		
		for(Pessoa pessoa : pessoas){
			System.out.println(pessoa.getNome()+ " - "+ pessoa.getCpf());
		}
		
	}

}

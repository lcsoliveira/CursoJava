package Set;

import java.util.Comparator;

import aula5.List.Pessoa;

public  class PessoaPorNomeComparator implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa pessoa, Pessoa outraPessoa) {
		
		return pessoa.getNome().compareTo(outraPessoa.getNome());
	}

}

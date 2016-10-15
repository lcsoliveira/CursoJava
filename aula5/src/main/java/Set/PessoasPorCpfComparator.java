package Set;

import java.util.Comparator;

import aula5.List.Pessoa;

public class PessoasPorCpfComparator implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa pessoa, Pessoa outraPessoa) {
		// TODO Auto-generated method stub
		return pessoa.getCpf().compareTo(outraPessoa.getCpf());
	}
	// Esse método retorna 0 <, > 0 ou = 0
}

package Mapa;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import aula5.List.Pessoa;

public class TestarMap {
	
	public static void main(String[] args) {
		Map<String,Pessoa> pessoasPorCpf = new HashMap<>();
		
		pessoasPorCpf.put("0", new Pessoa("Juquinha","0"));
		pessoasPorCpf.put("1", new Pessoa("Julia","1"));
		pessoasPorCpf.put("2", new Pessoa("Maria","2"));
		pessoasPorCpf.put("0", new Pessoa("Jessica","0"));
		
		System.out.println("pessoasPorCpf.size: "+ pessoasPorCpf.size());
		System.out.println("PessoasPorCpf.containsKey(10) "+ pessoasPorCpf.containsKey("10"));
		System.out.println("pesssoaPorCpf.containsKey(0)"+ pessoasPorCpf.containsKey(0));
		
		
		
		Pessoa pessoa = pessoasPorCpf.get("3");
		System.out.println("Chave 3 "+ pessoa.getNome());
		System.out.println("chave 20" + pessoasPorCpf.get("20"));
		
		Set<Entry<String,Pessoa>> entrySet = pessoasPorCpf.entrySet();
		
		for(Entry<String, Pessoa> entry: entrySet){
			System.out.println(entry.getKey() +  ": " + entry.getValue().getNome());
		}
		
	}

}	

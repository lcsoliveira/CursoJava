package Pessoa;

public class PessoaFisica extends Pessoa {

	private String CPF;

	//Construtor 
	public PessoaFisica(String nome, String CPF) {
		super(nome);
		this.CPF = CPF;
	}
	
	
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

}

package Pessoa;

public class PessoaJuridica extends Pessoa {

	private String CNPJ;

	// Construtor

	public PessoaJuridica(String nome, String CNPJ) {
		super(nome);
		this.CNPJ = CNPJ;
	}

	/** Getters & Setter **/

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

}

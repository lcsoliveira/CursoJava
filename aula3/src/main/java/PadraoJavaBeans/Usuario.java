package PadraoJavaBeans;

public class Usuario {

	private String nome;
	private String email;
	private String senha;

	public Usuario(String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.setSenha(senha);
	}

	public boolean alteraSenha(String valor) {
		
		 // cria as variaveis do tipo boolean para verificar se ele tem digito e letra 
		
		/**
		 * Aqui ele verifica se a senha possuia letra para a validação
		 */
		
		boolean temLetra = false; // variavel inicia em pois ela ainda não passou pelo método.

		for (int i = 0; i < valor.length(); i++) {

			if (Character.isLetter(valor.charAt(i))) {
				temLetra = true; // caso ele tenha ele  da um true e continua no método 
			}
		}

		/**
		 * Aqui ele verifica se o método possui digito para validação 
		 */
		
		boolean temDigito = false;
		
		for (int j = 0; j < valor.length(); j++) {

			if (Character.isDigit(valor.charAt(j))) {
				temDigito = true; // caso ele tenha ele  da um true e continua no método
			}
		}
		return temDigito && temLetra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {

		if (senha.length() >= 5 && alteraSenha(senha)) {
			this.senha = senha;
		} else {

			System.out.println("Senha inválida");

		}
	}

	public String toString() {

		return "nome: " + nome + "\n" + "\n" + "email: " + email + "\n" + "\n"
				+ "senha: " + senha;

	}

}

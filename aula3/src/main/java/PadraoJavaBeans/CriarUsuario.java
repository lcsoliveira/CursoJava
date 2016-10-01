package PadraoJavaBeans;

import java.util.Scanner;

public class CriarUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String nome;
		String email;
		String senha;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um nome: ");
		nome = scanner.next();
		
		System.out.println("Informe um email: ");
		email = scanner.next();
		
		System.out.println("Informe uma senha: ");
		senha = scanner.next();

		Usuario usuario = new Usuario(nome, email, senha);
		
		System.out.println(usuario.getNome());
		System.out.println(usuario.getEmail());
		System.out.println(usuario.getSenha());
		
		
		
		
	
		
	}

}

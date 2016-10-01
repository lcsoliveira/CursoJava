package ExerciciosBiblioteca;

import java.util.Date;

public class Livro {
	
	String autor;
	String titulo;
	Date dataPublicacao;
	
	
	public Livro(String codigo, String autor, String titulo, Date dataPublicacao){
		
		this.autor = autor;
		this.titulo = titulo;
		this.dataPublicacao = dataPublicacao;
		
	}

}

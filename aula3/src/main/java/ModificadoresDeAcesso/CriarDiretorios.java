package ModificadoresDeAcesso;

public class CriarDiretorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//no caso o aqui não estamos atrelando o construtor a nenhuma estância
		 
		 new Diretorio();
		 new Diretorio();
		 new Diretorio();
		 new Diretorio();

		System.out.println(Diretorio.quantidade);
		
		
		// Quando você instância o objeto a classe, ele chama o construtor uma vez para cada objeto 
		   
		// Quando ele é static ele cria aquele construtor N vezes para aquela classe 
		
		//método static ele não precisa de instância para inicializar aquele metodo 
		
		//e um método static não consegue acessar métodos ou atributos que não sejam estaticos
		
		// também não consiguimos utilizat o this porque o this  faz uma estancia 
		
	}
}

package ExerciciosInterfaces;

public class Caminhao extends Veiculo implements PagaPedagio{
	
	
	private String marca; 
	private String modelo;
	private String pĺaca;
	private int    ano;
	private double preco;
	private int quantidadesEixos;
	
	
	public Caminhao(int quantidadeEixos) {
		
		this.quantidadesEixos = quantidadeEixos;
		
	}
		
	
	public int quantidadeEixo() {
	
		return this.quantidadesEixos;
	}

}

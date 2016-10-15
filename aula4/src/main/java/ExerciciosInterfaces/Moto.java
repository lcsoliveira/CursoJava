package ExerciciosInterfaces;

public class Moto extends Veiculo implements PagaPedagio{
	
	
	private String marca; 
	private String modelo;
	private String pĺaca;
	private int    ano;
	private double preco;
	int eixo = 1;

	public int quantidadeEixo() {
		
		return this.eixo;
	}
	
}

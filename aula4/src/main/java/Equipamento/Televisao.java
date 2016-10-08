package Equipamento;

public class Televisao extends Equipamento {

	// Construtor passando os argumentos da classe pai
	// Invocando os argumentos da classe pai
	
	public Televisao(String fabricante, double preco) {
		super(fabricante, preco);
	}
	
	
	
	@Override
	public double calcularPrecoFinal(){
		
	 
	 //double preco = 0.02;
	 
	// preco = (0.02 * this.getPreco())+this.getPreco();
	 
	// preco = preco + this.getPreco();
	 
		
		return getPreco() * 1.02;
		
	}
	
	

}

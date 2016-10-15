package ExerciciosInterfaces;

public class CalcularPedagio   {

	
	private double valorPorEixo = 7.00;
	
	public CalcularPedagio(int valorPorEixo){
		this.valorPorEixo =  valorPorEixo;
	}
	
	


	public double calcular(PagaPedagio tipoCarro) {
		
		
		return tipoCarro.quantidadeEixo()*valorPorEixo ;
	}




	
	
	
	
}

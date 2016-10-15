package ExerciciosInterfaces;

public class Carro extends Veiculo implements PagaPedagio {

	private String marca;
	private String modelo;
	private String placa;
	private int ano;
	private double preco;
	private int eixo = 1;

	

	public int quantidadeEixo() {

		return this.eixo;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getPlaca() {
		return placa;
	}



	public void setPlaca(String placa) {
		this.placa = placa;
	}



	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}



	public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}



	public int getEixo() {
		return eixo;
	}



	public void setEixo(int eixo) {
		this.eixo = eixo;
	}



	
	
	
	
	
}

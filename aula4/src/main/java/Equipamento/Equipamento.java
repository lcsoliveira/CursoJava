package Equipamento;

public class Equipamento {

	private double preco;
	private String fabricante;

	public Equipamento(double preco) {
		this.preco = preco;

	}

	public Equipamento(String fabricante, double preco) {

		this.fabricante = fabricante;
		this.preco = preco;

	}

	// Método retornando um double Preco
	public double calcularPrecoFinal() {

		return this.preco; // aqui não precisariamos usar o this pois não existe
							// nenhuma outra váriavel chamada "preco"
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}

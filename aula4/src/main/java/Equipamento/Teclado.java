package Equipamento;

import java.io.ObjectInputStream.GetField;

public class Teclado extends Equipamento {

	// Como não existe construtor vazio na minha super classe somso obrigados a
	// chamar manualmente
	// public Teclado(){

	// }

	public Teclado(String fabricante, double preco, String layOut) {
		super(fabricante, preco);
		this.layOut = layOut; // chamamos pelo this.layOut pois este atributo
								// pertence somente a classe Telcado
	}

	private String layOut;

	public String getLayOut() {
		return layOut;
	}

	public void setLayOut(String layOut) {
		this.layOut = layOut;
	}

	public void teclar() {
		System.out.println("Telcando....  ");
		;
	}

}

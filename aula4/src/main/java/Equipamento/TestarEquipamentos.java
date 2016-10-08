package Equipamento;

public class TestarEquipamentos {

	public static void main(String[] args) {
		/**
		 * Repare que ambos possuem o GET PRECO pois estes herdam o método preco
		 * pois ambas as classes estão estendidas a classe base que é
		 * Equipamentos
		 */

		/**
		 * Mas os métodos especificos da própia classe pertence somente a ela
		 * 
		 * Por exemplo o método GET pontosPorPolegada(); e getlayOut();
		 */

		// crtl + shift + F ele identa o código automaticamente

		Equipamento impressora = new Impressora("Hp", 500.00, 40);

		Equipamento teclado = new Teclado("Microsoft", 50.00, "pt_br");

		Equipamento televisao = new Televisao("sony", 2000.00);

		Equipamento cadeira = new Cadeira("Fm", 800.00);

		double valorTotal = imprimirPrecosFinais(televisao, cadeira, impressora);
		System.out.println("Valor total: " + valorTotal);
		
		
		//System.out.println(televisao.calcularPrecoFinal());

	}

	public static double imprimirPrecosFinais(Equipamento... equipamentos) {

		double valorTotal = 0;

		for (Equipamento equipamento : equipamentos) {
			System.out.println(equipamento.getClass().getSimpleName() + ": "
					+ equipamento.calcularPrecoFinal());
			
			valorTotal += equipamento.calcularPrecoFinal();

		}
		return valorTotal; 
	}
}

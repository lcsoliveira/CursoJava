package SimuladorDeCalculo;

public class FolhaDePagamento {

	public double calcular(Funcionario... funcionarios) {

		double valorToltal = 0;

		for (Funcionario funcionario : funcionarios) {

			System.out.println(funcionario.getClass().getSimpleName() + ": "
					+ funcionario.getSalarioComBonificacao());

			valorToltal += funcionario.getSalarioComBonificacao();
		}

		return valorToltal;

	}

}

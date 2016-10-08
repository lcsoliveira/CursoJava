package SimuladorDeCalculo;

public class TestaFuncionarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario gerente = new Gerente("lucas", 5000.00);
		Funcionario supervisor = new Supervisor("Jessica", 1500.00);
		Funcionario secretaria = new Secretaria("karol", 600.00);

		// Criamos esse objeto pois o que queremos descubrir é o valor de cada
		// funcionário que está contido na classe folha de pagamento

		FolhaDePagamento folhaRecebe = new FolhaDePagamento();

		System.out.println("Valor total: "
				+ folhaRecebe.calcular(gerente, supervisor, secretaria));

		// Passando valores por get and set

		// gerente.setNome("Lucas");
		// gerente.setSalario(5000.00);

		// supervisor.setNome("Oliveira");
		// supervisor.setSalario(3000.00);

		// secretaria.setNome("Jessica");
		// secretaria.setSalario(1500.00);

	}

}

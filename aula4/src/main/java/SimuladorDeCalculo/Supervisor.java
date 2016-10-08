package SimuladorDeCalculo;

public class Supervisor extends Funcionario {

	public Supervisor(String nome, double salario) {

		super.setNome(nome);
		super.setSalario(salario);
	}

	@Override
	public double getPorcentagemAdicional() {

		return 0.1;
	}

}

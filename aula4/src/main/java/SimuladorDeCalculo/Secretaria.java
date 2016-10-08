package SimuladorDeCalculo;

public class Secretaria extends Funcionario {

	public Secretaria(String nome, double salario) {

		super.setNome(nome);
		super.setSalario(salario);
	}

	@Override
	public double getPorcentagemAdicional() {

		return 0;
	}

}

package SimuladorDeCalculo;

public abstract class Funcionario {

	private String nome;
	private double salario;

	
	
	
	
	
	public abstract double getPorcentagemAdicional();
	
	
	
	

	/* Getters and Setters */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioComBonificacao() {
		return salario * (1 + getPorcentagemAdicional());
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}

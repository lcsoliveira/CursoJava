package ExercicioFuncionario;

public class Funcionario {

	/**
	 * Você vai criar sua classe usando o padrão JavaBeans
	 * 
	 * Todos os atributos são Private e usamos getters and Setters
	 */
	
	private String nome;
	private String cargo;
	private double salario;
	private double porcentagemBonificacao;
	
	
	public Funcionario(String nome, String cargo, double salario, double porcentagemBonificacao ){
		
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.porcentagemBonificacao = porcentagemBonificacao;
		
	}
	
	
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		
		if(salario > this.salario){
		
		this.salario = salario;
		}
		
	}
	
	public double getPorcentagemBonificacao() {
		return porcentagemBonificacao;
	}
	
	public void setPorcentagemBonificacao(double porcentagemBonificacao) {
		this.porcentagemBonificacao = porcentagemBonificacao;
	}
	
	
		
	
	
	
	
	
}

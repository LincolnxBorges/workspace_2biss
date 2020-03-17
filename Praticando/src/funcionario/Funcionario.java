package funcionario;

public class Funcionario {
	
	private String nome;
	private String data;
	private String cargo;
	private String departamento;
	private double salario;
	
	public double salarioCargo() {
		double salario = this.salario;
		if(salario <= 2000) {
			System.out.println("Você é estagiario com salário de: R$" + salario);
		} else if(salario > 2000 && salario <= 4000) {
			System.out.println("Você é Jr com salário de: R$" + salario);
		} else if(salario > 4000 && salario <= 6000) {
			System.out.println("Você é Pleno com salário de: R$" + salario);
		} else {
			System.out.println("Você é Sênior com salário de: R$" + salario);
		}
		
		return salario;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + "\n"+ 
				"Data de admissão: " + this.data + "\n"+ 
				"Cargo: " + this.cargo + "\n"+ 
				"Departamento: " + this.departamento;
	}
	
}

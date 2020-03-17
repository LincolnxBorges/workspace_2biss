package main;

import funcionario.Funcionario;

public class Teste {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Lincoln");
		f1.setData("27/05/2020");
		f1.setCargo("Java Jr");
		f1.setDepartamento("Desenvolvedor Back-end");
		f1.setSalario(8000);
		
		System.out.println(f1.toString());
		f1.salarioCargo();
		
	}

}

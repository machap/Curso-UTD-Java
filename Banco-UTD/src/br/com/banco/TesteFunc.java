package br.com.banco;

public class TesteFunc {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		
		f.setNome("Teste");
		f.setSalario(1000.0);
		f.setDataAdmissao("01/01/2000");
		f.setDepartamento("TI");
		f.setRg("99999999");
		
		Empresa emp = new Empresa();
		
		for(int i=0; i < 10; i++) {
			emp.adiciona(f);
		}
		
		emp.exibir();
		
	}

}

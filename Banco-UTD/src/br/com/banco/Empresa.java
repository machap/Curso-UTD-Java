package br.com.banco;

public class Empresa {

	private String nome;
	private String cnpj;
	private Funcionario[] funcionarios = new Funcionario[10];

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void adiciona(Funcionario func) {

		for (int i = 0; i < 10; i++) {
			if (funcionarios[i] == null) {
				funcionarios[i] = func;
				break;
			}
		}
	}

	public void exibir() {
		for (int i = 0; i < 10; i++) {
			if (funcionarios[i] == null) {
				break;
			} else {
				System.out.println(funcionarios[i].getNome());
				System.out.println(funcionarios[i].getDepartamento());
				System.out.println(funcionarios[i].getDataAdmissao());
				System.out.println(funcionarios[i].getSalario());
				System.out.println(funcionarios[i].getRg());
				
			}
		}
	}

}

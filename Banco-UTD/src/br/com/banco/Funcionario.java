package br.com.banco;
public class Funcionario {
	
	private String nome;
	private String departamento;
	private double salario;
	private String dataAdmissao;
	private String rg;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void receberAumento(double valor){
		this. salario += valor;
	}

	public double calculaGanhoAnual(){
		return (salario * 12);
	}

	public void exibir(){

		System.out.println("Nome: "+ this.nome);
		System.out.println("departamento: "+ this.departamento);
		System.out.println("salario: "+ this.salario);
		System.out.println("Data: "+ this.dataAdmissao);
		System.out.println("RG: "+ this.rg);
		System.out.println("Ganho Anual: "+ calculaGanhoAnual());
	}

}
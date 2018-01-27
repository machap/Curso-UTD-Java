package br.com.banco;

public class Cliente{
	
	private String nome;
	private String sobreNome;
	private String cpf;

	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getsobreNome(){
		return this.sobreNome;
	}
	public void setSobreNome(String sobreNome){
		this.sobreNome = sobreNome;
	}
	public String getCpf(){
		return this.cpf;
	}
	public void setCpf(String cpf){
		this.cpf = cpf;
	}

}
package br.com.calcula.model;

public class Retangulo extends Calculo {

	private double comprimento, largura;

	public double getComprimento() {
		return comprimento; 
	} 

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	@Override
	public double calculoArea() {

		return (this.comprimento * this.largura);
	}

	public Retangulo() {

	}

	public Retangulo(double comprimento, double largura) {

		this.comprimento = comprimento;
		this.largura = largura;

	}

}

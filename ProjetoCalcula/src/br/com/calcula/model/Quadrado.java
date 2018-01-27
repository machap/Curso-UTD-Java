package br.com.calcula.model;

public class Quadrado extends Calculo {

	private double lado;

	public double getLado() {
		return this.lado;
	} 

	public void setArea(double lado) {
		this.lado = lado;
	}

	@Override
	public double calculoArea() {
		
		return (this.lado * this.lado);
	}

	public Quadrado() {

	}

	public Quadrado(double lado) {
		this.lado = lado;
	}

}

package br.com.calcula.model;

public class Circulo extends Calculo {

	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio; 
	}

	@Override
	public double calculoArea() {

		return (Math.PI * this.raio * this.raio);
	}
	
	public Circulo() {
		 
	}
	public Circulo(double raio) {
		this.raio = raio;
	}

}

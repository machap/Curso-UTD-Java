package br.com.calcula.model;

import javax.swing.JOptionPane;

public class Triangulo extends Calculo {

	private double ladoA, ladoB, ladoC;
	private double base, altura;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	} 

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}

	public boolean verificaTriangulo(double a, double b, double c) {

		if (a < (b + c) && b < (a + c) && c < (a + b)) {

			if (a == b && b == c) {
				JOptionPane.showMessageDialog(null, "Triangulo Equilatero ! ", "Tipo", 1);
				
			} else if (a == b || b == c || a == c) {
				JOptionPane.showMessageDialog(null, "Triangulo Isosceles ! ", "Tipo", 1);
				
			} else {
				JOptionPane.showMessageDialog(null, "Triangulo Escaleno ! ", "Tipo", 1);
				
			}
			
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "As medidas não formam um triangulo ! ", "Erro", 3);
			
			return false;
		}

	}

	@Override
	public double calculoArea() {

		return ((this.base * this.altura) / 2);
	}

	public Triangulo() {

	}

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public Triangulo(double a, double b, double c) {
		this.ladoA = a;
		this.ladoB = b;
		this.ladoC = c;
	}

}

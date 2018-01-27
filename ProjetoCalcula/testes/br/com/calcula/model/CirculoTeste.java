package br.com.calcula.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CirculoTeste {

	@Test
	void test() {
		
		Calculo circulo = new Circulo(20);
		
		System.out.println("Area: " + circulo.calculoArea());
		
	}

}

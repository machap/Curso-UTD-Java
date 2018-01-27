package br.com.calcula.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RetanguloTeste {

	@Test
	void test() {
		
		Calculo retangulo = new Retangulo(20, 5);
		
		System.out.println("Area: " + retangulo.calculoArea());
	}

}

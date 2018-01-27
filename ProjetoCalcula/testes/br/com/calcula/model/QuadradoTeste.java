package br.com.calcula.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuadradoTeste {

	@Test
	void test() {
		
		Quadrado q = new Quadrado(17);
		System.out.println("Area: " + q.calculoArea() + " cm²");
		
	}

}

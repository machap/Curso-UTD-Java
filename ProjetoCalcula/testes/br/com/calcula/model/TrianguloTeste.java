package br.com.calcula.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrianguloTeste {

	@Test
	void test() {
		
		Triangulo triangulo = new Triangulo(10, 15);
		
		triangulo.verificaTriangulo(10, 10, 8);
		System.out.println("Area ");
	}

}

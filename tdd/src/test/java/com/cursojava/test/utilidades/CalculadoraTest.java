package com.cursojava.test.utilidades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cursojava.utilidades.Calculadora;

class CalculadoraTest {

	@Test
	void testSumar() {
		Calculadora calculadora = new Calculadora();
		double suma = calculadora.sumar(2.0, 2.0);
		assertEquals(4.0, suma);
	}
	@Test
	void testRestar() {
		Calculadora calculadora = new Calculadora();
		double resta = calculadora.restar(6.0, 2.0);
		assertEquals(4.0, resta);
	}
}

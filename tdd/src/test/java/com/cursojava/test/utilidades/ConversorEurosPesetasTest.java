package com.cursojava.test.utilidades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cursojava.utilidades.ConversorEurosPesetas;

class ConversorEurosPesetasTest {

	@Test
	void testConversorEuroAPeseta() {
		ConversorEurosPesetas calcularCambio = new ConversorEurosPesetas();
		double resultado = calcularCambio.cambioMonedaEuroAPeseta(1.0);
		assertEquals(166.386, resultado);
	}
	@Test
	void testConversorPesetaAEuro() {
		ConversorEurosPesetas calcularCambio = new ConversorEurosPesetas();
		double resultado = calcularCambio.cambioMonedaPesetaAEuro(1.0);
		assertEquals(0.006010121043837823, resultado);
	}

}

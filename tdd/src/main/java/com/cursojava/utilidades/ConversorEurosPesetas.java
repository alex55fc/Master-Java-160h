package com.cursojava.utilidades;

public class ConversorEurosPesetas {

	public double cambioMonedaEuroAPeseta(double euro) {
		return euro * 166.386;
	}

	public double cambioMonedaPesetaAEuro(double peseta) {
		return peseta / 166.386 ;
	}

}

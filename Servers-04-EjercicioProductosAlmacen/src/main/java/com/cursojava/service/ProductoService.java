package com.cursojava.service;

public class ProductoService {
	
	public boolean tryChangeStringToInt(String cadena) {
		try {
			double num = Double.parseDouble(cadena);
			return true;
		}
		catch(NumberFormatException e) {
			return false;
		}
	}
	
	public double changeStringToInt(String cadena) {
		double num = Double.parseDouble(cadena);
		return num;
	}
}

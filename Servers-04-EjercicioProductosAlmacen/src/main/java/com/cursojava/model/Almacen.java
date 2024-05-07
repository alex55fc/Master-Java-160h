package com.cursojava.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Almacen {
	private Producto[] vectorProductos;

	public Almacen() {
		this.vectorProductos = new Producto[10];
	}

	@Override
	public String toString() {
		String cadena = "";
		if(vectorProductos.length == 0) {
			System.out.println("El almacen esta vacio");
		}
		else {
			Producto prod;
			for(int pos = 0; pos < vectorProductos.length; pos++) {
				prod = vectorProductos[pos];
				cadena = cadena + prod.toString()+ "\n";
			}
		}
		return cadena;
	}
	
	

	
	
}

package com.cursojava.model;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Almacen {
	private List<Producto> listaProductos;

	public Almacen(List<Producto> listaProductos) {
		this.listaProductos = new ArrayList<>();
	}
	@Override
	public String toString() {
		String cadena = "";
		if(listaProductos.isEmpty()) {
			System.out.println("El almacen esta vacio");
		}
		else {
			for(int pos = 0; pos <listaProductos.size(); pos++) {
				Producto prod = listaProductos.get(pos);
				cadena = cadena + prod.toString() + "\n";
			}
		}
		return cadena;
	}


	

	
	
}

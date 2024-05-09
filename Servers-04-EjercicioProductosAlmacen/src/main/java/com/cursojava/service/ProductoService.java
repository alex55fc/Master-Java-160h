package com.cursojava.service;

import java.util.ArrayList;
import java.util.List;

import com.cursojava.model.Producto;

public class ProductoService {
	static List<Producto> listaProductos = new ArrayList<>();
	
	public  List<Producto> getListaProductos() {
		return listaProductos;
	}
	public static void setListaProductos(List<Producto> listaProductos) {
		ProductoService.listaProductos = listaProductos;
	}
	public boolean tryChangeStringToInt(String cadena) {
		try {
			int num = Integer.parseInt(cadena);
			return true;
		}
		catch(NumberFormatException e) {
			return false;
		}
	}
	public boolean tryChangeStringToDouble(String cadena) {
		try {
			double num = Double.parseDouble(cadena);
			return true;
		}
		catch(NumberFormatException e) {
			return false;
		}
	}
	
	public double changeStringToDouble(String cadena) {
		double num = Double.parseDouble(cadena);
		return num;
	}
	public double changeStringToInt(String cadena) {
		int num = Integer.parseInt(cadena);
		return num;
	}
	public boolean insertProductoEnAlmacen(Producto prod) {
	    boolean insertado = true;

	    for (Producto prod1 : listaProductos) {
	        if (prod1.getNomProducto().equalsIgnoreCase(prod.getNomProducto())) {
	            insertado = false;
	            break;
	        }
	    }

	    if (insertado) {
	        listaProductos.add(prod);
	    }
	    return insertado;
	}
	public boolean deleteProductoEnAlmacen(Producto prod) {
		if(listaProductos.remove(prod)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public Producto devolverProductoPorNombre(String nomProd) {
	    for (Producto prod1 : listaProductos) {
	        if (prod1.getNomProducto().equalsIgnoreCase(nomProd)) {
	        	return prod1;
	        }
	    }
	    return null;
	}
}

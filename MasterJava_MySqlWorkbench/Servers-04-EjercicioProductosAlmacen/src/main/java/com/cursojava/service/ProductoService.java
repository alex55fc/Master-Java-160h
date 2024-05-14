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
	/*
	 * Metodos para comprobar si se pueden transformar de String a double o int
	 * si no se puede devolvera false pero sin ningun otro cambio
	 */
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
	/*
	 * Metodos que ahora si efectuan el cambio de String a int o double
	 * no tendran ningun fallo ya que se ejecuta en el porgrama los metodos 
	 * para comprobar si se puede cambiar la cadena o los tipos de datos deseados
	 */
	public double changeStringToDouble(String cadena) {
		double num = Double.parseDouble(cadena);
		return num;
	}
	public double changeStringToInt(String cadena) {
		int num = Integer.parseInt(cadena);
		return num;
	}
	/*
	 * Comprobamos si existe el producto que pasamos por parametro en la lista
	 * si existe no insertamos el producto, si no se encuentra se insertara en la lista
	 */
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
	public boolean comprobarNombreProductoExistente(String nomProducto) {
	    boolean existeProducto = false;

	    for (Producto prod1 : listaProductos) {
	        if (prod1.getNomProducto().equalsIgnoreCase(nomProducto)) {
	        	existeProducto = true;
	            break;
	        }
	    }
	    return existeProducto;
	}
	/*
	 * Elimina el parametro producto de la lista de productos
	 */
	public boolean deleteProductoEnAlmacen(Producto prod) {
		if(listaProductos.remove(prod)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	/*
	 * Devuelve un producto que coincida con el String del parametro pasado
	 * si no coincide con ningun producto de la lista devuelve null
	 */
	public Producto devolverProductoPorNombre(String nomProd) {
	    for (Producto prod1 : listaProductos) {
	        if (prod1.getNomProducto().equalsIgnoreCase(nomProd)) {
	        	return prod1;
	        }
	    }
	    return null;
	}
	/*
	 * Comprueba si en la lista de productos existe alguna seccion  igual al string que pasamos por parametro
	 * Si existe devolvemos true, de lo contrario false
	 */
	public boolean existeSeccionEnAlmacen(String seccion){
	    boolean existe = false;
	    for (Producto prod : listaProductos) {
	        if (seccion.equalsIgnoreCase(prod.getSeccion())) {
	            existe = true;
	            break;
	        }
	    }
	    return existe;
	}
	/*
	 * Debuelve una lista de productos donde tengan la misma seccion que pasamos por parametro
	 * si no coincide ninguna devolvera la lista vacia
	 */
	public List<Producto> devuelveListaPorSeccion(String seccion){
		List<Producto> listaProdAux = new ArrayList<>();
		for(Producto prod : listaProductos) {
	        if (seccion.equalsIgnoreCase(prod.getSeccion())) {
	        	listaProdAux.add(prod);
	        }
		}
		return listaProdAux;
	}

}

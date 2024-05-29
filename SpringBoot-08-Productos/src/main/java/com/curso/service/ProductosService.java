package com.curso.service;

import java.util.List;

import com.curso.model.Producto;

public interface ProductosService {
	
	/*
	 * Metodos CRUD
	 */
	List<Producto> allProducts();
	
	/*
	 * Metodos QUERY
	 */
	void updateProductStock(Integer idProd, Integer stock);
	Double obtainProductPrice(int idProd);

}

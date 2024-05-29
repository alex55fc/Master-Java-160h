package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Producto;
import com.curso.service.ProductosService;

@RestController
public class ProductosController {
	
	@Autowired
	ProductosService service;
	
	/*
	 * Metodos CRUD
	 */
	@GetMapping(value="productos", produces= MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> allProducts(){
		return service.allProducts();
	}
	
	/*
	 * Metodo QUERY
	 */
	@PutMapping(value="productos/{idProd}/{stock}")
	public void updateProductStock(@PathVariable Integer idProd, @PathVariable Integer stock) {
		service.updateProductStock(idProd, stock);
	}
	
	@GetMapping(value="productos/{idProd}")
	public Double obtainProductPrice(@PathVariable Integer idProd) {
		return service.obtainProductPrice(idProd);
	}
}

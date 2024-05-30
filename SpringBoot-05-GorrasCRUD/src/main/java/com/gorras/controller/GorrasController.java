package com.gorras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gorras.model.Gorra;
import com.gorras.service.GorrasService;

@RestController
public class GorrasController {

	@Autowired
	GorrasService service;
	
	/*
	 * Metodos CRUD
	 */
	@GetMapping(value="gorras", produces= MediaType.APPLICATION_JSON_VALUE)
	public List<Gorra> allCaps() {
		return service.listarGorras();
	}

	@GetMapping(value="gorras/{codGorra}", produces= MediaType.APPLICATION_JSON_VALUE)
	public Gorra findCapByCodCap(@PathVariable int codGorra) {
		return service.buscarGorraPorCodGorra(codGorra);
	}
	
	@PostMapping(value="gorras/{codGorra}/{color}/{precio}/{coleccion}/{rangoEdad}")
	public void addCap(@PathVariable int codGorra,
			@PathVariable String color,
			@PathVariable double precio,
			@PathVariable String coleccion,
			@PathVariable int rangoEdad) {
		Gorra gorra = new Gorra(codGorra, color, precio, coleccion, rangoEdad);
		service.aniadirGorra(gorra);
	}
	
	@DeleteMapping(value="gorras/{codGorra}")
	public List<Gorra> deleteCapById(@PathVariable int codGorra){
		return service.eliminarGorraPorCodGorra(codGorra);
		
	}
	/*
	 * Metodos con Querys 
	 */
	@GetMapping(value="gorras/yankees", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Gorra> allYankeesCaps(){
		return service.gorrasColeccionYankees();
	}
	
	@GetMapping(value="gorras/edad/{edad}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Gorra> capsForAgeRange(@PathVariable Integer edad){
		return service.gorrasEdadSuperior(edad);
	}
	@GetMapping(value="gorras/{precioMin}/{precioMax}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Gorra> capsInPriceRange(@PathVariable Double precioMin, @PathVariable Double precioMax){
		return service.gorrasEdadSuperior(precioMin, precioMax);
	}
}


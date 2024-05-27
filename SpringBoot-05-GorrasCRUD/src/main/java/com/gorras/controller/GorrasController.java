package com.gorras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gorras.model.Gorra;
import com.gorras.service.GorrasService;

@RestController
public class GorrasController {

	@Autowired
	GorrasService service;
	
	@GetMapping(value="gorras/yankees", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Gorra> allYankeesCaps(){
		return service.gorrasColeccionYankees();
	}
	
	@GetMapping(value="gorras/{edad}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Gorra> capsForAgeRange(@PathVariable Integer edad){
		return service.gorrasEdadSuperior(edad);
	}
	@GetMapping(value="gorras/{precioMin}/{precioMax}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Gorra> capsInPriceRange(@PathVariable Double precioMin, @PathVariable Double precioMax){
		return service.gorrasEdadSuperior(precioMin, precioMax);
	}
}


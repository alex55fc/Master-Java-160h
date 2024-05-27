package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Ejemplar;
import com.curso.service.EjemplaresService;

@RestController
public class EjemplaresController {
	
	@Autowired
	EjemplaresService service;
	
	@PostMapping(value="ejemplar/{isbn}/{titulo}/{tematica}")
	List<Ejemplar> insertarNuevoEjemplar(
			@PathVariable ("isbn")int isbn,@PathVariable ("titulo") String titulo, @PathVariable ("tematica")String tematica){
		
		Ejemplar ejemplar1 = new Ejemplar(isbn, titulo, tematica);
		return service.insertarNuevoEjemplar(ejemplar1);
	}

}

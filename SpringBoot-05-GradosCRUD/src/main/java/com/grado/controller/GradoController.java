package com.grado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grado.model.Grado;
import com.grado.service.GradosService;

@RestController
public class GradoController {
	@Autowired
	GradosService service;
	@PostMapping(value="grados/{codGrado}", consumes=MediaType.APPLICATION_JSON_VALUE)
	public List<Grado> grados(@PathVariable int codGrado){
		return service.altaGrado(codGrado);
	}
	
	
}

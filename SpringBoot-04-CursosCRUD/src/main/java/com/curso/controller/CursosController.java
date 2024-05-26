package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Curso;
import com.curso.service.CursosService;

@RestController
public class CursosController {
	
	@Autowired
	CursosService service;
	
	@PostMapping(value="cursos", consumes=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> cursos(){
		return service.darAltaCurso();
	}
	
	@DeleteMapping(value="cursos/{codCurso}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> eliminarCurso(@PathVariable int codCurso){
		return service.eliminarCurso(codCurso);
	}
	
	@PutMapping(value="cursos/{codCurso}/{duracion}", consumes=MediaType.APPLICATION_JSON_VALUE)
	void actualizarDuracionCurso(@PathVariable int codCurso, @PathVariable int duracion) {
		service.actualizarDuracionCurso(codCurso, duracion);
	}
	
	
}

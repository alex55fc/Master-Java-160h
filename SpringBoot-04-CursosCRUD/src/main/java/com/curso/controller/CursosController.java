package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	
	@PostMapping(value="cursos/{codCurso}/{nombre}/{duracion}/{precio}")
	public List<Curso> darAltaCurso(@PathVariable int codCurso, @PathVariable String nombre, 
			@PathVariable int duracion, @PathVariable double precio){
		Curso curso = new Curso(codCurso, nombre, duracion, precio);
		return service.darAltaCurso(curso);
	}
	
	@DeleteMapping(value="cursos/{codCurso}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> eliminarCurso(@PathVariable int codCurso){
		return service.eliminarCurso(codCurso);
	}
	
	@PutMapping(value="cursos/{codCurso}/{duracion}")
	void actualizarDuracionCurso(@PathVariable int codCurso, @PathVariable int duracion) {
		service.actualizarDuracionCurso(codCurso, duracion);
	}
	
	@GetMapping(value="cursos/{codCurso}", produces=MediaType.APPLICATION_JSON_VALUE)
	Curso encontrarCursoPorId(@PathVariable int codCurso) {
		return service.buscarCurso(codCurso);
	}
	
	@GetMapping(value="cursos/{precioMin}/{precioMax}", produces=MediaType.APPLICATION_JSON_VALUE)
	List<Curso> listaCursosEntreRangoPrecio(@PathVariable double precioMin, @PathVariable double precioMax){
		return service.cursosPorRangoPrecio(precioMin, precioMax);
	}
}

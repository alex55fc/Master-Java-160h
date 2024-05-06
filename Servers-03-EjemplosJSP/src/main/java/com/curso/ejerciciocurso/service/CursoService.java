package com.curso.ejerciciocurso.service;

import java.util.List;

import com.curso.ejerciciocurso.modelo.Curso;

public class CursoService {
	
	public  Curso crearCurso(String nombre, int dificultad) {
		Curso curso = new Curso(nombre, dificultad);
		return curso;
	}
	public List<Curso> aniadirCursoALista(Curso curso, List<Curso>listaCursos){
		listaCursos.add(curso);
		return listaCursos;
	}
}

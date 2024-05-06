package com.curso.ejerciciocurso.service;

import com.curso.ejerciciocurso.modelo.Curso;

public class CursoService {
	
	public  Curso crearCurso(String nombre, int dificultad) {
		Curso curso = new Curso(nombre, dificultad);
		return curso;
	}

}

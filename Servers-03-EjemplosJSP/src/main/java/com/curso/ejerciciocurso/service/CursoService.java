package com.curso.ejerciciocurso.service;

import java.util.ArrayList;
import java.util.List;

import com.curso.ejerciciocurso.modelo.Curso;

public class CursoService {
	static List<Curso> listaCurso = new ArrayList<>();

	public  Curso crearCurso(String nombre, int dificultad) {
		Curso curso = new Curso(nombre, dificultad);
		return curso;
	}
	public void aniadirCursoALista(Curso curso) {
		listaCurso.add(curso);
	}
	public List<Curso> devolverListaCursos(){
		return listaCurso;
	}

}

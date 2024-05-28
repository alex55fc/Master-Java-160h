package com.curso.service;

import java.util.List;

import com.curso.model.Curso;

public interface CursosService {
	
	/*
	 * METODOS CRUD
	 */
	List<Curso> darAltaCurso(Curso curso);
	List<Curso> eliminarCurso(int codCurso);
	void actualizarDuracionCurso(int codCurso, int duracion);
	Curso buscarCurso(int codCurso);
	List<Curso> cursosPorRangoPrecio(double precioMin, double precioMax);
	
}

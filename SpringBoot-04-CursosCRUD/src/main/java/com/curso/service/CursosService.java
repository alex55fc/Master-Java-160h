package com.curso.service;

import java.util.List;

import com.curso.model.Curso;

public interface CursosService {
	
	//comprobar los metodos de json si son asi, sobretodo el primero de dar alta 
	List<Curso> darAltaCurso();
	List<Curso> eliminarCurso(int codCurso);
	void actualizarDuracionCurso(int codCurso, int duracion);
	Curso buscarCurso(int codCurso);
	List<Curso> cursosPorRangoPrecio(double precioMin, double precioMax);
	
}

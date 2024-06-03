package com.curso.service;

import java.util.List;
import java.util.Optional;

import com.curso.model.Curso;

public interface CursoService {
	List<Curso> alta(Curso curso);
	List<Curso> eliminar(int codCurso);
	void actualizarDuracion(int codCurso, int duracion);
	List<Curso> findByPrecioBetwwen(int minPrecio, int maxPrecio);
	//usamos un optional por si no hay un Curso
	Optional<Curso> buscarCurso(int codCurso);
	
	//Metodo para Formacion(microservicio)
	List<Curso> cursos();
}

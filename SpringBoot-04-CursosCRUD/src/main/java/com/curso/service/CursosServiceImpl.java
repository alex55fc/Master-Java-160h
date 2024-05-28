package com.curso.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.CursosDao;
import com.curso.model.Curso;

@Service
public class CursosServiceImpl  implements CursosService{
	@Autowired
	CursosDao dao;
	
	@Override
	public List<Curso> darAltaCurso(Curso curso) {
		dao.save(curso);
		return dao.findAll() ;
		
	}

	@Override
	public List<Curso> eliminarCurso(int codCurso) {
		dao.deleteById(codCurso);
		return dao.findAll();
	}

	@Override
	public void actualizarDuracionCurso(int codCurso, int duracion) {
		Optional<Curso> optionalCurso = dao.findById(codCurso);
		Curso cursoToUpdate = optionalCurso.get();
		cursoToUpdate.setDuracion(duracion);
		dao.save(cursoToUpdate);
	}

	@Override
	public Curso buscarCurso(int codCurso) {
		return dao.findById(codCurso).orElse(null);
	}

	@Override
	public List<Curso> cursosPorRangoPrecio(double precioMin, double precioMax) {
		List<Curso> listaAux = dao.findAll();
		List<Curso> listaPorRangoPrecioCursos = new ArrayList<>();
		for(Curso curso : listaAux) {
			if(curso.getPrecio() >= precioMin && curso.getPrecio() <= precioMax) {
				listaPorRangoPrecioCursos.add(curso);
			}
		}
		return listaPorRangoPrecioCursos;
	}


}

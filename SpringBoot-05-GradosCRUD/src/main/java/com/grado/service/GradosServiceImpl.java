package com.grado.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.grado.dao.GradosDao;
import com.grado.model.Grado;

public class GradosServiceImpl implements GradosService {

	@Autowired
    private GradosDao dao;

    @Override
    public List<Grado> altaGrado(int grado) {
		Optional<Grado> optionalGrado = dao.findById(grado);
		Grado gradoToUpdate = optionalGrado.get();
    	dao.save(gradoToUpdate);
        return dao.findAll();
    }

	@Override
	public List<Grado> eliminarGrado(int codGrado) {
		dao.deleteById(codGrado);
		return dao.findAll();
	}

	@Override
	public void actualizarDuracion(int codGrado, int duracion) {
		Optional<Grado> optionalGrado = dao.findById(codGrado);
		Grado gradoToUpdate = optionalGrado.get();
		gradoToUpdate.setDuracion(duracion);
		dao.save(gradoToUpdate);
	}

	@Override
	public Grado buscarGrado(int codGrado) {
		return dao.findById(codGrado).orElse(null);
	}

	@Override
	public List<Grado> gradosPorPrecio(double precioMin, double precioMax) {
	    List<Grado> listaAux = dao.findAll(); // Reemplaza "gradoDao" con el nombre de tu DAO para Grado
	    List<Grado> listaPorRangoPrecioGrados = new ArrayList<>();
	    for(Grado grado : listaAux) {
	        if(grado.getPrecio() >= precioMin && grado.getPrecio() <= precioMax) {
	            listaPorRangoPrecioGrados.add(grado);
	        }
	    }
	    return listaPorRangoPrecioGrados;
	}



}

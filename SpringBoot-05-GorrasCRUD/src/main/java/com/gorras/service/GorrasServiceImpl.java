package com.gorras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gorras.dao.GorrasDao;
import com.gorras.model.Gorra;

@Service
public class GorrasServiceImpl implements GorrasService {
	@Autowired 
	GorrasDao dao;
	
	//Metodos CRUD
	@Override
	public List<Gorra> listarGorras() {
		return dao.findAll();
	}

	@Override
	public Gorra buscarGorraPorCodGorra(int codGorra) {
		return dao.findById(codGorra).orElse(null);
	}

	@Override
	public void aniadirGorra(Gorra gorra) {
		dao.save(gorra);
	}

	@Override
	public List<Gorra> eliminarGorraPorCodGorra(int codGorra) {
		dao.deleteById(codGorra);
		return dao.findAll();
	}

	//Metodos Query JPQL
	@Override
	public List<Gorra> gorrasColeccionYankees() {
		return dao.gorrasColeecionYankees();
	}

	@Override
	public List<Gorra> gorrasEdadSuperior(Integer edad) {
		return dao.gorrasEdadSuperior(edad);
	}

	@Override
	public List<Gorra> gorrasEdadSuperior(Double precioMin, Double precioMax) {
		return dao.gorrasEdadSuperior(precioMin, precioMax);
	}


}

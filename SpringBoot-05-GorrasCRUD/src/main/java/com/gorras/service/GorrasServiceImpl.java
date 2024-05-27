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

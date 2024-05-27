package com.gorras.service;

import java.util.List;

import com.gorras.model.Gorra;

public interface GorrasService {
	/*
	 * Metodos DAO
	 */
	
	/*
	 * Metodos @Query
	 */
	List<Gorra> gorrasColeccionYankees();
	List<Gorra> gorrasEdadSuperior(Integer edad);
	List<Gorra> gorrasEdadSuperior(Double precioMin,Double precioMax);
	
}

package com.gorras.service;

import java.util.List;

import com.gorras.model.Gorra;

public interface GorrasService {
	/*
	 * Metodos DAO
	 */
	List<Gorra> listarGorras();
	Gorra buscarGorraPorCodGorra(int codGorra);
	void aniadirGorra(Gorra gorra);
	List<Gorra> eliminarGorraPorCodGorra(int codGorra);
	/*
	 * Metodos @Query
	 */
	List<Gorra> gorrasColeccionYankees();
	List<Gorra> gorrasEdadSuperior(Integer edad);
	List<Gorra> gorrasEdadSuperior(Double precioMin,Double precioMax);
	
}

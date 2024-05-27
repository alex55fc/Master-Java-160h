package com.gorras.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gorras.model.Gorra;

public interface GorrasDao extends JpaRepository<Gorra, Integer> {

	/*
	 * @Query
	 * Metodo
	 * Gorras de la coleccion 'Yankees'
	 */
	@Query("SELECT g FROM  Gorra g  where g.coleccion like 'Yankees'")
	List<Gorra> gorrasColeecionYankees();
	
	/*
	 * @Query
	 * Metodo
	 * Gorras de una edad superior al atributo'
	 */
	@Query("SELECT g FROM  Gorra g  where g.rangoEdad > :edad")
	List<Gorra> gorrasEdadSuperior(@Param("edad") Integer edad);
	
	/*
	 * @Query
	 * Metodo
	 * Gorras dentro de un rango de precio concreto
	 */
	@Query("SELECT g FROM  Gorra g  where g.precio > :precioMin and g.precio < :precioMax")
	List<Gorra> gorrasEdadSuperior(@Param("precioMin") Double precioMin, @Param("precioMax") Double precioMax);
	
}

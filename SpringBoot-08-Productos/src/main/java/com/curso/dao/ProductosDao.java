package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.curso.model.Producto;

import jakarta.transaction.Transactional;

public interface ProductosDao extends JpaRepository<Producto, Integer> {
	/*
	 * Metodo QUERY
	 * Update stock de un producto
	 */
	@Transactional
	@Modifying
	@Query("UPDATE Producto p SET p.stock = :stock WHERE p.idProd = :idProd")
	void updateProductStock(@Param("idProd")Integer idProd, @Param("stock") Integer stock);
	
	@Query("SELECT p.precio FROM Producto p WHERE p.idProd = :idProd")
	Double obtainProductPrice(@Param("idProd")Integer idProd);

}

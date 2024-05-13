package com.curso.consultas;

import java.util.List;

import com.curso.dominio.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Select01 {

	public static void main(String[] args) {
		/*
		 * En este ejemplo usamos JPA Query Languag(JPQL) hacemos consultas sobre nuestra CLASE Java, se parecen a al SQL pero no es lo mismo.
		 */
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();
		
		//aqui estamos trabajando Libro que hace referencia a la clase de Java NO a la tabla "libro"
		TypedQuery<Libro> consulta = em.createQuery("SELECT l from Libro l", Libro.class);
		List<Libro> listaLibros = consulta.getResultList();
		
		for (Libro libro : listaLibros) {
			System.out.println(libro.toString());
		}
	}

}

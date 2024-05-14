package com.curso.consultas;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class SelectOrderBy06 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Object[]> consulta= em.createQuery("SELECT COUNT(l.precio), l.precio FROM Libro l GROUP BY l.precio", Object[].class);
		List<Object[]> listaObjects = consulta.getResultList();
		
		for(Object[] sublista : listaObjects) {
			System.out.println("De precio "+ sublista[1] + " hay "+ sublista[0] + " elementos.");
		}
	}

}

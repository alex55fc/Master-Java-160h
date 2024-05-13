package com.curso.ejemplosfaciles;

import com.curso.dominio.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Princ01 {

	public static void main(String[] args) {
		//biblioteca esta en el persistence.xml
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();
		
		//usamos el entity manager para acceder a la bd
		Libro libroAux = em.find(Libro.class, "11");
		System.out.println(libroAux.toString());
	}

}

package com.curso.ejemplosfaciles;

import com.curso.dominio.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Princ02Insertar {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();
			
		Libro libro = new Libro("66", "Libro5", "Autor5", 45);
		
		//Iniciamos la transaccion 
		em.getTransaction().begin();
		//Accion de la transaccion
		em.persist(libro);
		//terminamos la transaccion
		em.getTransaction().commit();
	}

}

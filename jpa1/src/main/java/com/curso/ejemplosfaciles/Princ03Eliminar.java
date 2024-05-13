package com.curso.ejemplosfaciles;

import com.curso.dominio.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Princ03Eliminar {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();

		Libro libroAux = em.find(Libro.class, "11");	
		
		//Iniciamos la transaccion 
		em.getTransaction().begin();
		//Accion de la transaccion
		em.remove(libroAux);
		//terminamos la transaccion
		em.getTransaction().commit();
	}

}

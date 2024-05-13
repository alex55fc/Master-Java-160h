package com.curso.ejemplosfaciles;

import com.curso.dominio.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Princ04Update {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();

		Libro libroAux = em.find(Libro.class, "22");
		
		//Iniciamos la transaccion 
		em.getTransaction().begin();
		//Accion de la transaccion
		libroAux.setAutor("Autor nuevo");
		libroAux.setPrecio(99);
		em.merge(libroAux);
		//Finalizamos la transaccion
		em.getTransaction().commit();
	}

}

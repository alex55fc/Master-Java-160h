package com.curso.consultas;

import java.util.List;

import com.curso.dominio.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class SelectWhere02 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Libro> consulta = em.createQuery("SELECT l FROM Libro l WHERE l.autor= :autor", Libro.class);
		consulta.setParameter("autor", "Autor3");
		List<Libro> listaLibroAux = consulta.getResultList();
		
		for (Libro libro : listaLibroAux) {
			System.out.println(libro.toString());
		}
	}

}

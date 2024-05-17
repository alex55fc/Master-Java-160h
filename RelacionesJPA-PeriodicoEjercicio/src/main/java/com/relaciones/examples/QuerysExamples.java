package com.relaciones.examples;

import java.util.List;

import com.relaciones.dominio.Comentario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class QuerysExamples {

	public static void main(String[] args) {
		//Sale de esa linea el nombre : <persistence-unit name="periodicojercicio" transaction-type="RESOURCE_LOCAL">
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("periodicojercicio"); 
		EntityManager em = emf.createEntityManager();
		
		System.out.println("-----------------------");
		/*
		 * Esta consulta es sobre la clase Comentario y no sobre la tabla comentarios(DB),
		 * atraves del campo noticia( de la clase Comentario ) accede a los atributos de Noticia
		 */
		
		TypedQuery<Comentario> consulta = em.createQuery("SELECT c FROM Comentario c where c.noticia.titulo = 'Concierto' ", Comentario.class);
		List<Comentario> listaComentarios = consulta.getResultList();
		if(listaComentarios.isEmpty()) {
			System.out.println("No existe un resultado con esa query");
		}
		else {
			for (Comentario coment : listaComentarios) {
				System.out.println(coment);
			}
		}
		
		System.out.println("-----------------------");
		listaComentarios = null;
		
		TypedQuery<Comentario> consulta1 = em.createQuery("SELECT c FROM Comentario c WHERE c.noticia.autor = 'Jose Maria' ", Comentario.class);
		listaComentarios = consulta1.getResultList();
		if(listaComentarios.isEmpty()) {
			System.out.println("No existe un resultado con esa query");
		}
		else {
			for (Comentario coment : listaComentarios) {
				System.out.println(coment);
			}
		}

	}

}

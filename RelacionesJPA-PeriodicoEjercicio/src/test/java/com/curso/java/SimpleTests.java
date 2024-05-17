package com.curso.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.relaciones.dominio.Comentario;
import com.relaciones.dominio.Noticia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

class SimpleTests {

	EntityManagerFactory emf;
	EntityManager em ;
	
	@BeforeEach
	void iniciar() {
		 emf = Persistence.createEntityManagerFactory("periodicojercicio");
		 em = emf.createEntityManager();
	}
	
	@Test
	public void entityManagerFactoryTest() {
		assertNotNull(emf);
	}
	
	@Test
	public void entityManagerTest() {
		assertNotNull(em);
	}
	
	@Test 
	public void encontrarNoticia() {
		Noticia noticia = em.find(Noticia.class, "Concierto");
		assertNotNull(noticia);
	}
	@Test
	public void insertarComentario() {
		Noticia noti = new Noticia();
		noti.setTitulo("Huracan");
		Comentario coment = new Comentario(6,"Prueba", "Es una prueba", noti);
		//insertamos el comentario 
		em.getTransaction().begin();
		em.persist(coment);
		em.getTransaction().commit();
		//comprobamos que si existe en la DB encontrandolo
		Comentario comentInsertado = em.find(Comentario.class, 6);
		assertEquals(6, comentInsertado.getId());
		
	}
	
	@Test
	public void updateComentarioWithId5() {
		Comentario comentInsertado = em.find(Comentario.class, 5);
		comentInsertado.setTitulo("Prueba update");
		
		em.getTransaction().begin();
		em.merge(comentInsertado);
		em.getTransaction().commit();
		
		Comentario comentUpdated = em.find(Comentario.class, 5);
		assertEquals("Prueba update", comentUpdated.getTitulo());

	}
	@Test
	public void deleteComentarioWithId5() {
		Comentario comentDeleted = em.find(Comentario.class, 5);
		
		em.getTransaction().begin();
		em.remove(comentDeleted);
		em.getTransaction().commit();
		
		Comentario comentNotExist = em.find(Comentario.class, 5);
		assertNull(comentNotExist);

	}
}

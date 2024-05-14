package com.curso.consultas;

import java.util.List;

import com.curso.dominio.Libro;
import com.curso.dominio.Pelicula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class EjerciciosConsultasVideoclub {

	public static void main(String[] args) {
		List<Pelicula> listaPeliAux;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("videoclub");
		EntityManager em = emf.createEntityManager();
		
		System.out.println("Mostrar todas las películas");
		TypedQuery<Pelicula> consulta = em.createQuery("SELECT p from Pelicula p", Pelicula.class);
		listaPeliAux = consulta.getResultList();
		
		for (Pelicula peli : listaPeliAux) {
			System.out.println(peli.toString());
		}
		listaPeliAux = null;
		
		System.out.println("\nMostrar las películas cuyo director es Cosme");
		TypedQuery<Pelicula> consulta1 = em.createQuery("SELECT p FROM Pelicula p WHERE p.nomDirector= :nomDirector", Pelicula.class);
		consulta1.setParameter("nomDirector", "Cosme");
		listaPeliAux = consulta1.getResultList();
		
		for (Pelicula peli : listaPeliAux) {
			System.out.println(peli.toString());
		}
		listaPeliAux = null;

		System.out.println("\nMostrar las películas en las que el nombre del director empieza por M");
		TypedQuery<Pelicula> consulta2 = em.createQuery("SELECT p FROM Pelicula p WHERE p.nomDirector LIKE :nomDirector", Pelicula.class);
		consulta2.setParameter("nomDirector", "M%");
		listaPeliAux = consulta2.getResultList();
		
		for (Pelicula peli : listaPeliAux) {
			System.out.println(peli.toString());
		}
		listaPeliAux = null;
		
		System.out.println("\nMostrar las películas cuya directora es Ana o Eva");
		TypedQuery<Pelicula> consulta3 = em.createQuery("SELECT p FROM Pelicula p WHERE p.nomDirector= :autor or p.nomDirector= :autor2 ", Pelicula.class);
		consulta3.setParameter("autor", "Ana");
		consulta3.setParameter("autor2", "Eva");

		listaPeliAux = consulta3.getResultList();
		
		for (Pelicula peli : listaPeliAux) {
			System.out.println(peli.toString());
		}
		listaPeliAux = null;

		System.out.println("\nMostrar solo los directores de las peliculas");
		TypedQuery<String> consulta4 = em.createQuery("SELECT p.nomDirector FROM Pelicula p ", String.class);

		List<String>listaAux = consulta4.getResultList();
		
		for (String dir : listaAux) {
			System.out.println(dir);
		}
		listaPeliAux = null;
		
		System.out.println("\nMostrar las películas cuyo precio es mayor que 10 y menor que 50");
		TypedQuery<Pelicula> consulta5 = em.createQuery("SELECT p FROM Pelicula p WHERE p.precioAlquiler between :precio AND :precio2 ", Pelicula.class);
		consulta5.setParameter("precio", 10);
		consulta5.setParameter("precio2", 50);

		listaPeliAux = consulta5.getResultList();
		
		for (Pelicula peli : listaPeliAux) {
			System.out.println(peli.toString());
		}
		listaPeliAux = null;
		
		System.out.println("\nMostrar las películas y el numero de peliculas que hay con ese precio");
		TypedQuery<Object[]> consulta6 = em.createQuery("SELECT COUNT(p.precioAlquiler), p.precioAlquiler FROM Pelicula p GROUP BY p.precioAlquiler", Object[].class);


		List<Object[]>lista = consulta6.getResultList();
		
		for (Object[] objeto : lista) {
			System.out.println("Hay "+ objeto[0] + " peliculas con el precio "+ objeto[1] + "$");
		}
	}

}

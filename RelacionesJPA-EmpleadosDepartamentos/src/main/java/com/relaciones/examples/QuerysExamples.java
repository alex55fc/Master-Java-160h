package com.relaciones.examples;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.relaciones.dominio.Comentario;
import com.relaciones.dominio.Departamento;
import com.relaciones.dominio.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class QuerysExamples {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("empresaempleadosejercicio");
		EntityManager em = emf.createEntityManager();
		List<Empleado> listaEmpleados = new ArrayList<>();
		List<Departamento> listaDepartamentos = new ArrayList<>();
		
		System.out.println("--------------------\nInsertar empleado");
		Date date = new Date(124,4,2);
		Departamento dep = em.find(Departamento.class, 2);
		Empleado emp = new Empleado(5,"nuevo empleado",date, 23.00, dep );

		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		
		System.out.println("--------------------\nMostrar de dos empleados (con id 1 y 5) el que lleva menos tiempo en la empresa");
		TypedQuery<Empleado> consulta1 = em.createQuery("SELECT e FROM Empleado e WHERE e.idEmpleado in (1 , 5) ORDER BY fecha DESC", Empleado.class);
		listaEmpleados = consulta1.getResultList();
		for(Empleado emp1 : listaEmpleados) {
			System.out.println(emp1);
		}
		
		System.out.println("--------------------\nMostrar todos los empleados");
		TypedQuery<Departamento> consulta2 = em.createQuery("SELECT d FROM Departamento d", Departamento.class);
		listaDepartamentos = consulta2.getResultList();
		for(Departamento dep1 : listaDepartamentos) {
			System.out.println(dep1);
		}
		
		System.out.println("--------------------\nMostrar empleados del departamento 3");
		TypedQuery<Empleado> consulta3 = em.createQuery("SELECT e FROM Empleado e WHERE e.departamento.idDepartamento = 3 ", Empleado.class);
		listaEmpleados = consulta3.getResultList();
		for(Empleado emp1 : listaEmpleados) {
			System.out.println(emp1);
		}
		
		System.out.println("--------------------\nMostrar todos los departamentos con menos de 2 empleados");
		TypedQuery<Departamento> consulta4 = em.createQuery("SELECT d FROM Departamento d WHERE d.idDepartamento IN ("
		        + " SELECT e.departamento.idDepartamento FROM Empleado e GROUP BY e.departamento.idDepartamento HAVING COUNT(e.idEmpleado) < 2 )", Departamento.class);
		listaDepartamentos = consulta4.getResultList();
		for(Departamento dep1 : listaDepartamentos) {
			System.out.println(dep1);
		}
		
		System.out.println("--------------------\nMostrar empleados que cobren memnos de la media del sueldo");
		TypedQuery<Empleado> consulta5 = em.createQuery("SELECT e FROM Empleado e WHERE e.sueldo < (SELECT AVG(e2.sueldo) FROM Empleado e2)", Empleado.class);
		listaEmpleados = consulta5.getResultList();
		for(Empleado emp1 : listaEmpleados) {
			System.out.println(emp1);
		}
		
	}

}

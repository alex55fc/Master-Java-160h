package com.relaciones.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="departamentos")
public class Departamento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int idDepartamento;
	private String nombre;
	private String localidad;
	//este campo hace referencia a la CLASE Empleado al campo departamento(no a la db)
	@OneToMany(mappedBy="departamento")
	private List<Empleado> empleados = new ArrayList<>();
	
	public Departamento() {
		super();
	}

	public Departamento(int idDepartamento, String nombre, String localidad, List<Empleado> empleados) {
		super();
		this.idDepartamento = idDepartamento;
		this.nombre = nombre;
		this.localidad = localidad;
		this.empleados = empleados;
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	/*
	 * En el toString() no puede haber referencia al objeto de la otra clase relacionada porque seria un bucle infinito
	 */
	@Override
	public String toString() {
		return "Departamento [idDepartamento=" + idDepartamento + ", nombre=" + nombre + ", localidad=" + localidad
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idDepartamento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		return idDepartamento == other.idDepartamento;
	}
	
}

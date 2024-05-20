package com.relaciones.dominio;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="empleados")
public class Empleado implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int idEmpleado;
	private String nombre;
	private Date fecha;
	private double sueldo;
	//Este campo hace referencia a el campo noticias_nombres de noticias(DB) y lo trae a este campo 
	@ManyToOne
	@JoinColumn(name="id_departamento")
	private Departamento departamento;
	
	public Empleado() {
		super();
	}
	public Empleado(int idEmpleado, String nombre, Date fecha, double sueldo, Departamento departamento) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.fecha = fecha;
		this.sueldo = sueldo;
		this.departamento = departamento;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int id) {
		this.idEmpleado = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	/*
	 * En el toString() no puede haber referencia al objeto de la otra clase relacionada porque seria un bucle infinito
	 */
	@Override
	public String toString() {
		return "Empleado [Id del empleado=" + idEmpleado + ", nombre=" + nombre + ", fecha=" + fecha + ", sueldo=" + sueldo
				 + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(idEmpleado);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return idEmpleado == other.idEmpleado;
	}
	
	
}

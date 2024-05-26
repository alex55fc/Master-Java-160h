package com.grado.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity

public class Grado {
	@Id
	private int codGrado;
	private String nombre;
	private int duracion;
	private double precio;
	private int dificultad;
	
	public Grado() {
		super();
	}
	public Grado(int codGrado, String nombre, int duracion, double precio, int dificultad) {
		super();
		this.codGrado = codGrado;
		this.nombre = nombre;
		this.duracion = duracion;
		this.precio = precio;
		this.dificultad = dificultad;
	}
	public int getCodGrado() {
		return codGrado;
	}
	public void setCodGrado(int codGrado) {
		this.codGrado = codGrado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getDificultad() {
		return dificultad;
	}
	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codGrado);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grado other = (Grado) obj;
		return codGrado == other.codGrado;
	} 
}

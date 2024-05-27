package com.gorras.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="gorras")
public class Gorra implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name="cod_gorra")
	private int codGorra;
	private String color;
	private double precio;
	private String coleccion;
	@Column (name="rango_edad")
	private int rangoEdad;
	
	public Gorra() {
		super();
	}

	public Gorra(int codGorra, String color, Double precio, String coleccion, int rangoEdad) {
		super();
		this.codGorra = codGorra;
		this.color = color;
		this.precio = precio;
		this.coleccion = coleccion;
		this.rangoEdad = rangoEdad;
	}


	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public int getCodGorra() {
		return codGorra;
	}

	public void setCodGorra(int codGorra) {
		this.codGorra = codGorra;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColeccion() {
		return coleccion;
	}

	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}

	public int getRangoEdad() {
		return rangoEdad;
	}

	public void setRangoEdad(int rangoEdad) {
		this.rangoEdad = rangoEdad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codGorra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gorra other = (Gorra) obj;
		return codGorra == other.codGorra;
	}
	
	
}

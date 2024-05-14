package com.curso.dominio;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity

@Table(name="pelicula")

public class Pelicula {
	@Id
	private int codigo;
	private String titulo;
	private String nomDirector;
	private double precioAlquiler;
	
	public Pelicula(int codigo, String titulo, String nomDirector, double precioAlquiler) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.nomDirector = nomDirector;
		this.precioAlquiler = precioAlquiler;
	}

	public Pelicula() {	}

	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", titulo=" + titulo + ", nomDirector=" + nomDirector
				+ ", precioAlquiler=" + precioAlquiler + "]";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNomDirector() {
		return nomDirector;
	}

	public void setNomDirector(String nomDirector) {
		this.nomDirector = nomDirector;
	}

	public double getPrecioAlquiler() {
		return precioAlquiler;
	}

	public void setPrecioAlquiler(double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		return codigo == other.codigo;
	}
	
	
}

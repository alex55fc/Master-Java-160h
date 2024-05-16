package com.relaciones.dominio;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="noticias")
public class Noticia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String titulo;
	private String autor;
	private Date fecha;
	//este campo hace referencia a la CLASE Comentario al campo noticia(no a la db)
	@OneToMany(mappedBy="noticia")
	private List<Comentario> comentarios = new ArrayList<>();
	public Noticia() {
		super();
	}
	public Noticia(String titulo, String autor, Date fecha, List<Comentario> comentarios) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.fecha = fecha;
		this.comentarios = comentarios;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public List<Comentario> getComentarios() {
		return comentarios;
	}
	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Noticia other = (Noticia) obj;
		return Objects.equals(titulo, other.titulo);
	}
	@Override
	public String toString() {
		return "Noticia [titulo=" + titulo + ", autor=" + autor + ", fecha=" + fecha + ", comentarios=" + comentarios
				+ "]";
	}
	
	
}

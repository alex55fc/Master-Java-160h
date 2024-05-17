package com.relaciones.dominio;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Comentarios")
public class Comentario  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private String titulo;
	private String texto;
	//Este campo hace referencia a el campo noticias_nombres de noticias(DB) y lo trae a este campo 
	@ManyToOne
	@JoinColumn(name="noticias_titulo")
	private Noticia noticia;
	
	public Comentario() {
		super();
	}
	public Comentario(int id, String titulo, String texto, Noticia noticia) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.texto = texto;
		this.noticia = noticia;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Noticia getNoticia() {
		return noticia;
	}
	public void setNoticia(Noticia noticia) {
		this.noticia = noticia;
	}
	@Override
	public String toString() {
		return "Comentario [id=" + id + ", titulo=" + titulo + ", texto=" + texto +"]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comentario other = (Comentario) obj;
		return id == other.id;
	}
	
	
	
	
}

package com.viewnext.gestionbiblioteca;

import java.util.Objects;

public abstract class Documento {
	protected int codDocumento;
	protected String tituloDocumento;
	protected boolean prestado;
	
	public Documento(int codDocumento, String tituloDocumento) {
		super();
		this.codDocumento = codDocumento;
		this.tituloDocumento = tituloDocumento;
		this.prestado = false;
	}

	public int getCodDocumento() {
		return codDocumento;
	}

	public void setCodDocumento(int codDocumento) {
		this.codDocumento = codDocumento;
	}

	public String getTituloDocumento() {
		return tituloDocumento;
	}

	public void setTituloDocumento(String tituloDocumento) {
		this.tituloDocumento = tituloDocumento;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(tituloDocumento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Documento other = (Documento) obj;
		return Objects.equals(tituloDocumento, other.tituloDocumento);
	}
	
	

}

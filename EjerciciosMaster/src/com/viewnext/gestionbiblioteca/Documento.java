package com.viewnext.gestionbiblioteca;

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
	

}

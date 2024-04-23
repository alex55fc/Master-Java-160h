package com.viewnext.gestionbiblioteca;

public abstract class Documento {
	protected int codDocumento;
	protected String tituloDocumento;
	
	public Documento(int codDocumento, String tituloDocumento) {
		super();
		this.codDocumento = codDocumento;
		this.tituloDocumento = tituloDocumento;
	}

}

package com.viewnext.gestionbiblioteca;

public class Libro extends Documento{
	private int anioPublicacion;
	
	public Libro(int codDocumento, String tituloDocumento,
			int anioPublicacion) {
		super(codDocumento, tituloDocumento);
		this.anioPublicacion = anioPublicacion;
	}

	@Override
	public String toString() {
		return "Libro [anioPublicacion=" + anioPublicacion + ", codDocumento=" + codDocumento + ", tituloDocumento="
				+ tituloDocumento + "]";
	}
	

}

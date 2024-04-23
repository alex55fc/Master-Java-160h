package com.viewnext.gestionbiblioteca;

public class Revista  extends Documento {

	public Revista(int codDocumento, String tituloDocumento) {
		super(codDocumento, tituloDocumento);
	}

	@Override
	public String toString() {
		return "Revista [codDocumento=" + codDocumento + ", tituloDocumento=" + tituloDocumento + "]";
	}
	

}

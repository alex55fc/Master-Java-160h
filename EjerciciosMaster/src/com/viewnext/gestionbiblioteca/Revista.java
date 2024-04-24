package com.viewnext.gestionbiblioteca;

public class Revista  extends Documento {

	public Revista(int codDocumento, String tituloDocumento) {
		super(codDocumento, tituloDocumento);
		this.prestado = false;
	}

	@Override
	public String toString() {
		String cadena = "";
		cadena = cadena + "El CODIGO " + codDocumento  +" pertenece a la REVISTA \"" + tituloDocumento;
		if(prestado) {
			cadena += " SI esta prestado";
		}
		else {
			cadena += " NO esta prestado";
		}
		return cadena;
	}


	

}

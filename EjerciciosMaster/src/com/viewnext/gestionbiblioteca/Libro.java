package com.viewnext.gestionbiblioteca;

public class Libro extends Documento{
	private int anioPublicacion;
	
	public Libro(int codDocumento, String tituloDocumento,
			int anioPublicacion) {
		super(codDocumento, tituloDocumento);
		this.anioPublicacion = anioPublicacion;
		this.prestado = false;
	}

	@Override
	public String toString() {
		String cadena = "";
		cadena = cadena + "El CODIGO " + codDocumento  +" pertenece al LIBRO \"" + tituloDocumento +  "\" (publicado en "
				+ anioPublicacion + ") ";
		if(prestado) {
			cadena += "SI esta prestado";
		}
		else {
			cadena += "NO esta prestado";
		}
		return cadena;
	}


	

}

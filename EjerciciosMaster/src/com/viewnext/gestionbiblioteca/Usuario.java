package com.viewnext.gestionbiblioteca;

public abstract class Usuario {
	protected String dniUsuario;
	protected String nombreUsuario;
	protected Documento[] vectorDocumentos;
	
	public Usuario(String dniUsuario, String nombreUsuario) {
		super();
		this.dniUsuario = dniUsuario;
		this.nombreUsuario = nombreUsuario;
	}
	abstract boolean prestamoLibro(int diasPrestamo, Documento docu);
	abstract boolean  prestamoRevista(int diasPrestamo, Documento codu);
}

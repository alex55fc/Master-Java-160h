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
	abstract boolean vectorLleno();
	abstract void insertarDocumento(Documento docu);
	
	public String getDniUsuario() {
		return dniUsuario;
	}
	public void setDniUsuario(String dniUsuario) {
		this.dniUsuario = dniUsuario;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public Documento[] getVectorDocumentos() {
		return vectorDocumentos;
	}
	public void setVectorDocumentos(Documento[] vectorDocumentos) {
		this.vectorDocumentos = vectorDocumentos;
	}
	
}

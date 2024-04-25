package com.viewnext.gestionbiblioteca;

public class Prestamos {
	Usuario user;
	Documento docu;
	
	public Prestamos(Usuario user, Documento docu) {
		super();
		this.user = user;
		this.docu = docu;
	}

	@Override
	public String toString() {
		String cadena = "";
		cadena += docu.getTituloDocumento();
		
		if(user instanceof Socio) {		
			if(docu instanceof Libro) {
				Libro libro=(Libro)docu;
				cadena += " (" + libro.getAnioPublicacion()+ ") Cod:"+ docu.getCodDocumento() + " Plazo:" +Socio.getNumeroDiasPrestamoLibro();
			}
			else if(docu instanceof Revista) {
				cadena += "Cod:"+ docu.getCodDocumento() + " Plazo:" + Socio.getNumeroDiasPrestamoRevista();
			}
			cadena+= "dias\n prestado a:"+ user.getDniUsuario()+ " (Socio)";
		}
		else if(user instanceof UsuarioOcasional) {
			if(docu instanceof Libro) {
				Libro libro=(Libro)docu;
				cadena += " (" + libro.getAnioPublicacion()+ ") Cod:"+ docu.getCodDocumento() + " Plazo:" +UsuarioOcasional.getNumeroDiasPrestamoLibro();
			}
			else if(docu instanceof Revista) {
				cadena += "Cod:"+ docu.getCodDocumento() + " Plazo:" + UsuarioOcasional.getNumeroDiasPrestamoRevista();
			}
			cadena+= "dias\n prestado a:"+ user.getDniUsuario()+ " (UsuarioOcasional)";
		}
		return cadena;
	}
	
}

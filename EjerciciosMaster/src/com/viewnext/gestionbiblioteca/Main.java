package com.viewnext.gestionbiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static List<Usuario> crearUsuariosYmeterlosEnListas() {
		List<Usuario> listaUsuarios = new ArrayList<>();
		listaUsuarios.add(new Socio("11","Alex"));
		listaUsuarios.add(new Socio("22","Pablo"));
		listaUsuarios.add(new UsuarioOcasional("33","Jose"));
		return  listaUsuarios;
	}
	public static void recorrerListaUsuarios(List<Usuario> listaUsuarios) {
		for (Usuario userX : listaUsuarios) {
			System.out.println(userX.toString());
		}
	}
	public static void recorrerDocumentosDelUsuario(Usuario user) {
		Socio sociox;
		UsuarioOcasional userOcasional;
		if(user instanceof Socio) {
			sociox =(Socio)user;
			System.out.println(sociox.documentosEnPrestamo());
		}
		else if(user instanceof UsuarioOcasional) {
			userOcasional =(UsuarioOcasional)user;
			System.out.println(userOcasional.documentosEnPrestamo());
		}
		else {
			System.out.println("Error tipo de usuario no existe");
		}
	}
	public static void main(String[] args) {
		List<Usuario> listaUsuarios;
		List<Documento> listaDocumentos;
		listaUsuarios = crearUsuariosYmeterlosEnListas();
		recorrerListaUsuarios(listaUsuarios);
		
		Socio socio1 = new Socio("22","julio");
		recorrerDocumentosDelUsuario(socio1);
	}
}

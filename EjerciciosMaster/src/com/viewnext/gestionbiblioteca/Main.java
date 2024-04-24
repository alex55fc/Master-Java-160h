package com.viewnext.gestionbiblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void escribirMenu() {
		System.out.println("==========================================");
		System.out.println("(0) Salir del programa");
		System.out.println("(1) Selecciona documento");
		System.out.println("(2) Presta documento seleccionado");
		System.out.println("(3) Devuelve documento actual");
		System.out.println("(4) Busca documento");
		System.out.println("(4) Informe prestamos");
		System.out.println("==========================================");
	}
	//Metodos para usuarios 
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
	public static Usuario devolverUsuario(String dniUser,List<Usuario> listaUsuarios) {
		for(Usuario user : listaUsuarios) {
			if(user.getDniUsuario().equalsIgnoreCase(dniUser)) {
				return user;
			}
		}
		return null;
	}
	//metodos para documentos 
	public static List<Documento> crearDocumentosYmeterlosEnListas() {
		List<Documento> listaDocumentos = new ArrayList<>();
		listaDocumentos.add(new Libro(1,"Libro de la selva", 1970));
		listaDocumentos.add(new Libro(2,"Los sanchez", 2001));
		listaDocumentos.add(new Revista(3,"Los mas ricos del planeta"));
		return  listaDocumentos;
	}
	public static void recorrerListaDocumentos(List<Documento> listaDocumentos) {
		for (Documento docuX : listaDocumentos) {
			System.out.println(docuX.toString());
		}
	}
	public static Documento devolverDocumento(int docuId,List<Documento> listaDocumentos) {
		for(Documento docu : listaDocumentos) {
			if(docuId == docu.getCodDocumento()) {
				return docu;
			}
		}
		return null;
	}
	static Documento documentoSeleccionado; 
	
	public static void main(String[] args) {
		List<Usuario> listaUsuarios;
		List<Documento> listaDocumentos;
		Documento docu;
		Usuario user;
		Scanner scanner = new Scanner(System.in);
		int opcionAElegir, docuId;
		String dniUser;

		listaUsuarios = crearUsuariosYmeterlosEnListas();
		listaDocumentos = crearDocumentosYmeterlosEnListas();

		do {
			escribirMenu();
			System.out.println("Opcion : ");
			opcionAElegir = scanner.nextInt();

			switch(opcionAElegir) {
			case 0:
				break;
			case 1:
				recorrerListaDocumentos(listaDocumentos);
				System.out.print("\nEscoge un documento por id para prestar:");
				docuId = scanner.nextInt();
				docu = devolverDocumento(docuId, listaDocumentos);
				if (docu != null) {
					if (docu.isPrestado()) {
						System.out.println("Este documento ya esta prestado a un Usuario, escoge otro");
					}
					else {
						System.out.println("Ahora escoge un usuario para prestarselo.\n");
						documentoSeleccionado = docu;
					}
				}
				else{
					System.out.println("No existe un documento con ese Id");
				}
				break;
			case 2:
				if (documentoSeleccionado != null) {
					recorrerListaUsuarios(listaUsuarios);
					System.out.print("\nEscoge a que usuario por dni haras el prestamos: ");
					dniUser = scanner.next();
					user = devolverUsuario(dniUser, listaUsuarios);
					if (user != null) {
						if(user.vectorLleno()) {
							System.out.println("Este usuario tiene al completo la cantidad de documentos prestados posibles");
						}
						else {
							user.insertarDocumento(documentoSeleccionado);
							documentoSeleccionado.setPrestado(true);
							System.out.println("\nDocumento prestado con exito!!, estos son los Documentos que tiene este usuario en prestamo");
							recorrerDocumentosDelUsuario(user);
							documentoSeleccionado = null;
						}
					}
					else {
						System.out.println("No existe un usuario con ese dni");
					}
				}
				else {
					System.out.println("Primero selecciona un documento.");
				}
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				System.out.println("Elige una opcion correcta");
			}


		}while(opcionAElegir != 0);
	}
}

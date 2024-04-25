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
		System.out.println("(5) Informe prestamos");
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
		listaDocumentos.add(new Libro(1,"Libro", 1970));
		listaDocumentos.add(new Libro(2,"Ser amo", 2001));
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
	public static List<Documento> dolverListaDocumentosConTituloEspecifico(String titulo, List<Documento> listaDocumentos) {
		List<Documento> listaDocumentosConTituloEspecifico = new ArrayList<>();
		
		for (Documento docuX : listaDocumentos) {
			if(docuX.getTituloDocumento().equalsIgnoreCase(titulo)) {
				listaDocumentosConTituloEspecifico.add(docuX);
			}
		}
		return listaDocumentosConTituloEspecifico;
	}
	public static String devolverInformePrestamo() {
		String cadena = "";
		
		return cadena;
	}
	//metodos para Prestamos 
	public static void recorreListaPrestamos(List<Prestamos> listaPrestamos) {
		for(Prestamos prestamo : listaPrestamos) {
			System.out.println(prestamo.toString());
		}
	}
	static Documento documentoSeleccionado; 

	public static void main(String[] args) {
		List<Usuario> listaUsuarios;
		List<Documento> listaDocumentos;
		List<Documento> listaDocumentosConTituloEspecifico;
		List<Prestamos> listaPrestamos = new ArrayList<>();
		Documento docu;
		Usuario user;
		Prestamos prestamo;
		Scanner scanner = new Scanner(System.in);
		int opcionAElegir, docuId;
		String dniUser, tituloDocu;

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
					System.out.println("Documento seleccionado.");
					documentoSeleccionado = docu;
				}
				else{
					System.out.println("No existe un documento con ese Id");
				}
				break;
			case 2:
				if (documentoSeleccionado != null) {
					if (documentoSeleccionado.isPrestado()) {
						System.out.println("Este documento ya esta prestado a un Usuario");
					}
					else {
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
								listaPrestamos.add(new Prestamos(user, documentoSeleccionado));
								System.out.println("\nDocumento prestado con exito!!, estos son los Documentos que tiene este usuario en prestamo");
								recorrerDocumentosDelUsuario(user);
								documentoSeleccionado = null;
							}
						}
						else {
							System.out.println("No existe un usuario con ese dni");
						}
					}
				}
				else {
					System.out.println("Primero selecciona un documento.");
				}
				break;
				/*
				 * Mejorar el codigo, cuando se devuelva un libro o revista restar 1 a la cantidad de documetnos que tiene el usuario que posee el documento
				 */
			case 3:
				if (documentoSeleccionado != null) {
					if (documentoSeleccionado.isPrestado()) {
						System.out.println(documentoSeleccionado.getTituloDocumento()+ " ya esta prestado a un Usuario, devolviendolo...Exito");
						documentoSeleccionado.setPrestado(false);

					}
					else {
						System.out.println(documentoSeleccionado.getTituloDocumento()+ " no esta prestado, asi que no se puede dovolver^^.\n");
					}
				}
				else {
					System.out.println("Primero selecciona un documento.");
				}
				break;
				/*
				 * Devulve una  lista con los Documentos que coincidan exactamenteo con el titulo puesto por teclado
				 * Falla cuando el titulo tiene una separacion ejemplo: el Principito. Resolver 
				 */
			case 4:
				System.out.print("Busca un documento por titulo, introduce el titulo: ");
				tituloDocu = scanner.next();
				listaDocumentosConTituloEspecifico = dolverListaDocumentosConTituloEspecifico(tituloDocu, listaDocumentos);
				if(listaDocumentosConTituloEspecifico.isEmpty()) {
					System.out.println("No se encontro ningun documente con dicho titulo");
				}
				else {
					System.out.println("Aqui estan los documentos con dicho titulo: ");
					for(Documento docuX : listaDocumentosConTituloEspecifico) {
						System.out.println(docuX.toString());
					}
				}
				
				break;
			case 5 :
				if(listaPrestamos.isEmpty()) {
					System.out.println("Aun no hubo registros de prestamos. Prueba a hacer uno primero ^^");
				}
				else {
					recorreListaPrestamos(listaPrestamos);
				}
				break;
			default:
				System.out.println("Elige una opcion correcta");
			}


		}while(opcionAElegir != 0);
	}
}

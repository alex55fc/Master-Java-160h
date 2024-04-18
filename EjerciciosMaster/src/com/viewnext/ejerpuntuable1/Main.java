package com.viewnext.ejerpuntuable1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void escribirMenu() {
		System.out.println();
		System.out.println("(0) salir del programa");
		System.out.println("(1) Crear un Coche");
		System.out.println("(2) Cambiar color al coche");
		System.out.println("(3) Ver todos los Coches");
		System.out.println("(4) Arrancar coche");
		System.out.println("(5) Avanzar coche");
		System.out.println("(6) Retroceder coche");
		System.out.println("(7) Parar coche");
		System.out.println("(8) Crear un Camion");
		System.out.println("(9) Ver todos los Camiones");
		System.out.println("(10) Arrancar camion");
		System.out.println("(11) Avanzar camion");
		System.out.println("(12) Retroceder camion");
		System.out.println("(13) Parar camion");
		System.out.println("(14) Introducir velocidad al tacometro");

		System.out.println();
	}
	public static void mostrarTodosVechiculos(List<Vehiculo> listaVehiculos) {
		for (Vehiculo vehiculoX : listaVehiculos) {
			System.out.println(vehiculoX.toString());
		}
	}
	public static void mostrarTodosCoches(List<Coche> listaCoches) {
		for (Vehiculo coches : listaCoches) {
			System.out.println(coches.toString());
		}
	}
	public static boolean encontrarMatricula(String matricula, List<Coche> listaCoches) {
		for (Coche cochex : listaCoches ) {
			if(cochex.getMatricula().equalsIgnoreCase(matricula)) {
				return true;
			}
		}
		return false;
	}
	public static boolean insertarCochePorMatricula(Coche coche,List<Coche> listaCoches) {
		return listaCoches.add(coche);
	}
	public static Coche devolverCocheMatricula(String matricula, List<Coche> listaCoches) {
		for (Coche cochex : listaCoches ) {
			if(cochex.getMatricula().equalsIgnoreCase(matricula)) {
				return cochex;
			}
		}
		return null;
	}
	public static boolean encontrarMatriculaCamion(String matricula, List<Camion> listaCamiones) {
		for (Camion camionx : listaCamiones ) {
			if(camionx.getMatricula().equalsIgnoreCase(matricula)) {
				return true;
			}
		}
		return false;
	}
	public static boolean insertarCamionPorMatricula(Camion camion,List<Camion> listaCamiones) {
		return listaCamiones.add(camion);
	}
	public static void mostrarTodosCamiones(List<Camion> listaCamiones) {
		for (Camion camion : listaCamiones) {
			System.out.println(camion.toString());
		}
	}
	public static Camion devolverCamionMatricula(String matricula, List<Camion> listaCamiones) {
		for (Camion camion : listaCamiones ) {
			if(camion.getMatricula().equalsIgnoreCase(matricula)) {
				return camion;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcionAElegir, metrosAvanceRetroceso, segundosViaje, velocidadTacometro;
		String matricula, colorCoche;
		List<Vehiculo> listaVehiculos = new ArrayList<>();
		List<Coche> listaCoches = new ArrayList<>();
		List<Camion> listaCamiones = new ArrayList<>();
		Coche cocheAux = null;
		Camion camionAux;
		boolean vehiculoEncendido = true;
		do {
			escribirMenu();
			System.out.println("Opcion : ");
			opcionAElegir = scanner.nextInt();

			switch(opcionAElegir) {
			case 0:
				break;
			case 1:
				System.out.print("Introduce la matricula del coche: ");
				matricula = scanner.next();
				if(encontrarMatricula(matricula, listaCoches)) {
					System.out.println("Se encontro un coche con esa matricula. ");
				}
				else {
					System.out.print("Introduce el color del coche: ");
					colorCoche = scanner.next();
					cocheAux = new Coche(matricula, colorCoche);
					if(insertarCochePorMatricula(cocheAux, listaCoches)) {
						System.out.println("Se inserto correctamente el coche");
					}
					else {
						System.out.println("Hubo un error en la inserccion.");
					}
				}

				break;	
			case 2:
				System.out.println("De que coche quieres cambiar el color, selecciona la matricula?");
				mostrarTodosCoches(listaCoches);
				System.out.println("Matricula del coche: ");
				matricula = scanner.next();
				cocheAux = devolverCocheMatricula(matricula, listaCoches);
				if (cocheAux != null) {
					System.out.print("Introduce el nuevo color del coche: ");
					colorCoche = scanner.next();
					cocheAux.setColorCoche(colorCoche);
					System.out.println("Cambiado color del coche.");
				}
				else {
					System.out.println("Esa matricula no existe");
				}
				break;
			case 3:
				if (listaCoches.isEmpty()) {
					System.out.println("Ahora esta vacia la lista de coches deberias introducir uno ^^");
				}
				else {
					mostrarTodosCoches(listaCoches);
				}
				break;
			case 4:
				if (listaCoches.isEmpty()) {
					System.out.println("Ahora esta vacia la lista de coches deberias introducir uno ^^");
				}
				else {
					System.out.println("Que coche quieres arrancar? selecciona la matricula?");
					mostrarTodosCoches(listaCoches);
					System.out.println("Matricula del coche: ");
					matricula = scanner.next();
					cocheAux = devolverCocheMatricula(matricula, listaCoches);
					if (cocheAux != null) {
						if(cocheAux.isEstadoCoche()) {
							System.out.println("El coche ya esta arrancado!!");
						}
						else {
							System.out.println("El coche no esta arrancado, pongamoslo en marcha....Arrancado");
							cocheAux.setEstadoCoche(vehiculoEncendido);
						}
					}
					else {
						System.out.println("Esa matricula no existe");
					}
				}
				break;
			case 5:
				if (listaCoches.isEmpty()) {
					System.out.println("Ahora esta vacia la lista de coches deberias introducir uno ^^");
				}
				else {
					System.out.println("Que coche quieres que avance? selecciona la matricula?");
					mostrarTodosCoches(listaCoches);
					System.out.println("Matricula del coche: ");
					matricula = scanner.next();
					cocheAux = devolverCocheMatricula(matricula, listaCoches);
					if (cocheAux != null) {
						if(cocheAux.isEstadoCoche()) {
							System.out.print("Introduce cuantos metros quieres que avance: ");
							metrosAvanceRetroceso = scanner.nextInt();
							if(metrosAvanceRetroceso > 0 ) {
								cocheAux.avanzarORetroceder(metrosAvanceRetroceso);
								System.out.println("El coche avanzo "+ metrosAvanceRetroceso+ " metros.");
							}
							else {
								System.out.println("El valor debe ser superior a 0");
							}
						}
						else {
							System.out.println("El coche no esta arrancado,primero arrancalo");

						}
					}
					else {
						System.out.println("Esa matricula no existe");
					}
				}
				break;
			case 6:
				if (listaCoches.isEmpty()) {
					System.out.println("Ahora esta vacia la lista de coches deberias introducir uno ^^");
				}
				else {
					System.out.println("Que coche quieres que retroceda? selecciona la matricula?");
					mostrarTodosCoches(listaCoches);
					System.out.println("Matricula del coche: ");
					matricula = scanner.next();
					cocheAux = devolverCocheMatricula(matricula, listaCoches);
					if (cocheAux != null) {
						if(cocheAux.isEstadoCoche()) {
							System.out.print("Introduce cuantos metros quieres que retroceda?: ");
							metrosAvanceRetroceso = scanner.nextInt();
							if(metrosAvanceRetroceso > 0 ) {
								cocheAux.avanzarORetroceder(metrosAvanceRetroceso);
								System.out.println("El coche retrocedio "+ metrosAvanceRetroceso+ " metros.");

							}
							else {
								System.out.println("El valor debe ser superior a 0");
							}
						}
						else {
							System.out.println("El coche no esta arrancado,primero arrancalo");

						}
					}
					else {
						System.out.println("Esa matricula no existe");
					}
				}
				break;
			case 7:
				if (listaCoches.isEmpty()) {
					System.out.println("Ahora esta vacia la lista de coches deberias introducir uno ^^");
				}
				else {
					System.out.println("Que coche quieres que se detenga? selecciona la matricula?");
					mostrarTodosCoches(listaCoches);
					System.out.println("Matricula del coche: ");
					matricula = scanner.next();
					cocheAux = devolverCocheMatricula(matricula, listaCoches);
					if (cocheAux != null) {
						if(cocheAux.isEstadoCoche()) {
							System.out.println("Paremos el coche...El coche se detuvo.");
							segundosViaje = cocheAux.getTiempoViaje();
							cocheAux.parar();
							System.out.println("El coche recorrio en total "+ cocheAux.getMetrosTotales() +"m totales.");
							System.out.println("Recorridos en "+ segundosViaje +" segundos.");
						}
						else {
							System.out.println("El coche no esta arrancado, hazlo antes de intentar pararlo ^^");
						}
					}
					else {
						System.out.println("Esa matricula no existe");
					}
				}
				break;
			case 8:
				System.out.print("Introduce la matricula del camion: ");
				matricula = scanner.next();
				if(encontrarMatriculaCamion(matricula, listaCamiones)) {
					System.out.println("Se encontro un camion con esa matricula. ");
				}
				else {
					camionAux = new Camion(matricula);
					if(insertarCamionPorMatricula(camionAux, listaCamiones)) {
						System.out.println("Se inserto correctamente el camion");
					}
					else {
						System.out.println("Hubo un error en la inserccion.");
					}
				}
				break;
			case 9:
				if (listaCamiones.isEmpty()) {
					System.out.println("Ahora esta vacia la lista de camiones deberias introducir uno ^^");
				}
				else {
					mostrarTodosCamiones(listaCamiones);
				}
				break;
			case 10:
				if (listaCamiones.isEmpty()) {
					System.out.println("Ahora esta vacia la lista de camiones deberias introducir uno ^^");
				}
				else {
					System.out.println("Que camion quieres arrancar? selecciona la matricula?");
					mostrarTodosCamiones(listaCamiones);
					System.out.println("Matricula del camion: ");
					matricula = scanner.next();
					camionAux = devolverCamionMatricula(matricula, listaCamiones);
					if (camionAux != null) {
						if(camionAux.isEstadoCamion()) {
							System.out.println("El camion ya esta arrancado!!");
						}
						else {
							System.out.println("El camion no esta arrancado, pongamoslo en marcha....Arrancado");
							camionAux.setEstadoCamion(vehiculoEncendido);
						}
					}
					else {
						System.out.println("Esa matricula no existe");
					}
				}
				break;
			case 11:
				if (listaCamiones.isEmpty()) {
					System.out.println("Ahora esta vacia la lista de camiones deberias introducir uno ^^");
				}
				else {
					System.out.println("Que camion quieres que avance? selecciona la matricula?");
					mostrarTodosCamiones(listaCamiones);
					System.out.println("Matricula del camion: ");
					matricula = scanner.next();
					camionAux = devolverCamionMatricula(matricula, listaCamiones);
					if (camionAux != null) {
						if(camionAux.isEstadoCamion()) {
							System.out.print("Introduce cuantos metros quieres que avance: ");
							metrosAvanceRetroceso = scanner.nextInt();
							if(metrosAvanceRetroceso > 0 ) {
								camionAux.avanzarORetroceder(metrosAvanceRetroceso);
								System.out.println("El camion avanzo "+ metrosAvanceRetroceso+ " metros.");

							}
							else {
								System.out.println("El camion no esta arrancado,primero arrancalo");
							}
						}
						else {
							System.out.println("El camion no esta arrancado,deberias arrancarlo antes.");
						}
					}
					else {
						System.out.println("Esa matricula no existe");
					}
				}
				break;
			case 12:
				if (listaCamiones.isEmpty()) {
					System.out.println("Ahora esta vacia la lista de camiones deberias introducir uno ^^");
				}
				else {
					System.out.println("Que camion quieres que retroceda? selecciona la matricula?");
					mostrarTodosCamiones(listaCamiones);
					System.out.println("Matricula del camion: ");
					matricula = scanner.next();
					camionAux = devolverCamionMatricula(matricula, listaCamiones);
					if (camionAux != null) {
						if(camionAux.isEstadoCamion()) {
							System.out.print("Introduce cuantos metros quieres que retroceda: ");
							metrosAvanceRetroceso = scanner.nextInt();
							if(metrosAvanceRetroceso > 0 ) {
								camionAux.avanzarORetroceder(metrosAvanceRetroceso);
								System.out.println("El camion retrocedio "+ metrosAvanceRetroceso+ " metros.");

							}
							else {
								System.out.println("El camion no esta arrancado,primero arrancalo");
							}
						}
						else {
							System.out.println("El camion no esta arrancado,deberias arrancarlo antes.");
						}
					}
					else {
						System.out.println("Esa matricula no existe");
					}
				}
				break;
			case 13:
				if (listaCamiones.isEmpty()) {
					System.out.println("Ahora esta vacia la lista de camiones deberias introducir uno ^^");
				}
				else {
					System.out.println("Que camion quieres que pare? selecciona la matricula?");
					mostrarTodosCamiones(listaCamiones);
					System.out.println("Matricula del camion: ");
					matricula = scanner.next();
					camionAux = devolverCamionMatricula(matricula, listaCamiones);
					if (camionAux != null) {
						if(camionAux.isEstadoCamion()) {
							System.out.println("Paremos el camion...El camion se detuvo.");
							segundosViaje = camionAux.getTiempoViaje();
							camionAux.parar();
							System.out.println("El camion recorrio en total "+ camionAux.getMetrosTotales() +"m totales.");
							System.out.println("Recorridos en "+ segundosViaje +" segundos.");
						}
						else {
							System.out.println("El camionAux no esta arrancado, hazlo antes de intentar pararlo ^^");
						}
					}
					else {
						System.out.println("Esa matricula no existe");
					}
				}
				break;
			case 14 :
				if (listaCamiones.isEmpty()) {
					System.out.println("Ahora esta vacia la lista de camiones deberias introducir uno ^^");
				}
				else {
					System.out.println("En que camion quieres agregar una velocidad al tacometro?? selecciona la matricula?");
					mostrarTodosCamiones(listaCamiones);
					System.out.println("Matricula del camion: ");
					matricula = scanner.next();
					camionAux = devolverCamionMatricula(matricula, listaCamiones);
					if (camionAux != null) {
						if(camionAux.isEstadoCamion()) {
							System.out.print("Introduce velocidad al tacometro");
							velocidadTacometro = scanner.nextInt();
							camionAux.agregarVelocidad(velocidadTacometro);
							System.out.println("Añadida velocidad al tacometro "+ velocidadTacometro);
						}
						else {
							System.out.println("El camionAux no esta arrancado, hazlo antes de intentar pararlo ^^");
						}
					}
					else {
						System.out.println("Esa matricula no existe");
					}
				}
				break;
			default:
				System.out.println("Elige una opcion correcta");
			}
		}while(opcionAElegir != 0);
		System.out.println("Programa finalizado!");

	}

}

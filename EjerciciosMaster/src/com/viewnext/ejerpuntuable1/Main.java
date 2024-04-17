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

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcionAElegir, metrosAvanceRetroceso, segundosViaje;
		String matricula, colorCoche;
		List<Vehiculo> listaVehiculos = new ArrayList<>();
		List<Coche> listaCoches = new ArrayList<>();
		Coche cocheAux = null;
		boolean cocheEncendido = true;
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
							cocheAux.setEstadoCoche(cocheEncendido);
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
					System.out.println("Que coche quieres que retroceda? selecciona la matricula?");
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
			default:
				System.out.println("Elige una opcion correcta");
			}
		}while(opcionAElegir != 0);
		System.out.println("Programa finalizado!");

	}

}

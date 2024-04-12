package ejer6.Cafetera;

import java.util.Scanner;

public class Main {
	public static void escribirMenu() {
		System.out.println();
		System.out.println("(0) salir del programa");
		System.out.println("(1) Llena la cafetera");
		System.out.println("(2) Sirvete una taza de cafe");
		System.out.println("(3) Vacia la cafetera");
		System.out.println("(4) Agrega cafe a la cafetera");
		System.out.println();
	}

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int capacidadMaxima;
        int cantidadActual;
        Cafetera cafeteraAux = new Cafetera();
        int opcionAElegir;
        int cantidadAServir;
        int cantidadServida;
        int cantidadAAgregar;
        try {
            System.out.print("Quieres crear una batidora por defecto? 1=si 2=no ");
            opcionAElegir = scanner.nextInt();

            if (opcionAElegir == 1) {
                cafeteraAux = new Cafetera();
                System.out.println("Cafetera por defecto creada");
                System.out.println(cafeteraAux.toString());
            } else if (opcionAElegir == 2) {
                System.out.print("Capacidad maxima: ");
                capacidadMaxima = scanner.nextInt();
                System.out.print("Quieres dejar asi la batidora?(se asignara un valor por defecto a la cantidad actual) 1=si 2=no ");
                opcionAElegir = scanner.nextInt();
                if (opcionAElegir == 1) {
                    cafeteraAux = new Cafetera(capacidadMaxima);
                    System.out.println("Cafetera creada");
                    System.out.println(cafeteraAux.toString());
                } else if (opcionAElegir == 2) {
                    System.out.print("Cantidad actual: ");
                    cantidadActual = scanner.nextInt();
                    cafeteraAux = new Cafetera(capacidadMaxima, cantidadActual);
                    System.out.println("Cafetera creada");
                    System.out.println(cafeteraAux.toString());
                } else {
                    System.out.println("Recuerda escoger una opcion correcta ^^, creada una Batidora por defecto");
                    cafeteraAux = new Cafetera();
                    System.out.println(cafeteraAux.toString());
                }
            } else {
                System.out.println("Recuerda escoger una opcion correcta ^^, creada una Batidora por defecto");
                cafeteraAux = new Cafetera();
                System.out.println(cafeteraAux.toString());
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Ocurrio un error en la entradada de datos, reinicia el prograna");
        }

        do {
        	escribirMenu();
        	System.out.println("Opcion : ");
            opcionAElegir = scanner.nextInt();
            
            switch(opcionAElegir) {
            case 0:
            	break;
            	//hace que la cantidad actual sea igual a la capacidad.
            case 1:
            	if(cafeteraAux.getCantidadActual() == cafeteraAux.getCapacidadMaxima()) {
            		System.out.println("Ya esta llena la cafetera ^^");
            	}
            	else {
                   	System.out.println("Cantidad actual: "+ cafeteraAux.getCantidadActual() +", Capacidad maxima: "+ cafeteraAux.getCapacidadMaxima());
                   	cafeteraAux.llenarCafetera();
                   	System.out.println("Llenando la cantidad...");
                   	System.out.println("Cantidad nueva actual: "+ cafeteraAux.getCantidadActual() +", Capacidad maxima: "+ cafeteraAux.getCapacidadMaxima());
            	}

            	break;
            	//simula la acción de servir una taza con la capacidad indicada  	
            case 2:
            	if(cafeteraAux.getCantidadActual() == 0) {
            		System.out.println("No hay cafe en la cafetera :(, prueba a poner cafe antes.");
            	}
            	else {
                	System.out.println("Cantidad disponible de cafe: "+ cafeteraAux.getCantidadActual());
                	System.out.print("Sirvete una taza de cafe, escoge la cantidad, si no hay dicha cantidad se servira la cantidad que haya en la cafetera: ");
                	cantidadAServir = scanner.nextInt();
                	cantidadServida = cafeteraAux.servirTaza(cantidadAServir);
                	System.out.println("Se sirvio la taza con la cantidad "+ cantidadServida);
                	System.out.println("Cantidad sobrante en la cafetera "+ cafeteraAux.getCantidadActual());
            	}

            	break;
            	//pone la cantidad de café actual en cero.
            case 3:
            	if(cafeteraAux.getCantidadActual() == 0) {
            		System.out.println("Ya esta vacia la cafetera ^^");
            	}
            	else {
            	System.out.println("Cantidad actual de cafe: "+ cafeteraAux.getCantidadActual());
            	cafeteraAux.vaciarCafetera();
            	System.out.println("Vaciando el cafe  actual...");
            	System.out.println("Cantidad actual de cafe: "+ cafeteraAux.getCantidadActual());
     
            	}
            	break;
            	//añade a la cafetera la cantidad de café indicada.
            case 4:
            	if(cafeteraAux.getCantidadActual() == cafeteraAux.getCapacidadMaxima()) {
            		System.out.println("Ya esta llena la cafetera ^^");
            	}
            	else {
            		System.out.println("Cantidad acutal de cafe: "+ cafeteraAux.getCantidadActual());
            		System.out.println("Cantidad maxima de capacidad de cafe: "+ cafeteraAux.getCapacidadMaxima());
            		System.out.print("Cuanta cantidad de cafe deseas añadir? ");
            		cantidadAAgregar = scanner.nextInt();
            		if(cafeteraAux.agregarCafe(cantidadAAgregar)) {
            			System.out.println("Cantidad de cafe añadida!!, cantidad actual de la cafetera "+ cafeteraAux.getCantidadActual());
            		}
            		else {
            			System.out.println("Escoge una cantidad correcta a añadir!!");
            		}
            	}
            	break;
            default:
            	System.out.println("Elige una opcion correcta");
            }
            
        	
        }while(opcionAElegir != 0);
    }

}

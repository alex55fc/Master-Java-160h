package ejer1;

public class main {

	public static void main(String[] args) {
		 // Creamos los equipos
        Equipo equipo1 = new Equipo(1, "Madrid", 10, 5);
        Equipo equipo2 = new Equipo(2, "Barcelona", 10, 6);
        Equipo equipo3 = new Equipo(3, "Valencia", 10, 4);
        Equipo equipo4 = new Equipo(4, "Atlético de madrid", 10, 3);
        Equipo equipo5 = new Equipo(5, "Zaragoza", 10, 9);
        Equipo equipo6 = new Equipo(5, "Leganés", 10, 7);
        
        //Creamos los Jugaores
        Jugador jugador1 = new Jugador(1, "Elias", 1, equipo1);
        Jugador jugador2 = new Jugador(2, "Pedro", 1, equipo2);
        Jugador jugador3 = new Jugador(3, "Juan", 1, equipo3);
        Jugador jugador4 = new Jugador(4, "Beniamin", 1, equipo4);
        Jugador jugador5 = new Jugador(5, "Gracia", 1, equipo5);
        Jugador jugador6 = new Jugador(6, "Alejandro", 1, equipo6);
        
	}

}

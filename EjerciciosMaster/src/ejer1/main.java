package ejer1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
	
    public static List<Jugador> ordenarJugadoresPorGolesMarcados(List<Jugador> listaJugadores){
    	List <Jugador> listaAux = new ArrayList<>();
    	listaAux.addAll(listaJugadores);
    	Collections.sort(listaAux, new OrdenJugadoresGolesMarcadosDesc());
    	return listaAux;
    };

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
        Jugador jugador2 = new Jugador(2, "Pedro", 3, equipo2);
        Jugador jugador3 = new Jugador(3, "Juan", 4, equipo3);
        Jugador jugador4 = new Jugador(4, "Beniamin", 1, equipo4);
        Jugador jugador5 = new Jugador(5, "Gracia", 10, equipo5);
        Jugador jugador6 = new Jugador(6, "Alejandro", 2, equipo6);
        
        //listas
        List<Equipo> listaEquipos = new ArrayList<>();
        listaEquipos.add(equipo1);
        listaEquipos.add(equipo2);
        listaEquipos.add(equipo3);
        listaEquipos.add(equipo4);
        listaEquipos.add(equipo5);
        listaEquipos.add(equipo6);
        
        List<Jugador> listaJugadores = new ArrayList<>();
        listaJugadores.add(jugador1);
        listaJugadores.add(jugador2);
        listaJugadores.add(jugador3);
        listaJugadores.add(jugador4);
        listaJugadores.add(jugador5);
        listaJugadores.add(jugador6);
        //
        List<Jugador> listaDeJugadoresOrdenada;
        
        System.out.println("Listar los jugadores de cada equipo ordenador por goles marcados");
        listaDeJugadoresOrdenada = ordenarJugadoresPorGolesMarcados(listaJugadores);
        for(Jugador x : listaDeJugadoresOrdenada ) {
        	System.out.println(x.getNombre() + " anotó: "+ x.getGolesMarcados() + " goles");
        }
        
	}

}

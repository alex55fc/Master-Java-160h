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
    public static List<Equipo> ordenarEquipoPorPartidosGanados(List<Equipo> listaEquipos){
    	List <Equipo> listaAux = new ArrayList<>();
    	listaAux.addAll(listaEquipos);
    	Collections.sort(listaAux, new OrdenEquiposPartidosGanadosDesc());
    	return listaAux;
    }
	public static void main(String[] args) {
		 // Creamos los equipos
        Equipo equipo1 = new Equipo(1, "Madrid", 5, 10);
        Equipo equipo2 = new Equipo(2, "Barcelona", 6, 10);
        Equipo equipo3 = new Equipo(3, "Valencia", 4, 10);
        Equipo equipo4 = new Equipo(4, "Atlético de madrid", 3, 10);
        Equipo equipo5 = new Equipo(5, "Zaragoza", 9, 10);
        Equipo equipo6 = new Equipo(5, "Leganés", 7, 10);
        
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
        List<Equipo> listaDeEquiposOrdenada;
        System.out.println("Listar los jugadores de cada equipo ordenador por goles marcados");
        listaDeJugadoresOrdenada = ordenarJugadoresPorGolesMarcados(listaJugadores);
        for(Jugador x : listaDeJugadoresOrdenada ) {
        	System.out.println(x.getNombre() + " anotó: "+ x.getGolesMarcados() + " goles");
        }
        
        System.out.println("\nLista de los equipos ordenados por partidos ganados");
        listaDeEquiposOrdenada = ordenarEquipoPorPartidosGanados(listaEquipos);
        for(Equipo x : listaDeEquiposOrdenada ) {
        	System.out.println(x.getNomEquipo() + " ganó : "+ x.getPartidosGanados()+ " partidos, habiendo jugado "+ x.getPartidosJugados()+ " partidos en total.");
        }
	}

}

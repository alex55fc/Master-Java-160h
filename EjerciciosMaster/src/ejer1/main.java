package ejer1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
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
		Date date = new Date();
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
        
        //Creamos los partidos
        Partidos partido1 = new Partidos(1, date, equipo1, equipo2, 2, 1);
        Partidos partido2 = new Partidos(2, date, equipo3, equipo4, 1, 1);
        Partidos partido3 = new Partidos(3, date, equipo5, equipo6, 3, 2);
        Partidos partido4 = new Partidos(4, date, equipo1, equipo3, 0, 2);
        Partidos partido5 = new Partidos(5, date, equipo2, equipo4, 1, 3);
        Partidos partido6 = new Partidos(6, date, equipo5, equipo1, 2, 2);
        Partidos partido7 = new Partidos(7, date, equipo6, equipo2, 0, 1);
        Partidos partido8 = new Partidos(8, date, equipo3, equipo5, 2, 2);
        Partidos partido9 = new Partidos(9, date, equipo4, equipo6, 1, 0);
        Partidos partido10 = new Partidos(10, date, equipo1, equipo2, 3, 2);
        
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
        
        List<Partidos> listaPartidosJugados = new ArrayList<>();
        listaPartidosJugados.add(partido1);
        listaPartidosJugados.add(partido2);
        listaPartidosJugados.add(partido3);
        listaPartidosJugados.add(partido4);
        listaPartidosJugados.add(partido5);
        listaPartidosJugados.add(partido6);
        listaPartidosJugados.add(partido7);
        listaPartidosJugados.add(partido8);
        listaPartidosJugados.add(partido9);
        listaPartidosJugados.add(partido10);

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
        
        System.out.println("\nLista de partidos jugados con los resultados");
        for(Partidos x : listaPartidosJugados) {
        	System.out.println(x.toString());
        }
	}

}

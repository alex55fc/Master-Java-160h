package ejer1;

import java.util.Comparator;

public class OrdenJugadoresGolesMarcadosDesc implements  Comparator<Jugador>{

	@Override
	public int compare(Jugador jug1, Jugador jug2) {
		Integer goles1 = jug1.getGolesMarcados();
		Integer goles2 = jug2.getGolesMarcados();
		return goles2.compareTo(goles1);
	}

}

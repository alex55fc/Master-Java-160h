package ejer1;

import java.util.Comparator;

public class OrdenEquiposPartidosGanadosDesc implements Comparator<Equipo> {

	@Override
	public int compare(Equipo equip1, Equipo equip2) {
		Integer partidosGanados1 = equip1.getPartidosGanados();
		Integer partidosGanados2 = equip2.getPartidosGanados();
		return partidosGanados2.compareTo(partidosGanados1);
	}

}

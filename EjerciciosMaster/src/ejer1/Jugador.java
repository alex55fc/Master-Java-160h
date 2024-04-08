package ejer1;

public class Jugador {
	private int idJugador;
	private String nombre;
	private int golesMarcados;
	
	private Equipo equipo;
	
	public Jugador(int idJugador, String nombre, int golesMarcados, Equipo equipo) {
		this.idJugador = idJugador;
		this.nombre = nombre;
		this.golesMarcados = golesMarcados;
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Jugador [Id del Jugador=" + idJugador + ", Nombre=" + nombre + ", Goles marcados=" + golesMarcados + " Equipo= "+ getEquipo().getNomEquipo() +"]";
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public int getIdJugador() {
		return idJugador;
	}

	public void setIdJugador(int idJugador) {
		this.idJugador = idJugador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getGolesMarcados() {
		return golesMarcados;
	}

	public void setGolesMarcados(int golesMarcados) {
		this.golesMarcados = golesMarcados;
	}
	//
	
	
	
}

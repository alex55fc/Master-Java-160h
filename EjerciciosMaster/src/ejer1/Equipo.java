package ejer1;

public class Equipo {
	private int idEquipo;
	private String nomEquipo;
	private int partidosJugados;
	private int partidosGanados;
	
	public Equipo(int idEquipo, String nomEquipo, int partidosGanados, int partidosJugados) {
		this.idEquipo = idEquipo;
		this.nomEquipo = nomEquipo;
		this.partidosGanados = partidosGanados;
		this.partidosJugados = partidosJugados;
	}

	@Override
	public String toString() {
		return "Equipo [Id del equipo=" + idEquipo + ", Nombre=" + nomEquipo + ", Numero de partidos ganados=" + partidosGanados
				+", Numero de partidos jugados= " + partidosJugados +"]";
	}

	public int getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}

	public String getNomEquipo() {
		return nomEquipo;
	}

	public void setNomEquipo(String nomEquipo) {
		this.nomEquipo = nomEquipo;
	}

	public int getPartidosJugados() {
		return partidosJugados;
	}

	public void setPartidosJugados(int partidosJugados) {
		this.partidosJugados = partidosJugados;
	}

	public int getPartidosGanados() {
		return partidosGanados;
	}

	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}
	


}

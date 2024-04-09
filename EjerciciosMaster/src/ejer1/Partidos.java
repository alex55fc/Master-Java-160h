package ejer1;

import java.util.Date;

public class Partidos {
	private int idPartido;
	private Date fechaPartido;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private int golesLocal;
	private int golesVisitante;
	
	public Partidos(int idPartido, Date fechaPartido, Equipo equipoLocal, Equipo equipoVisitante, int golesLocal,
			int golesVisitante) {
		super();
		this.idPartido = idPartido;
		this.fechaPartido = fechaPartido;
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
	}

	@Override
	public String toString() {
		return "Partido= " + idPartido + ", Fecha=" + fechaPartido + "\n"+  
				getEquipoLocal().getNomEquipo() + " vs " + getEquipoVisitante().getNomEquipo() + "\n       "+ 
				 + golesLocal + " - "+ golesVisitante ;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}

	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}

	public int getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}

	public Date getFechaPartido() {
		return fechaPartido;
	}

	public void setFechaPartido(Date fechaPartido) {
		this.fechaPartido = fechaPartido;
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}
	
	
	
}

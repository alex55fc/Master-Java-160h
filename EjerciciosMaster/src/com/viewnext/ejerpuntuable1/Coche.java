package com.viewnext.ejerpuntuable1;

import java.util.Objects;

public class Coche extends Vehiculo implements Conducible {
	
	private final String matricula;
	private String colorCoche;
	private boolean estadoCoche = false;
	private int metrosTotales = 0;
	private int tiempoViaje;
	//atributos static
	private static final int NUMERO_RUEDAS_COCHE = 4;
	
	public Coche(String matricula, String colorCoche) {
		super(NUMERO_RUEDAS_COCHE);
		this.matricula = matricula;
		this.colorCoche = colorCoche;
	}


	@Override
	public String toString() {
		return "Coche [Matricula=" + matricula + ", colorCoche=" + colorCoche
				+ ", numRuedas=" + numRuedas + "]";
	}

	public String getMatricula() {
		return matricula;
	}

	public String getColorCoche() {
		return colorCoche;
	}

	public void setColorCoche(String colorCoche) {
		this.colorCoche = colorCoche;
	}

	public boolean isEstadoCoche() {
		return estadoCoche;
	}


	public void setEstadoCoche(boolean estadoCoche) {
		this.estadoCoche = estadoCoche;
	}


	public int getMetrosTotales() {
		return metrosTotales;
	}


	public void setMetrosTotales(int metrosTotales) {
		this.metrosTotales = metrosTotales;
	}


	public int getTiempoViaje() {
		return tiempoViaje;
	}


	/*
	 * hashCode and equals para comporbar que no existan dos coches con la misma matricula
	 *
	 */
	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return Objects.equals(matricula, other.matricula);
	}

	@Override
	public boolean arrancar() {
		tiempoViaje = 0;
		return estadoCoche;
		
	}

	@Override
	public void avanzarORetroceder(int metros) {
		metrosTotales+= metros;
	    tiempoViaje += metros / 10 * 20; //cada 10 metros sumamos 20 segundos
	}

	@Override
	public boolean parar() {
		tiempoViaje = 0;
		return estadoCoche = false;
	}

}

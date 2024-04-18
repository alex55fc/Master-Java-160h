package com.viewnext.ejerpuntuable1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Camion extends Vehiculo implements Conducible {
	
	private final String matricula;
	private List<Integer> tacometro;
	private boolean estadoCamion = false;
	private int metrosTotales = 0;
	private int tiempoViaje;
	//atributos static
	private static final int NUMERO_RUEDAS_CAMION = 18;
	
	public Camion(String matricula) {
		super(NUMERO_RUEDAS_CAMION);
		this.matricula = matricula;
		tacometro = new ArrayList<>();
	}
	
   
    @Override
	public String toString() {
		return "Camion [matricula=" + matricula + ", tacometro=" + tacometro + ", estadoCamion=" + estadoCamion
				+ ", metrosTotales=" + metrosTotales + ", tiempoViaje=" + tiempoViaje + "]";
	}


	public int getTiempoViaje() {
		return tiempoViaje;
	}


	public boolean isEstadoCamion() {
		return estadoCamion;
	}


	public void setEstadoCamion(boolean estadoCamion) {
		this.estadoCamion = estadoCamion;
	}


	public int getMetrosTotales() {
		return metrosTotales;
	}


	public void setMetrosTotales(int metrosTotales) {
		this.metrosTotales = metrosTotales;
	}


	public String getMatricula() {
		return matricula;
	}


	public void agregarVelocidad(int velocidad) {
        tacometro.add(velocidad);
    }
    
    public List<Integer> getTacometro() {
        return tacometro;
    }
    
    /*
     * 	 hashCode and equals para comporbar que no existan dos c con la misma matricula

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
		Camion other = (Camion) obj;
		return Objects.equals(matricula, other.matricula);
	}


	@Override
	public boolean arrancar() {
		tiempoViaje = 0;
		return estadoCamion;
	}


	@Override
	public void avanzarORetroceder(int metros) {
		metrosTotales+= metros;
	    tiempoViaje += metros / 10 * 20; //cada 10 metros sumamos 20 segundos
	}

	@Override
	public boolean parar() {
		tiempoViaje = 0;
		return estadoCamion = false;
	}

}

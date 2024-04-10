package ejer3.herenciaTiendaInfomatica;

import java.util.Arrays;

public class Ordenador extends Producto{
	private int idOrdenador;
	private String[] caracteristicas;
	private int memoria;
	private int capacidadDiscoDuro;
	
	public Ordenador(String modelo, double precio, int cantidadDisponible,
			int idOrdenador,String[] caracteristicas, int memoria, int capacidadDiscoDuro) {
		super(modelo, precio, cantidadDisponible);
		this.idOrdenador = idOrdenador;
		this.caracteristicas = caracteristicas;
		this.memoria = memoria;
		this.capacidadDiscoDuro = capacidadDiscoDuro;
	}

	@Override
	public String toString() {
		return "Ordenador [idOrdenador=" + idOrdenador + ", caracteristicas=" + Arrays.toString(caracteristicas)
				+ ", memoria=" + memoria + ", capacidadDiscoDuro=" + capacidadDiscoDuro + "\n, codProducto=" + codProducto
				+ ", modelo=" + modelo + ", precio=" + precio + ", cantidadDisponible=" + cantidadDisponible + "]";
	}

	public int getIdOrdenador() {
		return idOrdenador;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public int getCapacidadDiscoDuro() {
		return capacidadDiscoDuro;
	}

	public void setCapacidadDiscoDuro(int capacidadDiscoDuro) {
		this.capacidadDiscoDuro = capacidadDiscoDuro;
	}

	public void setIdOrdenador(int idOrdenador) {
		this.idOrdenador = idOrdenador;
	}

	public void setCaracteristicas(String[] caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public String[] getCaracteristicas() {
		return caracteristicas;
	}
	
}

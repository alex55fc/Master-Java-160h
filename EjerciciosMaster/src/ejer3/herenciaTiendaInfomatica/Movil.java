package ejer3.herenciaTiendaInfomatica;

public class Movil extends Producto{
	private int codMovil;
	private String operador;
	
	public Movil(String modelo, double precio, int cantidadDisponible,
			int codMovil, String operador) {
		super(modelo, precio, cantidadDisponible);
		this.codMovil = codMovil;
		this.operador = operador;
	}

	@Override
	public String toString() {
		return "Movil [codMovil=" + codMovil + ", operador=" + operador + 
				"\n, codProducto=" + codProducto + ", modelo="
				+ modelo + ", precio=" + precio + ", cantidadDisponible=" + cantidadDisponible + "]";
	}

	public int getCodMovil() {
		return codMovil;
	}

	public void setCodMovil(int codMovil) {
		this.codMovil = codMovil;
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}
	
}

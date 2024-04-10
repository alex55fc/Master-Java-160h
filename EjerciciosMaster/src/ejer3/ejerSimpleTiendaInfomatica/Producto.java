package ejer3.ejerSimpleTiendaInfomatica;

public abstract class Producto{
	//atributo static
	private static int CODIGO_REPRODUCTOR_MULTIMEDIA_INCREMENTAL = 0;
	
	protected int codProducto;
	protected String modelo;
	protected double precio;
	protected int cantidadDisponible;
	
	public Producto(String modelo, double precio, int cantidadDisponible) {
		CODIGO_REPRODUCTOR_MULTIMEDIA_INCREMENTAL++;
		this.codProducto = CODIGO_REPRODUCTOR_MULTIMEDIA_INCREMENTAL;
		this.modelo = modelo;
		this.precio = precio;
		this.cantidadDisponible = cantidadDisponible;
	}
	
	
}

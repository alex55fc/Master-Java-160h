package ejer6.Cafetera;

public class Cafetera {
	//metodo static
	private static int CODIGO_AUTOINCREMENTAL= 0;
	private static int CANTIDAD_MAXIMA_CAFETERA= 2000;
	
	private int idCafetera;
	private int capacidadMaxima;
	private int cantidadActual;
	
	//Constructor por defecto, sin ingun parametro
	public Cafetera() {
		CODIGO_AUTOINCREMENTAL++;
		this.idCafetera = CODIGO_AUTOINCREMENTAL;
		this.capacidadMaxima = 1000;
		this.cantidadActual = 0;
	}
	//Constructor donde pasamos la cantidad maxima y establecemos la cantidad actual igual a la maxima
	public Cafetera( int capacidadMaxima) {
		if(capacidadMaxima <= CANTIDAD_MAXIMA_CAFETERA) {
			CODIGO_AUTOINCREMENTAL++;
			this.idCafetera = CODIGO_AUTOINCREMENTAL;
			this.capacidadMaxima = capacidadMaxima;
			this.cantidadActual = capacidadMaxima;
		}
		else {
			CODIGO_AUTOINCREMENTAL++;
			this.idCafetera = CODIGO_AUTOINCREMENTAL;
			this.capacidadMaxima = CANTIDAD_MAXIMA_CAFETERA;
			this.cantidadActual = 0;
		}

	}
	//Constructor donde si la cantidad actual es mayor que la maxima la ajustara al maximo
	public Cafetera( int capacidadMaxima, int cantidadActual) {
		if(capacidadMaxima <= CANTIDAD_MAXIMA_CAFETERA && cantidadActual <= CANTIDAD_MAXIMA_CAFETERA) {
			CODIGO_AUTOINCREMENTAL++;
			this.idCafetera = CODIGO_AUTOINCREMENTAL;
			if(cantidadActual > capacidadMaxima ) {
				this.capacidadMaxima = CANTIDAD_MAXIMA_CAFETERA;
				this.cantidadActual = cantidadActual;
			}
			else {
				this.capacidadMaxima = capacidadMaxima;
				this.cantidadActual = cantidadActual;
			}
		}
		else {
			CODIGO_AUTOINCREMENTAL++;
			this.idCafetera = CODIGO_AUTOINCREMENTAL;
			this.capacidadMaxima = CANTIDAD_MAXIMA_CAFETERA;
			this.cantidadActual = 0;
		}

	}

	@Override
	public String toString() {
		return "Id de la Cafetera= " + idCafetera + ", Capacidad maximad= " + capacidadMaxima + "c.c, Cantdad actual="
				+ cantidadActual + "c.c";
	}

	public int getIdCafetera() {
		return idCafetera;
	}
	public void setIdCafetera(int idCafetera) {
		this.idCafetera = idCafetera;
	}
	public double getCapacidadMaxima() {
		return capacidadMaxima;
	}
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	public double getCantidadActual() {
		return cantidadActual;
	}
	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	public void llenarCafetera() {
		cantidadActual = capacidadMaxima;
		
	}
	public int servirTaza(int cantidadAServir) {
		if(cantidadAServir <= cantidadActual) {
			cantidadActual -= cantidadAServir;
			return cantidadAServir;
		}
		else {
			cantidadAServir = cantidadActual;
			cantidadActual = 0;		
			return cantidadAServir;
		}
	}
	public void vaciarCafetera(){
		 cantidadActual = 0;
	}
	public boolean agregarCafe(int cantidadAniadir){
		int cantidadPosibleaRellenar = capacidadMaxima - cantidadActual;
		if(cantidadAniadir > 0 && cantidadAniadir <= cantidadPosibleaRellenar) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
}

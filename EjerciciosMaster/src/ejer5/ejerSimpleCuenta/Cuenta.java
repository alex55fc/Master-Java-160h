package ejer5.ejerSimpleCuenta;

public class Cuenta {
	
	private String titular;
	private double cantidad;
	
	public Cuenta(String titular, double cantidad) {
		super();
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	public Cuenta(String titular) {
		super();
		this.titular = titular;
	}

	@Override
	public String toString() {
		return "Titular=" + titular + ", cantidad=" + cantidad;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public boolean ingresar (double cantidadAIngresar) {
		if (cantidadAIngresar > 0) {
			cantidad += cantidadAIngresar;
			return true;
		}
		else {
			return false;
		}
	}
	public boolean retirar (double cantidadARetirar) {
		if(cantidadARetirar > cantidad) {
			return false;
		}
		else {
			cantidad -= cantidadARetirar;
			return true;
		}
	}
	
}

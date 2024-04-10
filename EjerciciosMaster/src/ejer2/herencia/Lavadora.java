package ejer2.herencia;

public class Lavadora extends Electrodomestico{
	private int codLavadora;
	private String modelo;
	
	
	public Lavadora(String nombreElectrodomestico,
			int codLavadora, String modelo) {
		super(nombreElectrodomestico);
		this.codLavadora = codLavadora;
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return "Lavadora [codLavadora=" + codLavadora + ", modelo=" + modelo + ", nombreElectrodomestico="
				+ nombreElectrodomestico + "]";
	}


	@Override
	public int voltaje() {
		return 0;
	}


	@Override
	public boolean encender() {
		return false;
	}


	@Override
	public boolean apagar() {
		return false;
	}

}

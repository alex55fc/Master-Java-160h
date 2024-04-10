package ejer2.herencia;

public abstract class Electrodomestico {
	//atributo static
	private static int CODIGO_ELECTRODOMESTICO_INCREMENTAL = 0;
	
	protected int codElectrodomestico;
	protected String nombreElectrodomestico;
	
	public Electrodomestico(String nombreElectrodomestico) {
		CODIGO_ELECTRODOMESTICO_INCREMENTAL++;
		this.codElectrodomestico = CODIGO_ELECTRODOMESTICO_INCREMENTAL;
		this.nombreElectrodomestico = nombreElectrodomestico;
	}

	public int getCodElectrodomestico() {
		return codElectrodomestico;
	}

	public void setCodElectrodomestico(int codElectrodomestico) {
		this.codElectrodomestico = codElectrodomestico;
	}
	
	public String getNombreElectrodomestico() {
		return nombreElectrodomestico;
	}

	public void setNombreElectrodomestico(String nombreElectrodomestico) {
		this.nombreElectrodomestico = nombreElectrodomestico;
	}

	public abstract int voltaje();
	public abstract boolean encender();
	public abstract boolean apagar();

}

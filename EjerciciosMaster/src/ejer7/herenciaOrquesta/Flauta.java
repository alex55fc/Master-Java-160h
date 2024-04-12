package ejer7.herenciaOrquesta;

public class Flauta extends Instrumento{

	protected String modelo;
	
	public Flauta(String nombreInstrumento, String tipo,
			String modelo) {
		super(nombreInstrumento, tipo);
		this.modelo = modelo;
	}

	
	@Override
	public String toString() {
		return "Flauta [modelo=" + modelo + ", nombreInstrumento=" + nombreInstrumento + ", tipo=" + tipo + "]";
	}


	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public void tocar() {
		super.tocar();
		System.out.println("Soplando");
	}
	
}

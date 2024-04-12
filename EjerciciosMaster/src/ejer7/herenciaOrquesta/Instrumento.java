package ejer7.herenciaOrquesta;

public abstract class Instrumento {
	protected String nombreInstrumento;
	protected String tipo;
	
	public Instrumento(String nombreInstrumento, String tipo) {
		super();
		this.nombreInstrumento = nombreInstrumento;
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Instrumento [nombreInstrumento=" + nombreInstrumento + ", tipo=" + tipo + "]";
	}

	public void tocar() {
		System.out.println("Tocando instrumento "+ nombreInstrumento);
	}
	public void afinar() {
		System.out.println("Afinandoel instrumento "+ nombreInstrumento);
	}
}

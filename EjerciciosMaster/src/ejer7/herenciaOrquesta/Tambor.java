package ejer7.herenciaOrquesta;

public class Tambor extends Instrumento{
	protected int tamaño;
	
    public Tambor(String nombreInstrumento, String tipo, int tamaño) {
        super(nombreInstrumento, tipo);
        this.tamaño = tamaño;
    }
    
    @Override
	public String toString() {
		return "Tambor [tamaño=" + tamaño + ", nombreInstrumento=" + nombreInstrumento + ", tipo=" + tipo + "]";
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public void aporrear() {
        System.out.println("Aporreando tambor: " + nombreInstrumento);
    }
    
}

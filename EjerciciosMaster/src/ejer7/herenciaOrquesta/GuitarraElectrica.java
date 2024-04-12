package ejer7.herenciaOrquesta;

public class GuitarraElectrica extends Guitarra {
	protected int potencia;
	
    public GuitarraElectrica(String nombreInstrumento, String tipo, int numeroCuerdas, int potencia) {
        super(nombreInstrumento, tipo, numeroCuerdas);
        this.potencia = potencia;
    }
    
    @Override
	public String toString() {
		return "GuitarraElectrica [potencia=" + potencia + ", numCuerdas=" + numCuerdas + ", nombreInstrumento="
				+ nombreInstrumento + ", tipo=" + tipo + "]";
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
    public void tocar() {
        System.out.println("Tocando la guitarra eléctrica");
    }

}

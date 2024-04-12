package ejer7.herenciaOrquesta;
//utilizamos class a secas? o abstract class ya que heredara una clase de ella, y por lso metodos aunque no sena abstractos
public class Guitarra extends Instrumento {
	
	protected int numCuerdas;
	
	public Guitarra(String nombreInstrumento, String tipo,
			int numCuerdas) {
		super(nombreInstrumento, tipo);
		this.numCuerdas = numCuerdas;
	}

	@Override
	public String toString() {
		return "Guitarra [numCuerdas=" + numCuerdas + ", nombreInstrumento=" + nombreInstrumento + ", tipo=" + tipo
				+ "]";
	}

	public int getNumCuerdas() {
		return numCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}
	
	@Override
	public void tocar() {
		System.out.println("Tocando instrumento "+ nombreInstrumento );
	}

}

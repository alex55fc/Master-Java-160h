package ejer11.electrodomesticos;

public class Lavadora extends Electrodomestico {
	//atributos static
	private static final double CARGA_POR_DEFECTO = 5.00;

	private double carga;

	public Lavadora() {
		super();
		this.carga = CARGA_POR_DEFECTO;
	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase,peso);
		this.carga = CARGA_POR_DEFECTO;

	}

	public Lavadora(double precioBase, String color, char cosumoEnergetico, double peso,
			double carga) {
		super(precioBase, color, cosumoEnergetico, peso);
		this.carga = carga;

	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", precioBase=" + precioBase + ", color=" + color + ", cosumoEnergetico="
				+ cosumoEnergetico + ", peso=" + peso + "]";
	}
	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		if (carga > 30){
			precioFinal+= 50;
		}
		return precioFinal;
	}
}





package ejer11.electrodomesticos;

public class Television extends Electrodomestico {
	private int pulgadas;
	private boolean sintonizadorTDT;
	
	//atributos static
	private static final int PULGADAS_POR_DEFECTO = 20;
	private static final boolean SINTONIZADORTDT_POR_DEFECTO = false;
	
	public Television() {
		super();
		this.pulgadas = PULGADAS_POR_DEFECTO;
		this.sintonizadorTDT = SINTONIZADORTDT_POR_DEFECTO;
	}
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		this.pulgadas = PULGADAS_POR_DEFECTO;
		this.sintonizadorTDT = SINTONIZADORTDT_POR_DEFECTO;
	}
	public Television(double precioBase, String color, char cosumoEnergetico, double peso,
			int pulgadas, boolean sintonizadorTDT) {
		super(precioBase, color, cosumoEnergetico, peso);
		this.pulgadas = pulgadas;
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	public int getPulgadas() {
		return pulgadas;
	}
	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	
	@Override
	public String toString() {
		return "Television [pulgadas=" + pulgadas + ", sintonizadorTDT=" + sintonizadorTDT + ", precioBase="
				+ precioBase + ", color=" + color + ", cosumoEnergetico=" + cosumoEnergetico + ", peso=" + peso + "]";
	}
	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		if(pulgadas > 40) {
			precioFinal *= 1.3;
		}
		if(sintonizadorTDT) {
			precioFinal += 50;
		}
		return precioFinal;	
	}
	
}

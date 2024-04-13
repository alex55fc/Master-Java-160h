package ejer10.figuraGeometricaInterface;

public class Cuadrado implements FiguraGeometrica {
	private static int NUM_LADOS = 4;
	private double lado;
	
	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [calcularArea()=" + calcularArea() + ", calcularPerimetro()=" + calcularPerimetro() + "]";
	}

	@Override
	public double calcularArea() {
		return lado * lado;
	}

	@Override
	public double calcularPerimetro() {
		return NUM_LADOS * lado;
	}

}

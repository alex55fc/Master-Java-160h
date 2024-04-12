package ejer10.figuraGeometricaClassAbstract;

public class TrianguloEquilatero extends FiguraGeometrica {
	private static int NUM_LADOS = 3;
	private double lado;
	

	public TrianguloEquilatero(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "TrianguloEquilatero [calcularArea()=" + calcularArea() + ", calcularPerimetro()=" + calcularPerimetro()
				+ "]";
	}

	@Override
	public double calcularArea() {
		return (Math.sqrt(3) / 4) * Math.pow(lado, 2);
	}

	@Override
	public double calcularPerimetro() {
		return lado * NUM_LADOS;
	}

}

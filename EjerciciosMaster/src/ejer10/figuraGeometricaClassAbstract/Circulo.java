package ejer10.figuraGeometricaClassAbstract;

public class Circulo extends FiguraGeometrica {
	private double radio;
	
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [calcularArea()=" + calcularArea() + ", calcularPerimetro()=" + calcularPerimetro() + "]";
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI *(2 * radio);
	}

	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * radio;
	}

}

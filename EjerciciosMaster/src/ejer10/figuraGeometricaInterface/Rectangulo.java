package ejer10.figuraGeometricaInterface;

public class Rectangulo implements FiguraGeometrica {
	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Rectangulo [calcularArea()=" + calcularArea() + ", calcularPerimetro()=" + calcularPerimetro() + "]";
	}

	@Override
	public double calcularArea() {
		return base * altura;
	}

	@Override
	public double calcularPerimetro() {
		return 2*(base + altura);
	}

}

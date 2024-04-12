package ejer10.figuraGeometricaClassAbstract;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static List<FiguraGeometrica> crearFiguras() {
		List<FiguraGeometrica> listaFiguras = new ArrayList<>();
		listaFiguras.add(new Rectangulo(2,4));
		listaFiguras.add(new Cuadrado(3));
		listaFiguras.add(new Circulo(5));
		listaFiguras.add(new TrianguloEquilatero(3));
		return listaFiguras;
	}
	public static void areaYPerimetroDeFiguras(List<FiguraGeometrica> listaFiguras) {
		for(FiguraGeometrica figurax : listaFiguras) {
			figurax.toString();
			System.out.println(figurax.toString());
		}
	}
	public static void main(String[] args) {
		List<FiguraGeometrica> listaFiguras;
		listaFiguras = crearFiguras();
		System.out.println("Veamos el area y el perimetro de las figuras!!");
		areaYPerimetroDeFiguras(listaFiguras);
	}

}

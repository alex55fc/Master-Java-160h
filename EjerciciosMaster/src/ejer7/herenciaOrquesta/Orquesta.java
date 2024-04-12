package ejer7.herenciaOrquesta;

import java.util.ArrayList;
import java.util.List;

public class Orquesta {
	public static List<Instrumento> crearInstrumentosYmeterlosALista() {
		List<Instrumento> listaInstrumentos = new ArrayList<>();
        listaInstrumentos.add(new Flauta("Flauta", "Viento", "Modelo1"));
        listaInstrumentos.add(new Guitarra("Guitarra", "Cuerda", 6));
        listaInstrumentos.add(new GuitarraElectrica("Guitarra Eléctrica", "Cuerda", 6, 120));
        listaInstrumentos.add(new Tambor("Tambor", "Percusión", 10));
        return listaInstrumentos;
	}
	public static void suenanLosInstrumentos(List<Instrumento> listaInstrumentos) {
		for(Instrumento instrumentox : listaInstrumentos) {
			if(instrumentox instanceof Tambor) {
				Tambor tamborx = (Tambor) instrumentox;
				tamborx.aporrear();
			}
			else {
				instrumentox.tocar();
			}
		}
	}
	public static void main(String[] args) {
		List<Instrumento> listaInstrumentos = new ArrayList<>();
		
		listaInstrumentos = crearInstrumentosYmeterlosALista();
		System.out.println("Que empiecen a sonar los instrumentos!!");
		suenanLosInstrumentos(listaInstrumentos);
	}

}

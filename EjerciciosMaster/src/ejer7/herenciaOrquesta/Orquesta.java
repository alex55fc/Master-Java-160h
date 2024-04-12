package ejer7.herenciaOrquesta;

public class Orquesta {
	public static void main(String[] args) {
        Instrumento instrumento1 = new Flauta("Flauta", "Viento", "Modelo1");
        Instrumento instrumento2 = new Guitarra("Guitarra", "Cuerda", 6);
        Instrumento instrumento3 = new GuitarraElectrica("Guitarra Eléctrica", "Cuerda", 6, 120);
        Instrumento instrumento4 = new Tambor("Tambor", "Percusión", 10);
        
        Tambor tambor = (Tambor) instrumento4;
        System.out.println("Instrumentos empiezan a sonar y el tambor a ser aporreado");
        instrumento1.tocar();
        instrumento2.tocar();
        instrumento3.tocar();
        tambor.aporrear();
	}

}

package ejer9.ejerSimpleHerenciaAnimales;

public class Gato extends Animal implements Mascota {
	//atributo static
	private static int NUMERO_PATAS = 4;
	private String nombre;
	
	public Gato(String nombre) {
		super(NUMERO_PATAS);
		this.nombre = nombre;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void jugar() {
		System.out.println("A "+ nombre + " le gusta jugar con pelotas");
	}

	@Override
	public void comer() {
		System.out.println("\nA los gatos les gusta comer peces y arañas");
	}

	@Override
	public void andar() {
		System.out.println("Este animal camina sobre "+ NUMERO_PATAS+ " patas");
	}

}

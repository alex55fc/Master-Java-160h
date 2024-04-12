package ejer9.ejerSimpleHerenciaAnimales;

public class Pez extends Animal implements Mascota {
	//atributo static
	private static int NUMERO_PATAS = 0;
	private String nombre;
	
	public Pez(String nombre) {
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
		System.out.println("Estoy nadando");
	}

	@Override
	public void comer() {
		System.out.println("\nLos peces comen planton");
	}

	@Override
	public void andar() {
		System.out.println("En realidad no ando , nado");
	}

}

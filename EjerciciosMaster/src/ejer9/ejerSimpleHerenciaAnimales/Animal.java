package ejer9.ejerSimpleHerenciaAnimales;

public abstract class Animal {
	protected int numPatas;
	
	public Animal(int numPatas) {
		super();
		this.numPatas = numPatas;
	}
	public abstract void comer();
	public abstract void andar();
	
}

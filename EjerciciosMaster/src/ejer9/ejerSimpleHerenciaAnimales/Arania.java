package ejer9.ejerSimpleHerenciaAnimales;

public class Arania extends Animal{
	//atributo estatic
	private static int NUMERO_PATAS = 8;
	
	public Arania() {
		super(NUMERO_PATAS);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comer() {
		System.out.println("\nLas aranias comen mosquitos");
	}

	@Override
	public void andar() {
		System.out.println("Este animal camina sobre "+ NUMERO_PATAS+ " patas");
		
	}
	
}

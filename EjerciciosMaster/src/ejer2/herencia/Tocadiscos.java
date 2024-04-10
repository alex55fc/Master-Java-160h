package ejer2.herencia;

public class Tocadiscos extends ReproductorMultimedia{
	private int codTocadiscos;
	private String modelo;
	
	public Tocadiscos(String nombreReproductorMultimedia,
			int codTocadiscos,String modelo) {
		super(nombreReproductorMultimedia);
		this.codTocadiscos =  codTocadiscos;
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Tocadiscos [codTocadiscos=" + codTocadiscos + ", modelo=" + modelo + ", nombreReproductorMultimedia="
				+ nombreReproductorMultimedia + "]";
	}

	@Override
	public boolean encender() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean apagar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean play() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean rewind() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int velocidad() {
		// TODO Auto-generated method stub
		return 0;
	}

}

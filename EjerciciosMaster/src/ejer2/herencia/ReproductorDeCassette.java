package ejer2.herencia;

public class ReproductorDeCassette extends ReproductorMultimedia{
	private int codRepCassette;
	private String modelo;
	
	public ReproductorDeCassette(String nombreReproductorMultimedia,
			int codRepCassette, String modelo) {
		super(nombreReproductorMultimedia);
		this.codRepCassette = codRepCassette;
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "ReproductorDeCassette [codRepCassette=" + codRepCassette + ", modelo=" + modelo
				+ ", nombreReproductorMultimedia=" + nombreReproductorMultimedia + "]";
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

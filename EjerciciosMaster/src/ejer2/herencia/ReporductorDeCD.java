package ejer2.herencia;

public class ReporductorDeCD extends ReproductorMultimedia{
	private int codRepCD;
	private String nombreCD;
	
	public ReporductorDeCD(String nombreReproductorMultimedia,
			int codRepCD, String nombreCD) {
		super(nombreReproductorMultimedia);
		this.codRepCD = codRepCD;
		this.nombreCD =nombreCD;
	}

	@Override
	public String toString() {
		return "ReporductorDeCD [codRepCD=" + codRepCD + ", nombreCD=" + nombreCD + ", nombreReproductorMultimedia="
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

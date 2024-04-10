package ejer2.herencia;

public class CocinaDeGas extends Electrodomestico {
	private int codCocinaGas;
	private String modelo;
	
	public CocinaDeGas(String nombreElectrodomestico,
			int codCocinaGas, String modelo) {
		super(nombreElectrodomestico);
		this.codCocinaGas = codCocinaGas;
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "CocinaDeGas [codCocinaGas=" + codCocinaGas + ", modelo=" + modelo + ", nombreElectrodomestico="
				+ nombreElectrodomestico + "]";
	}

	@Override
	public int voltaje() {
		// TODO Auto-generated method stub
		return 0;
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

}

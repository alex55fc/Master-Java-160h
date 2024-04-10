package ejer2.herencia;

public class Batidora extends Electrodomestico {
	private int codBatidora;
	private String modelo;
	
	public Batidora(String nombreElectrodomestico, 
			int codBatidora, String modelo) {
		super(nombreElectrodomestico);
		this.codBatidora = codBatidora;
		this.modelo = modelo;	
	}

	@Override
	public String toString() {
		return "Batidora [codBatidora=" + codBatidora + ", modelo=" + modelo + ", nombreElectrodomestico="
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

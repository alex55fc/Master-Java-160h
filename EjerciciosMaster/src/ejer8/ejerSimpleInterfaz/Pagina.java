package ejer8.ejerSimpleInterfaz;

public class Pagina implements Imprimible{
	
	private int nPaginas;
	private int nLineas;
	
	
	public Pagina(int nPaginas, int nLineas) {
		super();
		this.nPaginas = nPaginas;
		this.nLineas = nLineas;
	}

	@Override
	public String informeCorto() {
		return "Numero de paginas: "+ nPaginas;
	}

	@Override
	public String informeLargo() {
		return "Numero de paginas: "+ nPaginas +", numero de lineas: "+ nLineas;
	}


}

package ejer8.ejerSimpleInterfaz;

public class Factura implements Imprimible{
	private int nFactura;
	private int codigoCliente;
	
	public Factura(int nFactura, int coidgoCliente) {
		super();
		this.nFactura = nFactura;
		this.codigoCliente = coidgoCliente;
	}
	
	@Override
	public String informeCorto() {
		// TODO Auto-generated method stub
		return "Numero factura: "+ nFactura;
	}
	@Override
	public String informeLargo() {
		// String Auto-generated method stub
		return "Numero factura: "+ nFactura+ ", codigo cliente: "+ codigoCliente;
	}
	
}

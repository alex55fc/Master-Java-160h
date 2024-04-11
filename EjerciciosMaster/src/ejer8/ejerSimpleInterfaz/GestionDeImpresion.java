package ejer8.ejerSimpleInterfaz;

public class GestionDeImpresion {
	public static void instanciarObjetosPaginaFacturaYEjecutarMetodos() {
		Pagina pagina = new Pagina(10,14);
		Factura factura = new Factura(12,16);
		System.out.println(pagina.informeCorto());
		System.out.println(pagina.informeLargo());
		System.out.println(factura.informeCorto());
		System.out.println(factura.informeLargo());		
	
	}
	public static void main(String[] args) {
		instanciarObjetosPaginaFacturaYEjecutarMetodos();
		
	}

}

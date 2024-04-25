package com.viewnext.gestionbiblioteca;

public class Socio extends Usuario{
	private int contadorDocumentos;

	private static final int NUMERO_DIAS_PRESTAMO_LIBRO = 30 ;
	private static final int NUMERO_DIAS_PRESTAMO_REVISTA= 10 ;

	public Socio(String dniUsuario, String nombreUsuario) {
		super(dniUsuario, nombreUsuario);
		vectorDocumentos= new Documento[20];
		contadorDocumentos= 0;

	}


	@Override
	public String toString() {
		return "El Socio " + nombreUsuario + " con DNI \"" + dniUsuario+
				"\" tiene " + contadorDocumentos + "documentos prestados y su capacidad maxima es de " + vectorDocumentos.length;
	}
	public String documentosEnPrestamo() {
		String cadena= "";
		if(contadorDocumentos== 0) {
			cadena =  "Este Socio no tiene ningun documento";
		}
		else {
			for( int posVector = 0; posVector < contadorDocumentos ; posVector++) {
				Documento docu = vectorDocumentos[posVector];
				cadena = cadena + "(" + posVector + ")"+ docu.toString()+ "\n";
			}
		}
		return  cadena;
	}

	@Override
	boolean prestamoLibro(int diasPrestamo,Documento docu) {
		if(diasPrestamo > 0 && diasPrestamo <= NUMERO_DIAS_PRESTAMO_LIBRO ) {
			if (contadorDocumentos < vectorDocumentos.length) {
				vectorDocumentos[contadorDocumentos] = docu;
				contadorDocumentos++;
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

	@Override
	boolean prestamoRevista(int diasPrestamo, Documento docu) {
		if(diasPrestamo > 0 && diasPrestamo <= NUMERO_DIAS_PRESTAMO_REVISTA ) {
			if (contadorDocumentos < vectorDocumentos.length) {
				vectorDocumentos[contadorDocumentos] = docu;
				contadorDocumentos++;
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	/*
	 * Metodo que devulve true si el contador es iguala la longitud maxima del vector(osea esta lleno)
	 * y false de lo contrario(si hay espacio todavia.
	 */
	@Override
	boolean vectorLleno() {
		return contadorDocumentos == vectorDocumentos.length;
	}


	@Override
	void insertarDocumento(Documento docu) {
		vectorDocumentos[contadorDocumentos] = docu;
		contadorDocumentos++;
	}

}

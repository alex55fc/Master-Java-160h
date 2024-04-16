package ejer11.electrodomesticos;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static Electrodomestico[] arrayElectrodomesticos() {
		Electrodomestico [] arrayElectrodomestico = new Electrodomestico [10];
		arrayElectrodomestico[0]= new Electrodomestico();
		arrayElectrodomestico[1]= new Electrodomestico(10.00,32.00);
		arrayElectrodomestico[2]= new Electrodomestico(10.00,"marron", 'm', 22.00);
		arrayElectrodomestico[2]= new Electrodomestico(10.00,"rojo", 'a', 22.00);
		arrayElectrodomestico[3]= new Lavadora();
		arrayElectrodomestico[4]= new Lavadora(20.00, 10.00);
		arrayElectrodomestico[5]= new Lavadora(10.00,"cian", 'm', 22.00, 7.00);
		arrayElectrodomestico[6]= new Lavadora(10.00,"gris", 'a', 22.00, 7.00);
		arrayElectrodomestico[7]= new Television();
		arrayElectrodomestico[8]= new Television(20.00, 10.00);
		arrayElectrodomestico[9]= new Television(10.00,"gris", 'a', 22.00, 7, true);

		return arrayElectrodomestico;
	}

	public static void main(String[] args) {
		double precioTotalElectrodomesticos = 0;
		double precioTotalLavadoras = 0;
		double precioTotalTelevisiones = 0;
		double precio;
		Electrodomestico electrodomesticoAux;
		Electrodomestico [] arrayElectrodomesticos = arrayElectrodomesticos();
		
		for(int pos = 0; pos < arrayElectrodomesticos.length ; pos++ ) {
			electrodomesticoAux = arrayElectrodomesticos[pos];
			
			precio = electrodomesticoAux.precioFinal();

			if (electrodomesticoAux instanceof Lavadora) {
				precioTotalLavadoras += precio;
			} else if (electrodomesticoAux instanceof Television) {
				precioTotalTelevisiones += precio;
			} 
			precioTotalElectrodomesticos += precio;
			System.out.println(electrodomesticoAux.toString());
			System.out.println("Precio final del electrodomestico: "+ precio+ "$\n");
		}

		System.out.println("Precio total de electrodomésticos: " + precioTotalElectrodomesticos);
		System.out.println("Precio total de lavadoras: " + precioTotalLavadoras);
		System.out.println("Precio total de televisiones: " + precioTotalTelevisiones);

	}

}

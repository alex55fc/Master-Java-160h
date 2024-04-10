package ejer2.herencia;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		//Creacion de obejtos
		Lavadora lavadora = new Lavadora("Lavadora Samsung", 101, "XYZ123");
		Batidora batidora = new Batidora("Batidora Philips", 202, "ABC456");
		CocinaDeGas cocinaDeGas = new CocinaDeGas("Cocina de Gas Bosch", 303, "DEF789");
		Lavadora lavadora2 = new Lavadora("Lavadora LG", 102, "ABC456");
		Batidora batidora2 = new Batidora("Batidora Moulinex", 203, "DEF789");
		CocinaDeGas cocinaDeGas2 = new CocinaDeGas("Cocina de Gas Balay", 304, "GHI012");
		
		ReporductorDeCD reproductorCD1 = new ReporductorDeCD("Reproductor de CD Sony", 401, "Best Hits");
		ReporductorDeCD reproductorCD2 = new ReporductorDeCD("Reproductor de CD Philips", 402, "Party Mix");
		Tocadiscos tocadiscos1 = new Tocadiscos("Tocadiscos Pioneer", 501, "Vintage Edition");
		Tocadiscos tocadiscos2 = new Tocadiscos("Tocadiscos Technics", 502, "Professional Series");
		ReproductorDeCassette reproductorCassette1 = new ReproductorDeCassette("Reproductor de Cassette Panasonic", 601, "Retro Style");
		ReproductorDeCassette reproductorCassette2 = new ReproductorDeCassette("Reproductor de Cassette JVC", 602, "Classic Design");
		
		int espaciosVector = 6;
		Electrodomestico[] vecElectrodomestico= new Electrodomestico[espaciosVector];
		vecElectrodomestico[0] = lavadora;
        vecElectrodomestico[1] = batidora;
        vecElectrodomestico[2] = cocinaDeGas;
        vecElectrodomestico[3] = lavadora2;
        vecElectrodomestico[4] = batidora2;
        vecElectrodomestico[5] = cocinaDeGas2;
        
        ReproductorMultimedia[] vecReproducMultimedia = new ReproductorMultimedia[espaciosVector];
        vecReproducMultimedia[0] = reproductorCD1;
        vecReproducMultimedia[1] = reproductorCD2;
        vecReproducMultimedia[2] = tocadiscos1;
        vecReproducMultimedia[3] = tocadiscos2;
        vecReproducMultimedia[4] = reproductorCassette1;
        vecReproducMultimedia[5] = reproductorCassette2;
        
        System.out.println("Vector de Electrodomesticos");
        for (int pos = 0; pos < espaciosVector ; pos ++) {
        	Electrodomestico x = vecElectrodomestico[pos];
        	if(x instanceof Lavadora) {
        		System.out.println("El electrodomestico es una Lavadora: "+ x.getNombreElectrodomestico());
        	}
        	else if(x instanceof Batidora) {
        		System.out.println("El electrodomestico es una Batidora: "+ x.getNombreElectrodomestico());
        	}
        	else if(x instanceof CocinaDeGas) {
        		System.out.println("El electrodomestico es una cocina de gas:  "+ x.getNombreElectrodomestico());
        	}
        	else {
        		System.out.println("El objeto no es un Electrodomestico");
        	}
        }
        System.out.println("\nVector de Reproductores multimedia ");
        for(ReproductorMultimedia x : vecReproducMultimedia) {
        	if (x instanceof Tocadiscos) {
        		System.out.println("El reproductor multimedia es un tocadiscos: "+ x.nombreReproductorMultimedia);
        	}
        	else if(x instanceof ReproductorDeCassette) {
        		System.out.println("El reproductor multimedia es un Reproductor de Cassettes: "+ x.nombreReproductorMultimedia);

        	}
        	else if(x instanceof ReporductorDeCD) {
        		System.out.println("El reproductor multimedia es un Reproductor de CDs: "+ x.nombreReproductorMultimedia);

        	}
        	else {
        		System.out.println("El objeto no es n Reproducor multimedia.");
        	}
        }
	}

}

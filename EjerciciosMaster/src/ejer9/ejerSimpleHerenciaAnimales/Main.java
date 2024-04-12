package ejer9.ejerSimpleHerenciaAnimales;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static List<Animal> crearAnimalesYMeterlosEnLista() {
		List<Animal> listaAnimales = new ArrayList<>();
		listaAnimales.add(new Arania());
		listaAnimales.add(new Gato("Felipe el gato"));
		listaAnimales.add(new Pez("Felix el pez"));
		return listaAnimales;
	}
	public static void accionesDeLosAnimales(List<Animal> listaAnimales) {
		System.out.println("Acciones que hacen los animales: ");
		for(Animal animalx : listaAnimales) {
			animalx.comer();
			animalx.andar();
			if(animalx instanceof Mascota) {
				System.out.println("Pero yo soy una mascota y puedo jugar ^^");
				((Mascota) animalx).jugar();
			}
			else {
				System.out.println("Yo no soy una mascota :(");
			}
		}

	}
	public static void main(String[] args) {
		List<Animal> listaAnimales;
		listaAnimales = crearAnimalesYMeterlosEnLista();
		accionesDeLosAnimales(listaAnimales);
	}

}

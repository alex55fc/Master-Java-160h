package ejer3.herenciaTiendaInfomatica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static List<Producto> crearObejtos() {
		List<Producto>listaProductos = new ArrayList<>();
		
        		Ordenador ord1 = new Ordenador( "HP Pavilion", 799.99, 5, 1,
                new String[]{"Intel Core i5", "8GB RAM", "256GB SSD"}, 8, 512);
                listaProductos.add(ord1);

                Ordenador ord2 =new Ordenador( "Dell Inspiron", 899.99, 3, 2,
                new String[]{"AMD Ryzen 7", "16GB RAM", "512GB SSD"}, 16, 1024);
                listaProductos.add(ord2);

        listaProductos.add(new Movil( "Samsung Galaxy S21", 999.99, 10, 1, "AT&T"));
        listaProductos.add(new Movil( "iPhone 13 Pro", 1299.99, 8, 2, "Verizon"));
        
        return listaProductos;
	}
	public static void main(String[] args) {
		
		List<Producto> listaProductos = crearObejtos();
		
		if (listaProductos.isEmpty()) {
			System.out.println("No hay datos en la lista");
		}
		else {

			for(Producto x : listaProductos) {
				if(x instanceof Ordenador) {
					//esto nos devuelve true si esta en la clase pelicula, false si no lo esta y null si no existe
					/*ahora como sabemos que el objeto video esta instanciado en una clase pelicula tranformamos 
					el objeto video a un objeto de pelicula para poder usar el getter o setter de esta pelicula y podemos asi saber sus datos*/
					Ordenador ordenadorX = (Ordenador) x;
					System.out.println("Ordenador: Id del producto "+ ordenadorX.codProducto+ ", Id del ordenador "+ ordenadorX.getIdOrdenador() 
					+ "\nCaracteristicas: "+ Arrays.toString(ordenadorX.getCaracteristicas()) );
				}
				else if (x instanceof Movil) {
					Movil movilX = (Movil)x;
					System.out.println("Movil: Id del producto "+ movilX.codProducto+ ", Id del movil "+ movilX.getCodMovil()+ ", Operador "+ movilX.getOperador());
				}
				else {
					System.out.println("este objeto no es un producto "+ x.toString());
				}
			}
		}
	}

}

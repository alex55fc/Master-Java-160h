package ejer4.ejerSimpleLibro;

public class main {

	public static void main(String[] args) {

		Libro libro1 = new Libro("737473-223", "El principito", "Jonh", 21);
		Libro libro2 = new Libro("734563-733", "V de vendetta", "Juan", 24);
		
		System.out.println(libro1 +"\n"+ libro2);
		if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
			System.out.println("El "+ libro1.getTitulo() + " tiene mas paginas.");
		}
		else {
			System.out.println("El "+ libro2.getTitulo() + " tiene mas paginas.");
		}
	}

}

package example.enumUse;

public class EnumDemo2 {

	public static void main(String[] args) {

		Tutoriales2 t1 = Tutoriales2.JAVA;
		Tutoriales2 t2 = Tutoriales2.HTML;
		Tutoriales2 t3 = Tutoriales2.MYSQL;

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println("Lista de Turoriales:");
		for (Tutoriales2 tuto : Tutoriales2.values()) {
			System.out.println("\tEl tutorial de " + tuto + " cuesta " + tuto.mostrarPrecio() + " euros");
		}
		System.out.println(Tutoriales2.JAVA.ordinal());
	}

}

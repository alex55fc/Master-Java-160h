package ejer5.ejerSimpleCuenta;

public class Main {

	public static void main(String[] args) {
		
		Cuenta cuenta1 = new Cuenta("Alex", 100.00);
		Cuenta cuenta2 = new Cuenta("Pablo");
		
		System.out.println("Cuenta 1 : "+ cuenta1.toString());
		System.out.println("\nIntentar ingresar 10$ a cuenta 1");
		if(cuenta1.ingresarDinero(10.00)) {
			System.out.println("Se ingresaron 10$ a la cuenta del titular "+ cuenta1.getTitular()+
					" cantidad total: "+ cuenta1.getCantidad());
		}
		else {
			System.out.println("Error al intentar el ingreso");
		}
		
		System.out.println("\nIntentar retirar 200$ a cuenta1");
		if(cuenta1.retirarDinero(200.00)) {
			System.out.println("Se pudo retirar los 200$");
		}
		else {
			System.out.println("No se pudo retirar la cantidad "+ 200.00 +
					" es una cantidad superior que la cantidad que hay en la cuenta: "+ cuenta1.getCantidad());
		}
	}

}

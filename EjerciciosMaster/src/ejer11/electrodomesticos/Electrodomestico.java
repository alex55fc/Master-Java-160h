package ejer11.electrodomesticos;

public class Electrodomestico {
	protected double precioBase;
	protected Color color;
	protected ConsumoEnergetico cosumoEnergetico;
	protected double peso;
	
	//atributos static 
	private static final Color COLOR_POR_DEFECTO = Color.blanco;
	private static final ConsumoEnergetico CONSUMO_ENERGETICO_POR_DEFECTO = ConsumoEnergetico.F;
	private static final double PRECIO_BASE_POR_DEFECTO = 100.00;
	private static final double PESO_POR_DEFECTO = 5.00;

	//constructor por defect0
	public Electrodomestico() {
		super();
		this.precioBase = PRECIO_BASE_POR_DEFECTO;
		this.color = COLOR_POR_DEFECTO;
		this.cosumoEnergetico = CONSUMO_ENERGETICO_POR_DEFECTO;
		this.peso = PESO_POR_DEFECTO;
	}
	
	//constructor con el precio y peso
	public Electrodomestico(double precioBase, double peso) {
		this();//pone el resto de datos como el constructor por default
		this.precioBase = precioBase;
		this.peso = peso;
	}
	
	//constructor con todos los atributos
	public Electrodomestico(double precioBase, String color, char cosumoEnergetico, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.cosumoEnergetico = comprobarConsumoEnergetico(cosumoEnergetico) ;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + "$, color=" + color + ", cosumoEnergetico="
				+ cosumoEnergetico + ", peso=" + peso + "kgs]";
	}
	
	//Metodos get()
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public ConsumoEnergetico getCosumoEnergetico() {
		return cosumoEnergetico;
	}

	public void setCosumoEnergetico(ConsumoEnergetico cosumoEnergetico) {
		this.cosumoEnergetico = cosumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	/*
	 * Recorre los enumerables de la clase ConsumoEnergetico 
	 * comprueba el primer caracter para ver si coincide con el char que le pasan
	 * Transforma el parametro char a mayusculas si es que vienen en minuculas
	 * si es igual al enumerable devuelve dicho enumerabloe
	 * las clases hijas usaran este metodo aunque no este implementado en dichas clases
	 */
	public static ConsumoEnergetico  comprobarConsumoEnergetico(char letra) {
		for(ConsumoEnergetico letraConsumo : ConsumoEnergetico.values()) {
			if(letraConsumo.name().charAt(0) == Character.toUpperCase(letra)) {
				return letraConsumo;
			}
		}	
		return CONSUMO_ENERGETICO_POR_DEFECTO;
	}
	/*
	 * Recorre los enumerablos de la clase Color
	 * comprueba si el string coincide con un enumerable de la clase, si es asi devulve dicho enum
	 * si no devuelve el colo por defecto 
	 */
	public static Color  comprobarColor(String color) {
		for(Color colorEnum : Color.values()) {
			if(colorEnum.name().equals(color)) {
				return colorEnum;
			}
		}	
		return COLOR_POR_DEFECTO;
	}
	//este metodo en lo personal lo dividiria en varios submetodos, para que un metodo solo no haga todo 
	//no veo una forma mas secnilla o menos visual de hacer este metodo 
	public double precioFinal() {
	    double precioFinal = precioBase; 
	    
	    // Aumentar el precio según el consumo energético
	    switch (cosumoEnergetico) {
	        case A:
	            precioFinal += 100;
	            break;
	        case B:
	            precioFinal += 80;
	            break;
	        case C:
	            precioFinal += 60;
	            break;
	        case D:
	            precioFinal += 50;
	            break;
	        case E:
	            precioFinal += 30;
	            break;
	        case F:
	            precioFinal += 10;
	            break;
	    }
	    
	    // Aumentar el precio según el peso
	    if (peso >= 0 && peso < 20) {
	        precioFinal += 10;
	    } else if (peso >= 20 && peso < 50) {
	        precioFinal += 50;
	    } else if (peso >= 50 && peso < 80) {
	        precioFinal += 80;
	    } else {
	    	precioFinal += 100;
	    }
	    return precioFinal;
	}
}

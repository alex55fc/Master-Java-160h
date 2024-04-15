package example.enumUse;

public enum Tutoriales2 {

    //Ahora cada tutorial tiene un precio
    JAVA(40), HTML(30), MYSQL(25);
    
    int precio;

    private Tutoriales2(int precio) {
            this.precio = precio;
    }
    public int mostrarPrecio() {
            return precio;
    }
}

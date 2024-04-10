package ejer2.herencia;

public abstract class ReproductorMultimedia {
	//atributo static
	private int CODIGO_REPRODUCTOR_MULTIMEDIA_INCREMENTAL = 0;
	
	protected int codReproducMultimedia;
	protected String nombreReproductorMultimedia;

	public ReproductorMultimedia(String nombreReproductorMultimedia) {
		this.codReproducMultimedia = CODIGO_REPRODUCTOR_MULTIMEDIA_INCREMENTAL;
		this.nombreReproductorMultimedia = nombreReproductorMultimedia;
	}


	public int getCodReproducMultimedia() {
		return codReproducMultimedia;
	}

	public void setCodReproducMultimedia(int codReproducMultimedia) {
		this.codReproducMultimedia = codReproducMultimedia;
	}
	public abstract boolean encender();
	public abstract boolean apagar();
	public abstract boolean play();
	public abstract boolean rewind();
	public abstract int velocidad();

}

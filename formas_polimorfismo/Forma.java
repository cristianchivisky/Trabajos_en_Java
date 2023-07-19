package formas_polimorfismo;


public abstract class Forma {
	private String color;
	private Punto coordenadaDelCentro;
	private String nombreDeLaForma;
	
	public Forma(String color, Punto coordenadaDelCentro, String nombreDeLaForma) {
		super();
		this.color = color;
		this.coordenadaDelCentro = coordenadaDelCentro;
		this.nombreDeLaForma = nombreDeLaForma;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Punto getCrdenadaDelCentro() {
		return coordenadaDelCentro;
	}

	public void setCrdenadaDelCentro(Punto coordenadaDelCentro) {
		this.coordenadaDelCentro = coordenadaDelCentro;
	}

	public String getNombreDeLaForma() {
		return nombreDeLaForma;
	}

	public void setNombreDeLaForma(String nombreDeLaForma) {
		this.nombreDeLaForma = nombreDeLaForma;
	}

	public String imprimir() {
		return "Nombre de la forma: " + this.nombreDeLaForma + ", color: "+ this.color + ", centro: "+ this.coordenadaDelCentro;
	}
	public void cambiarColor(String c) {
		this.color = c;
		
	}
	public void moverLaForma(Punto centro) {
		this.coordenadaDelCentro = centro;
	}
	public abstract Double calcularArea();
	public abstract Double calcularPerimetro();
	

}


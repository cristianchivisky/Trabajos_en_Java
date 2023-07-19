package formas_polimorfismo;


public class Rectangulo extends Forma {
	private Double ladoMenor;
	private Double ladoMayor;	
	
	public Rectangulo(String color, Punto coordenadaDelCentro, String nombreDeLaForma, Double ladoMenor,
			Double ladoMayor) {
		super(color, coordenadaDelCentro, nombreDeLaForma);
		this.ladoMenor = ladoMenor;
		this.ladoMayor = ladoMayor;
	}
	
	public Double getLadoMenor() {
		return ladoMenor;
	}
	public void setLadoMenor(Double ladoMenor) {
		this.ladoMenor = ladoMenor;
	}
	public double getLadoMayor() {
		return ladoMayor;
	}
	public void setLadoMayor(Double ladoMayor) {
		this.ladoMayor = ladoMayor;
	}
	
	@Override
	public Double calcularArea() {
		return (this.ladoMayor * this.ladoMenor);
	}

	@Override
	public Double calcularPerimetro() {
		return (2 * this.ladoMenor + 2 * this.ladoMayor);
	}

	@Override
	public String imprimir() {
		return super.imprimir() + ", lado menor: "+ this.ladoMenor + ", lado mayor: " + this.ladoMayor;
	}
	
}


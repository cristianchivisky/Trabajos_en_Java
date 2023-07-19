package Ejercicio_8;

public class Elipse extends Forma {
	private Double radioMenor;
	private Double radioMayor;
	

	public Elipse(String color, Punto coordenadaDelCentro, String nombreDeLaForma, Double radioMenor,
			Double radioMayor) {
		super(color, coordenadaDelCentro, nombreDeLaForma);
		this.radioMenor = radioMenor;
		this.radioMayor = radioMayor;
	}

	public Double getRadioMenor() {
		return radioMenor;
	}

	public void setRadioMenor(Double radioMenor) {
		this.radioMenor = radioMenor;
	}

	public Double getRadioMayor() {
		return radioMayor;
	}

	public void setRadioMayor(Double radioMayor) {
		this.radioMayor = radioMayor;
	}

	@Override
	public Double calcularArea() {
		return Math.PI * (this.radioMayor * this.radioMenor);
	}

	@Override
	public String imprimir() {
		return super.imprimir() + ", radio menor: " + this.radioMenor + ", radio mayor: " + this.radioMayor;
	}

	@Override
	public Double calcularPerimetro() {
		return 2* Math.PI * ((Math.pow(this.radioMenor, 2) + Math.pow(this.radioMayor, 2))/2) ;
	}

	

}

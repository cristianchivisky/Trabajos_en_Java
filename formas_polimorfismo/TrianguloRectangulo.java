package formas_polimorfismo;

public class TrianguloRectangulo extends Forma{
	private Double cateto1;
	private Double cateto2;
	private Double hipotenusa;
	
	public TrianguloRectangulo(String color, Punto coordenadaDelCentro, String nombreDeLaForma, Double cateto1, Double cateto2,
			Double hipotenusa) {
		super(color, coordenadaDelCentro, nombreDeLaForma);
		this.cateto1 = cateto1;
		this.cateto2 = cateto2;
		this.hipotenusa = hipotenusa;
	}

	public Double getCateto1() {
		return cateto1;
	}

	public void setCateto1(Double cateto1) {
		this.cateto1 = cateto1;
	}

	public Double getCateto2() {
		return cateto2;
	}

	public void setCateto2(Double cateto2) {
		this.cateto2 = cateto2;
	}

	public Double getHipotenusa() {
		return hipotenusa;
	}

	public void setHipotenusa(Double hipotenusa) {
		this.hipotenusa = hipotenusa;
	}
	@Override
	public Double calcularArea() {
		return (this.cateto1 * this.cateto2)/2;
	}

	@Override
	public Double calcularPerimetro() {
		return (this.cateto1 + this.cateto2 + this.hipotenusa);
	}

	@Override
	public String imprimir() {
		return super.imprimir() + ", cateto1= " + this.cateto1 + ", cateto2= " + this.cateto2 + ", hipotenusa= " + this.hipotenusa;
	}
	
}


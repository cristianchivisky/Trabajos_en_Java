package formas_polimorfismo;

public class Punto {
	private Double x;
	private Double y;
	public Punto(Double x, Double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Double getX() {
		return x;
	}
	public void setX(Double x) {
		this.x = x;
	}
	public Double getY() {
		return y;
	}
	public void setY(Double y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Coordenada en x= " + x + ", coordenada en y= " + y;
	}

}

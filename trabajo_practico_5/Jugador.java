package trabajo_practico_5;

public class Jugador {
	private String nombre;
	private Integer puntos = 0;
	private Naipe naipe;
	public Jugador(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getPuntos() {
		return puntos;
	}
	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}
	public Naipe getNaipe() {
		return naipe;
	}
	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}
	@Override
	public String toString() {
		return "Jugador " + nombre ;
	}
	
	

}

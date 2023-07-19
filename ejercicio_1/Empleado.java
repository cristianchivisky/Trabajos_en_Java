package ejercicio_1;

public class Empleado {
	private Double sueldo;
	private String nombre;
	private Integer legajo;
	
	public Empleado(Double sueldo, String nombre, Integer legajo) {
		this.sueldo = sueldo;
		this.nombre = nombre;
		this.legajo = legajo;
	}
	public Double getSueldo() {
		return sueldo;
	}
	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getLegajo() {
		return legajo;
	}
	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

}

package trabajo_practico_5;

public enum Familia {
	ESPADA("espada", "E"),
	BASTO("basto", "B"),
	ORO("oro", "O"),
	COPA("copa", "C");
	
	private String nombre;
	private String letra;
	
	private Familia(String nombre, String letra) {
		this.nombre = nombre;
		this.letra = letra;
	}

}

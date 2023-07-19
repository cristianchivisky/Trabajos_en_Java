package tp_individual;

import java.util.HashSet;
import java.util.Set;

public class Continente {
	
	private String nombre;
	private Set<Pais> paises;
	
	public Continente(String nombre, Set<Pais> paises) {
		this.nombre = nombre;
		this.paises = new HashSet<Pais>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Set<Pais> getPaises() {
		return paises;
	}
	public void setPaises(Set<Pais> paises) {
		this.paises = paises;
	}
	public void agregarPises(Pais pais) {
		this.paises.add(pais);
	}
	@Override
	public String toString() {
		return this.nombre;
	}
	

}

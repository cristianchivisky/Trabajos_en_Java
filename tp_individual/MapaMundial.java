package tp_individual;

import java.util.HashSet;
import java.util.Set;

public class MapaMundial {
	private Set<Continente> continentes;
	
	public MapaMundial() {
		continentes = new HashSet<Continente>();
		inicializar();
	}

	public void inicializar() {
		Continente america = new Continente("America", null);
		Continente europa = new Continente("Europa", null);
		Continente asia = new Continente("Asia", null);
		Continente africa = new Continente("Africa", null);
		Continente oceania = new Continente("Oceania", null);
		Continente antartida = new Continente("Antartida", null);
		
		continentes.add(america);
		continentes.add(europa);
		continentes.add(asia);
		continentes.add(africa);
		continentes.add(oceania);
		continentes.add(antartida);

		Pais argentina = new Pais("Argentina", "Buenos Aires", null, america);
		Pais uruguay = new Pais("Uruguay", "Montevideo", null, america);
		Pais brasil = new Pais("Brasil", "Brasilia", null, america);
		Pais chile = new Pais("Chile", "Santiago de Chile", null, america);
		Pais paraguay = new Pais("Paraguay", "Asuncion", null, america);
		Pais bolivia = new Pais("Bolivia", "Sucre", null, america);
		Pais espania = new Pais("España", "Madrid", null, europa);
		Pais francia = new Pais("Francia", "Paris", null, europa);
		Pais italia = new Pais("Italia", "Roma", null, europa);
		Pais portugal = new Pais("portugal", "Lisboa", null, europa);
		
		america.agregarPises(argentina);
		america.agregarPises(uruguay);
		america.agregarPises(brasil);
		america.agregarPises(chile);
		america.agregarPises(paraguay);
		america.agregarPises(bolivia);
		europa.agregarPises(espania);
		europa.agregarPises(francia);
		europa.agregarPises(italia);
		europa.agregarPises(portugal);

		Provincia entrerios = new Provincia("Entre Rios", argentina);
		Provincia buenosaires = new Provincia("Buenos Aires", argentina);
		Provincia santafe = new Provincia("Santa Fe", argentina);
		Provincia corrientes = new Provincia("Corrientes", argentina);
		Provincia cordoba = new Provincia("Cordoba", argentina);
		Provincia salto = new Provincia("Salto", uruguay);
		Provincia paisandu = new Provincia("Paisandu", uruguay);
		Provincia canelones = new Provincia("Canelones", uruguay);
		Provincia rocha = new Provincia("Rocha", uruguay);
		Provincia maldonado = new Provincia("Maldonado", uruguay);
		
		argentina.agregarProvincia(entrerios);
		argentina.agregarProvincia(buenosaires);
		argentina.agregarProvincia(santafe);
		argentina.agregarProvincia(corrientes);
		argentina.agregarProvincia(cordoba);
		uruguay.agregarProvincia(salto);
		uruguay.agregarProvincia(paisandu);
		uruguay.agregarProvincia(canelones);
		uruguay.agregarProvincia(rocha);
		uruguay.agregarProvincia(maldonado);
		
		argentina.agregarLimitrofe(bolivia);
		argentina.agregarLimitrofe(paraguay);
		argentina.agregarLimitrofe(chile);
		argentina.agregarLimitrofe(brasil);
		argentina.agregarLimitrofe(uruguay);
		uruguay.agregarLimitrofe(brasil);
		uruguay.agregarLimitrofe(argentina);
		francia.agregarLimitrofe(espania);
		francia.agregarLimitrofe(italia);
		italia.agregarLimitrofe(francia);
		espania.agregarLimitrofe(francia);

	}
	public Set<Pais> getPaises (String nombreContinente) {
		for (Continente continente : continentes) {
			if (continente.getNombre().equalsIgnoreCase(nombreContinente)){
				return continente.getPaises();
			}
		}
		return null;
	}
	public Set<Provincia> getProvincias (String nombrePais) {
		for (Continente continente : continentes) {
			for(Pais pais : continente.getPaises()) {
				if (pais.getNombre().equalsIgnoreCase(nombrePais)){
					return pais.getProvincias();
				}
			}
		}
		return null;
	}
	public Set<Pais> getLimitrofes (String nombrePais) {
		for (Continente continente : continentes) {
			for(Pais pais : continente.getPaises()) {
				if (pais.getNombre().equalsIgnoreCase(nombrePais)){
					return pais.getLimitrofes();
				}
			}
		}
		return null;
	}

}

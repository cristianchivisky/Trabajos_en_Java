package trabajo_practico_5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Juego {
	private final Integer LIMITE =20;
	private Integer puntajeGanador;
	private Integer cantJugadores;
	private Set<Jugador>jugadores = new HashSet<Jugador>();
	private Mazo mazo;
	
	public Juego() {
		
	}

	public Juego(Integer puntajeGanador, Integer cantJugadores, Mazo mazo) {
		this.puntajeGanador = puntajeGanador;
		this.cantJugadores = cantJugadores;
		//this.jugadores = jugadores;
		this.mazo = mazo;
		mazo.barajar();
	}
	public Integer getPuntajeGanador() {
		return puntajeGanador;
	}

	public void setPuntajeGanador(Integer puntajeGanador) {
		this.puntajeGanador = puntajeGanador;
	}

	public Integer getCantJugadores() {
		return cantJugadores;
	}

	public void setCantJugadores(Integer cantJugadores) {
		this.cantJugadores = cantJugadores;
	}
	public void agregar(Jugador jugador) {
		jugadores.add(jugador);
	}
	public Set<Jugador> getJugadores(){
		return jugadores;
	}
	public void mezclar() {
		mazo.barajar();
	}
	public void elegirNaipes(Map<Jugador, Naipe> naipesJugadores) {
		Iterator<Jugador> i = jugadores.iterator();
		while (i.hasNext()) {
			Jugador jugador =i.next();
			Naipe naipe = naipesJugadores.get(jugador);
			jugador.setNaipe(naipe);
		}
	}
	public void elegirNuevosNaipes() {
		for(Jugador jugador : jugadores) {
			System.out.println("ingrese el NUMERO del nuevo naipe del jugaor " + jugador);
			Scanner li = new Scanner(System.in);
			Integer num = li.nextInt();
			System.out.println("familia (EN MAYUSCULA): ");
			Scanner in = new Scanner(System.in);
			String fam = in.nextLine();
			Familia family = Familia.valueOf(fam);
			jugador.setNaipe(new Naipe(num, family));
		}
	}
	public Naipe jugar() {
		if(mazo.cantidad() == LIMITE) {
			this.mazo = new Mazo();
			mazo.barajar();
		}
	
		Naipe naipe = mazo.getNaipeArriba();
		System.out.println(naipe);
		for (Jugador jugador : jugadores) {
			if (jugador.getNaipe().equals(naipe)) {
				jugador.setPuntos(jugador.getPuntos() + 1);
				System.out.println(jugador+" ACERTO");
				if(hayGanador() == Boolean.FALSE) {
					elegirNuevosNaipes();
				}
			}
		}
	return naipe;
	}
	
	public Boolean hayGanador() {
		for (Jugador jugador : jugadores) {
			if(this.puntajeGanador == jugador.getPuntos()) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}
	
	
	public List<Jugador> ganador() {
		List<Jugador> ganadores = new ArrayList<Jugador>();
		for (Jugador jugador : jugadores) {
			if (this.puntajeGanador == jugador.getPuntos()) {
				ganadores.add(jugador);
			}
		}
		return ganadores;
	}

	

}

package trabajo_practico_5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class PruebaJuego {
	public static void main(String[] args) {
		Mazo mazo = new Mazo();
				
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese la cant de jugadores: ");
		Integer cant_jug = sc.nextInt();
		
		System.out.println("ingrese la cant de puntos que se deben obtener para ganar: ");
		Integer cant_puntos = sc.nextInt();
		
		Juego juego= new Juego(cant_puntos, cant_jug, mazo);
		
		Map<Jugador, Naipe> mapa = new HashMap<>();
		
		for (int i=0; i<cant_jug; i++) {
			Scanner in = new Scanner(System.in);
			System.out.println("ingrese el nombre del jugador ");
			String jug = in.nextLine();
			Jugador jugador =new Jugador(jug);
			juego.agregar(jugador);
			
			System.out.println("ingrese el NUMERO del naipe que eligio el jugador: ");
			Integer num = in.nextInt();
			Scanner li = new Scanner(System.in);
			System.out.println("familia (EN MAYUSCULA): ");
			String fam = li.nextLine();
			Familia family = Familia.valueOf(fam);
			mapa.put(jugador, new Naipe(num, family));
		}
		juego.elegirNaipes(mapa);
		System.out.println(mapa);
		System.out.println(juego.getJugadores());
		
		
		while (juego.hayGanador() == Boolean.FALSE) {
			juego.jugar();
			
		
		}
				
		System.out.println("ganador/es: " + juego.ganador());

	}

}

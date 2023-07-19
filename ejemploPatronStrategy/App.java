package ejemploPatronStrategy;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Integer opcion=0;
		Estrategia arma= new Pistola();
		System.out.println(" 0-Salir, 1-Pistola, 2-Ametrealladora, 3-Bazooka ");
		do {
			System.out.println("¿Qué arma desea disparar? ");
			Scanner leer = new Scanner(System.in);
			opcion = leer.nextInt();
			if (opcion == 0) {
				break;
			}
			if (opcion == 1) {
				arma= new Pistola();
			}
			if (opcion == 2) {
				arma = new Ametralladora();
			}
			if (opcion == 3) {
				arma = new Bazooka();
			}
			Contexto contexto = new Contexto(arma);
			System.out.println(contexto.dispararArma());
			System.out.println();
		}while(opcion != 0);
	}
}

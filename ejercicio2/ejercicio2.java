package ejercicio2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String pregunta="";
		do {
			
			System.out.println("ingrese 3 numeros");
			int numero1 = in.nextInt();			
			int numero2 = in.nextInt();			
			int numero3 = in.nextInt();	
			if (numero1 > 0) {
				int resultado = (numero2 * numero3);
				System.out.println("el producto es: " + resultado);
			} else {
				int resultado = (numero2 + numero3);
				System.out.println("la suma es: " + resultado);
			}
			System.out.println("ingrese * si desea volver a ejecutar");
			pregunta = in.next();
		} while (pregunta.equals("*"));

	} 
}

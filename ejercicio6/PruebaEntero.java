package ejercicio6;

import java.util.Scanner;

public class PruebaEntero {

	public static void main(String[] args) {
		System.out.println("ingrese un numero positivo: ");
		Scanner in= new Scanner(System.in);
		int q=in.nextInt();
		Entero e = new Entero(q);
		System.out.println("El numero ingresado es: "+e.getNumero());
		System.out.println("El cuadrado de " + e.getNumero() + " es: " +
		e.cuadrado());
		System.out.print(e.parImpar());
		System.out.print("el factorial es: " + e.factorial());
		System.out.println(e.primo());
	}
}


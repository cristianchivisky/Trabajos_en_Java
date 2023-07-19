package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		
		System.out.println("ingrese la palabra: ");
		Scanner in= new Scanner(System.in);
		String palabra= in.nextLine();
		StringBuilder  palabra_invertida= new StringBuilder(palabra);
		palabra_invertida.reverse();
		if (palabra_invertida.toString().equals(palabra)) {
			System.out.println("la palabra es palindromo");
			}else {
				System.out.println("la palabra no es palindromo");
				
		}

	}

}


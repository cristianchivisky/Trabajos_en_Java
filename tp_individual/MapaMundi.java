package tp_individual;

import java.util.Scanner;
import java.util.Set;

public class MapaMundi {

	public static void main(String[] args) {
		MapaMundial mapaMundial = new MapaMundial();
		Scanner in = new Scanner(System.in);
		System.out.println("ingrese el nombre del continente para conocer sus paises");
		String continente = in.nextLine();
		System.out.println("paises de " + continente + " : ");
		mostrarPaises (mapaMundial.getPaises(continente));
		System.out.println("ingrese el nombre del pais para conocer sus provincias");
		String pais = in.nextLine();
		System.out.println("provincias de " + pais + " : ");
		mostrarProvincias (mapaMundial.getProvincias(pais));
		System.out.println("ingrese el nombre del pais para conocer sus limitrofes");
		String conocerLimitrofes = in.nextLine();
		System.out.println("limitrofes con " + conocerLimitrofes + " : ");
		mostrarLimitrofes (mapaMundial.getLimitrofes(conocerLimitrofes));
	}

	public static void mostrarLimitrofes(Set<Pais> conocerLimitrofes) {
		if(conocerLimitrofes != null) {
			for (Pais limitrofe : conocerLimitrofes) {
				System.out.println(limitrofe.toString());
			}
		}else {
			System.out.println("no hay datos para mostrar");
		}
		
	}

	public static void mostrarProvincias(Set<Provincia> provincias) {
		if(provincias != null) {
			for (Provincia provincia : provincias) {
				System.out.println(provincia.toString());
			}
		}else {
			System.out.println("no hay datos para mostrar");
		}
		
	}

	public static void mostrarPaises(Set<Pais> paises) {
		if(paises != null) {
			for (Pais pais : paises) {
				System.out.println(pais.toString());
			}
		}else {
			System.out.println("no hay datos para mostrar");
		}
		
	}

}

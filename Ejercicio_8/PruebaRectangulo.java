package Ejercicio_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PruebaRectangulo {

	public static void main(String[] args) {
		List<Forma> formas = new ArrayList<Forma>();
		
		Rectangulo rectang = new Rectangulo("verde", new Punto(3.0, 4.0), "Rectangulo", 3.2, 4.5);
		Elipse elipse = new Elipse("rojo", new Punto(0.0, 2.0), "Elipse", 1.6, 4.1);
		Cuadrado cuadrado = new Cuadrado("amarillo",  new Punto(5.0, 2.0), "Cuadrado", 4.0, 4.0);
		Circulo circulo = new Circulo("marron", new Punto(5.0, 0.0), " circulo", 7.3, 7.3);
		
		formas.add(rectang);
		formas.add(elipse);
		formas.add(cuadrado);
		formas.add(circulo); 
		
		System.out.println(rectang.calcularArea());
		System.out.println();
		System.out.println(rectang.calcularPerimetro());
		System.out.println();
		System.out.println(rectang.imprimir());
		rectang.moverLaForma(new Punto(5.0, 7.0));
		rectang.cambiarTamanio(2.0);
		System.out.println();
		System.out.println(rectang.calcularPerimetro());
		System.out.println();
		System.out.println(rectang.imprimir());
		System.out.println();
		
		Iterator<Forma> iterator = formas.iterator();
		while (iterator.hasNext()) {
			Forma f= iterator.next();
			f.setColor("azul");
			f.moverLaForma(new Punto(0.0, 0.0));
		}
		for (Forma f : formas) {
			System.out.println(f.imprimir());
			System.out.println(f.calcularArea());
		}
		
		}

}

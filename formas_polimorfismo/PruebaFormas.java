package formas_polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class PruebaFormas {

	public static void main(String[] args) {
		List<Forma> formas = new ArrayList<Forma>();
		
		Rectangulo rectangulo = new Rectangulo("verde", new Punto(3.0, 4.0), "Rectangulo", 3.2, 4.5);
		Elipse elipse = new Elipse("rojo", new Punto(0.0, 2.0), "Elipse", 1.6, 4.1);
		TrianguloRectangulo triangulo = new TrianguloRectangulo("amarillo", new Punto(5.0, 7.0), "Triangulo", 10.0, 6.0, 11.7);
		
		formas.add(rectangulo);
		formas.add(elipse);
		formas.add(triangulo); 
		
		for (Forma f : formas) {
			System.out.println(f.imprimir());
			System.out.println(f.calcularArea());
			System.out.println(f.calcularPerimetro());
			System.out.println();

		}
		
	}

}

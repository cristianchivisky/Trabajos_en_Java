package ejercicio4;

public class ejercicio4 {

	public static void main(String[] args) {
		int [] numeros = {4,2,3,8,1};
		int totalposiciones = numeros.length;
		System.out.println("cantidad de numeros que hay en el vector es : " + totalposiciones);
		int x=0;
		float t=0;
		for (int i=0; i<numeros.length; i++) {
			if (numeros[i]>x) {
				x=numeros[i];
			}
			t= t + numeros[i];
		}
		for (int i=0; i<numeros.length; i++) {
			for (int j=0; j<i-1; j++) {
				int temp;
				if(numeros[i]>numeros[j]) {					
					temp=numeros[j];
					numeros[j]=numeros[i];
					numeros[i]=temp;
				}
			}	
		}
		System.out.println("el mayor es: " + x);
		System.out.println("el promedio es: " + (t/numeros.length));
		System.out.println("vector de mayor a menor: ");
		for(int i=0; i<numeros.length; i++) {
			System.out.println( numeros[i]);
		}System.out.println("vector de menor a mayor: ");
		for(int j=numeros.length-1; j>=0; j--) {
			System.out.println(numeros[j]);
		}
	}	
}


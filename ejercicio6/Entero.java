package ejercicio6;

public class Entero {
	private int numero;
	//constructor de la clase Enteros
	public Entero(int numero) {
	super();
	this.numero = numero;
	}
	public int getNumero() {
	return numero;
	}
	public void setNumero(int numero) {
	this.numero = numero;
	}
	//calcula el cuadrado de n
	public long cuadrado(){
	return numero*numero;
	}
	public String parImpar() {
	if (numero % 2 ==0) {
		return "es par";
	}
	return "es impar";
	}
	public int factorial() {
		if (numero==0) {
			return 0;
		}
		else {
			int total=1;
			for (int i=2; i<=numero; i++) {
				total=total*i;
				}return total;
			}
	}
	public String primo() {
		String resultado="";
		for (int i=2; i<numero; i++) {
			if(numero % i ==0) {
				return resultado= "no es primo";}	
			else {
				return resultado= "es primo";
			}
		}
		return resultado;
		
	}
}
		
	



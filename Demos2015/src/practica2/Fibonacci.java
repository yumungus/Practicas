package practica2;
/*
 * Fibonacci.java
 * Calcula el termino n de la sucesión de Fibonacci. 
 * ajp - 2013.10.31
 */

public class Fibonacci {

	public static void main(String[] args) {
		
		int numero = 46;
		int terminoActual = numero;
		int terminoMenos1 = 1;
		int terminoMenos2 = 0;

		for (int i = 1; i < numero; i++) {
			terminoActual = terminoMenos1 + terminoMenos2;
			terminoMenos2 = terminoMenos1;
			terminoMenos1 = terminoActual;
		}
		
		System.out.println(terminoActual + ": Número de Fibonacci para n = " + numero);
	} 
}


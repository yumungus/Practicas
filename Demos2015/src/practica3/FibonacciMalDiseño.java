package practica3;

import java.util.Scanner;

/*
 * FibonacciMalDiseño.java
 * Utiliza una función para obtener cualquier término de la sucesión de Fibonacci. 
 * Mal diseño de responsabilidades.
 * ajp - 2015.10.31
 */

public class FibonacciMalDiseño {
	
	final static int LIMITE_INFERIOR = 0;
	
	final static int LIMITE_SUPERIOR = 161;
	
	public static void main(String[] args) {		
		
		System.out.println("Calcula el número de Fibonacci correspondiente al término(n).");
		System.out.print("Introduce n = ");
		
		int numero = new Scanner(System.in).nextInt();
		long termino = fibonacci(numero); 

		if (termino == -1) {
			System.out.println("Fuera de rango, sólo se admiten valores entre: " 
					+ LIMITE_INFERIOR +" y " + LIMITE_SUPERIOR);
		}
		else {
			System.out.println(termino 
					+ "\nEs el número de Fibonacci para n = " + numero);
		}
	}

	/**
	 * Calcula el término n de la sucesión de Fibonacci.
	 * @param n
	 * @return el término n
	 */
	private static long fibonacci(int n) {
		
		long terminoActual = n;
		long terminoMenos1 = 1;
		long terminoMenos2 = 0;
		
		if (n >= LIMITE_INFERIOR && n <= LIMITE_SUPERIOR) {
			for (int i = 1; i < n; i++) {
				terminoActual = terminoMenos1 + terminoMenos2;
				terminoMenos2 = terminoMenos1;
				terminoMenos1 = terminoActual;
			}
		}
		else {
			terminoActual = -1;		//chapuza
		}	
		return terminoActual;
	} 
}


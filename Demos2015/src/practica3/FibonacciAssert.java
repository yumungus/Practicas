package practica3;
/*
 * FibonacciAssert.java
 * Utiliza una función para obtener cualquier término de la sucesión de Fibonacci. 
 * Buen diseño de responsabilidades.
 * ajp - 2015.10.31
 */

import java.util.Scanner;

public class FibonacciAssert {
	
	final static int LIMITE_INFERIOR = 0;
	final static int LIMITE_SUPERIOR = 161;
	
	public static void main(String[] args) {		
		System.out.println("Calcula el número de Fibonacci correspondiente al término(n).");
		System.out.print("Introduce n = ");
		
		int numero = new Scanner(System.in).nextInt();

		if (numero >= LIMITE_INFERIOR && numero <= LIMITE_SUPERIOR) {
			System.out.println(fibonacci(numero) 
					+ "\nEs el número de Fibonacci para n = " + numero);
		}
		else {
			System.out.println("Fuera de rango, sólo se admiten valores entre: " 
					+ LIMITE_INFERIOR +" y " + LIMITE_SUPERIOR);
		}
	}

	/**
	 * Calcula el término n de la sucesión de Fibonacci.
	 * @param n
	 * @return el término n
	 */
	private static long fibonacci(int n) {
		
		assert n >= LIMITE_INFERIOR: "Número negativo";
		assert n <= LIMITE_SUPERIOR: "No calculable";
		
		long terminoActual = n;
		long terminoMenos1 = 1;
		long terminoMenos2 = 0;

		for (int i = 1; i < n; i++) {
			terminoActual = terminoMenos1 + terminoMenos2;
			terminoMenos2 = terminoMenos1;
			terminoMenos1 = terminoActual;
		}
		return terminoActual;
	} 
}


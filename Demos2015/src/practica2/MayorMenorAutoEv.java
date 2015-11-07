package practica2;

/*
 * MayorMenor.java
 * Programa que pide una serie de números naturales (enteros positivos sin el 0)
 * Una vez leidos al menos dos datos válidos, admite cero para terminar pidiendo confirmación.
 * Muestra el mayor y el menor de todos ellos. 
 * ajp - 2015.10.17
 */

import java.util.Scanner;

public class MayorMenorAutoEv {

	public static void main(String[] args) {

		// Variables.
		
		int valorEntrada;					// Auxiliar para entrada de datos.
		int mayor = 0;						// El mayor numero leido, inicializado con el menor valor admitido.
		int menor = Integer.MAX_VALUE; 		// El menor número leido, inicializado con el mayor valor posible. 
		int numValoresValidos = 0;			// Contador de números válidos leidos.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Teclea números entre 1 y " + Integer.MAX_VALUE);
		System.out.println("-Cero para terminar-\n");

		// Bucle de entrada de datos...
		do {
			
			valorEntrada = teclado.nextInt();			// Lee número de entrada.

			// Comprueba que es positivo.
			if (valorEntrada >= 0) {

				// Guarda el número si es el mayor de la serie.
				if (valorEntrada > mayor) {
					
					mayor = valorEntrada;
				}

				// Guarda el número si es el menor de la serie.
				if (valorEntrada < menor && valorEntrada > 0) {
					
					menor = valorEntrada;
				}	
				
				// Comprueba si se quiere terminar.
				if (valorEntrada == 0) {
					
					//condición para poder terminar; dos valores leídos al menos. 
					if (numValoresValidos >= 2) {
						
						System.out.print("\nPulsa T para confirmar que quieres terminar... ");
						
						if (!(new Scanner(System.in).nextLine().toUpperCase().equals("T"))){ 
							valorEntrada = 1;  			// Continúa la entrada de datos...
						}
					}
					
					else {
						
						System.out.println("\nERROR: Hacen falta dos números por lo menos...");
						System.out.println("Teclea números entre 1 y " + Integer.MAX_VALUE);
						valorEntrada = 1;     			// Para volver a pedir valorEntrada.
					}
				}
				
				else {
					
					numValoresValidos++;				// Incrementa contador de datos válidos.
				}
			}
			
			else {

				System.out.println("\nERROR: Teclea números entre 1 y " + Integer.MAX_VALUE);
				System.out.println("-Cero para terminar-");
				valorEntrada = 1;		      			// Para volver a pedir valorEntrada.
			}
			
		} while (valorEntrada > 0);           			// Termina si es 0...

		// Muestra resultados...
		System.out.println("\nMayor: " + mayor);
		System.out.println("Menor: " + menor);
		teclado.close();
	}

} //class
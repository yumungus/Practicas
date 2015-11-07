package practica2;
/**
 * Multiplo1.java
 * Programa que escribe en pantalla los múltiplos de 2 por debajo de un TOPE, 16.
 * ajp - 2014.10.14
 */	

import java.util.Scanner;

public class Multiplo1 	{
	public static void main(String argumentos[]) {

		// Declaración de variables
		Scanner teclado = new Scanner(System.in);
		final int TOPE = 16  ; 				// Constante, el máximo valor del múltiplo
		int mult  ;							// Almacena el múltiplo calculado
		int cont  ;							// Contador utilizado en el cálculo

		// Inicializa las variables
		mult = 0 ;
		cont = 0 ;

		System.out.println("\t Múltiplos de 2\n");
		while (mult < TOPE)					// Bucle de cálculo y visualización
		{
			mult = cont * 2;
			System.out.println("\t" + '#' + (cont+1) + '\t' + mult);
			++cont;
		}
		teclado.close();
	}
}
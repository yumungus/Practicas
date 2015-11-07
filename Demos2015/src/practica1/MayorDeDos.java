package practica1;

/**
 * MayorDeDos.java
 * Programa que pide dos números y muestra el mayor de los dos.
 * autor - 2015.10.9
 */

import java.util.Scanner; 		// Se utiliza la clase Scanner.

public class MayorDeDos {
	public static void main(String[] arg) {
	
		// Conecta un escaner con el teclado para la entrada.
		Scanner teclado = new Scanner(System.in);
		
		int num1 ;				// Variable numérica para la entrada de datos.
		int num2 ;				// Variable numérica para la entrada de datos.
		
		// Modo sencillo de leer un número.
		System.out.println("Escribe un número: ");
		num1 = teclado.nextInt();					// Lee y procesa un dato numérico.
		
		// Modo más elaborado; requiere conversión
		System.out.println("Escribe otro número: ");
		String textoEntrada = teclado.next();	    // Lee texto de entrada.
		num2 = Integer.parseInt(textoEntrada);		// Procesa como número el texto de entrada.
		
		// Evalúa las tres posibilidades para dos números de la manera más simple.
		if (num1 > num2)
			System.out.println("El mayor es: " + num1);

		if (num1 < num2)
			System.out.println("El mayor es: " + num2);

		if (num1 == num2)
			System.out.println("Los dos números son iguales");
		
		teclado.close();							// Opcional, se cierra automáticamente por JVM
	}

}  // Fin programa.
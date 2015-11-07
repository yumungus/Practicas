package practica2;

import java.util.Scanner;

/**
 * OperadorIf.java
 * Programa ejemplo operador if inline.
 * ajp - 2015.10.19
 */

public class OperadorIf {
	
	public static void main(String[] args) {	
		
		String mensaje;
		
		// Pide un número y dice si es par o impar
		Scanner teclado = new Scanner(System.in);

		System.out.print("Teclea un número: ");
		int num = teclado.nextInt();

		int resto = num % 2;			// resto de la división entera

		// utiliza un if in-line y el operador == de comparación
		mensaje = (resto == 0) ? " Es par": " Es impar";

	/* equivalente
		if (resto == 0)
			mensaje = " Es par";
		else
			mensaje = " Es impar";
	*/
		// muestra 
		System.out.println(num + mensaje); 
	}

}
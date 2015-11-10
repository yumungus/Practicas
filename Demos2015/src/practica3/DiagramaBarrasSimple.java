package practica3;

import java.util.Scanner;

/**
 * DiagramaBarras.java
 * Programa que muestra en pantalla un diagrama de barras horizontales.
 * Genera líneas de texto de un CARACTER_BASE que representan los valores numéricos
 * comprendido entre LIMITE_INFERIOR y LIMITE_SUPERIOR. 
 * No admite valores fuera del rango.
 * Termina con el primer valor fuera de rango.
 * ajp - 2015.11.09
 */	

public class DiagramaBarrasSimple 	{

	static final int LIMITE_SUPERIOR = 10;
	static final int LIMITE_INFERIOR = -10;
	static final char CARACTER_BASE = '*';

	public static void main(String[] args) {

		boolean fueraRango = false;
		System.out.print("Escribe números entre " + LIMITE_INFERIOR + " y " + LIMITE_SUPERIOR + "...");
		do {
			int dato = new Scanner(System.in).nextInt();
			String barra = "";								// La cadena de caracteres a generar.
			String parteNegativaBarra = "";								
			String partePositivaBarra = "";	

			// Sólo valores válidos.
			if (dato >= LIMITE_INFERIOR && dato <= LIMITE_SUPERIOR ) {

				// Barra positiva.
				if (dato >= 0) {
					barra = " ";
					for (int i = 0; i < -LIMITE_INFERIOR; i++) {
						parteNegativaBarra += ' ';
					}
					for (int i = 0; i < dato; i++) {
						partePositivaBarra += CARACTER_BASE;
					}
				}

				// Barra negativa.
				else { 
					for (int i = 0; i < -LIMITE_INFERIOR + dato; i++) {
						parteNegativaBarra += ' ';
					}
					for (int i = 0; i < -dato; i++) {
						parteNegativaBarra += CARACTER_BASE;
					}
					partePositivaBarra = " ";
				}

				// Compone la barra.
				barra += dato + "\t" + parteNegativaBarra + "|" + partePositivaBarra + "\n";
			}
			else {			
				barra = dato + " FUERA DE RANGO\n"; 		// Prepara mensaje de error.
				fueraRango = true;
			}
			System.out.print(barra);
		} 
		while (fueraRango == false);
		System.out.println("Fin programa...");
	}

} //class










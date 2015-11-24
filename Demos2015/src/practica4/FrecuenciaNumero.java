package practica4;

import java.util.Scanner;

/**
 * FrecuenciaNumero.java
 * Programa que muestra la frecuencia de un número en un vector
 * Utiliza el método frecuenciaNum()
 * ajp - 2015.11.19
 */

public class FrecuenciaNumero {
	public static void main(String[] args) {
		int[] datosPrueba = {7, 8, 9, 17, 7, 4};
		
		System.out.println("Frecuencia del 7: " 
		+ frecuenciaNum(7, datosPrueba));
	}

	static int frecuenciaNum(int num, int[] datos) {
		int resultado = 0;
		for (int valor: datos) {
			if (valor == num) {
				resultado++;
			}
		}
		return resultado;
	}
}

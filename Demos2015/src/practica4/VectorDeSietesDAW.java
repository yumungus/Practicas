package practica4;

import java.util.Scanner;

/**
 * VectorDeSietes.java
 * Programa ejemplo que muestra el uso de un vector
 * ajp - 2015.11.17
 */

public class VectorDeSietesDAW {
	public static void main(String[] args) {
		int[] datos = {7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
		for (int valor: datos) {
			System.out.println(valor);
		}
	
		int[] datos2;
		System.out.println("Tamaño: ");
		int tamaño = new Scanner(System.in).nextInt();
		datos2 = new int[tamaño];
		
		for (int i = 0; i < datos2.length; i++) {
			datos2[i] = i*5; 
		}
		for (int valor: datos2) {
			System.out.println(valor);
		}
	
	}
}

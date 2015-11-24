package practica4;

import java.util.Iterator;

/**
 * VectorDeSietes.java
 * Programa ejemplo que muestra el uso de un vector
 * ajp - 2015.11.17
 */

public class VectorDeSietesDAM {
	public static void main(String[] args) {	

		int[] datos1 = {7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
		System.out.println("Número de elementos en datos1: " + datos1.length); 
		for (int valor: datos1) {
			System.out.println("datos1: " +  valor); 
		}

		int[] datos2 = new int[10];
		for (int i = 0; i < datos2.length; i++) {
			datos2[i] = 8;
		}
		for (int valor: datos2) {
			System.out.println("datos2: " +  valor); 
		}
	}









}
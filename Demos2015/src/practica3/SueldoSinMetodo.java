package practica3;

import java.util.Scanner;

/**
 * SueldoSinMetodo.java
 * Programa ejemplo que calcula salarios.
 * ajp - 2015.11.3
 */

public class SueldoSinMetodo {
	public static void main(String[] args) {		
		String continuar;
		do {
			System.out.println("Calcula sueldo...");
			System.out.print("Teclea total de horas: ");
			int totalHoras = new Scanner(System.in).nextInt();
			int sueldo;
			
			// Cálculo
			if (totalHoras > 35) {
				sueldo = 35 * 15;
				sueldo += (totalHoras - 35) * 22;
			}
			else {
				sueldo = totalHoras * 15;
			}
			System.out.println(sueldo);
			
			System.out.println("¿Quieres continuar?");
			continuar = new Scanner(System.in).next();
		} 
		while (continuar.equalsIgnoreCase("S"));  
		System.out.println("Termino...");
	}

} // class
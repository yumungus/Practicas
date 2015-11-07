package practica3;

import java.util.Scanner;

/**
 * Sueldo.java
 * Programa ejemplo que calcula salarios.
 * ajp - 2015.11.3
 */

public class Sueldo {
	static final int PRECIO_HORA_EXTRA = 22;
	static final int PRECIO_HORA_NORMAL = 15;
	static final int LIMITE_HORAS_NORMALES = 35;

	public static void main(String[] args) {	
		
		String seguir;
		do {
			System.out.println("Calcula sueldo...");
			System.out.print("Teclea total de horas: ");
			int totalHoras = new Scanner(System.in).nextInt();
			int sueldo = calcularSueldo(totalHoras);
			System.out.println(sueldo);
			
			System.out.println("Pulsa S para seguir calculando... ");
			seguir = new Scanner(System.in).next();
		} 
		while (seguir.equalsIgnoreCase("S"));  
		System.out.println("Programa terminado...");
	}

	static int calcularSueldo(int totalHoras) {
		int resultado;
		
		if (totalHoras > LIMITE_HORAS_NORMALES) {
			resultado = LIMITE_HORAS_NORMALES * PRECIO_HORA_NORMAL;
			resultado += (totalHoras - LIMITE_HORAS_NORMALES) * PRECIO_HORA_EXTRA;
		}
		else {
			resultado = totalHoras * PRECIO_HORA_NORMAL;
		}	
		
		return resultado;
	}

} // class
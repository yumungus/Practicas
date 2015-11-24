package practica3;


import java.util.Scanner;

/**
 * SueldoVariosMétodos.java
 * Demostración de refactorización de un programa simple
 * organizandolo con varios métodos según un criterio funcional.
 * ajp - 2015.11.24
 */

public class SueldoVariosMetodos {
	static final int PRECIO_HORA_EXTRA = 22;
	static final int PRECIO_HORA_NORMAL = 15;
	static final int LIMITE_HORAS_NORMALES = 35;
	
	public static void main(String[] args) {		
		String continuar;
		do {
			System.out.println("Calcula sueldo...");
			System.out.print("Teclea total de horas: ");
			int horas = new Scanner(System.in).nextInt();
			int sueldo;
			
			// Cálculo	
			if (horas > LIMITE_HORAS_NORMALES) {
				sueldo = LIMITE_HORAS_NORMALES * PRECIO_HORA_NORMAL;
				sueldo += (horas - LIMITE_HORAS_NORMALES) * PRECIO_HORA_EXTRA;
			}
			else {
				sueldo = horas * PRECIO_HORA_NORMAL;
			}
			System.out.println(sueldo);
			
			System.out.println("¿Quieres continuar?");
			continuar = new Scanner(System.in).next();
		} 
		while (continuar.equalsIgnoreCase("S"));  
		System.out.println("Termino...");
	}

} // class
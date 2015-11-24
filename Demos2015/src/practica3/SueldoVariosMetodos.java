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
			
			int horas = obtenerDatos();
			int sueldo = calcularSueldo(horas);
			mostrarResultado(sueldo);
			
			
			// Dialogar continuar ***********************
			System.out.println("¿Quieres continuar?");
			continuar = new Scanner(System.in).next();
			//fin dialogar continuar ********************
		} 
		while (continuar.equalsIgnoreCase("S"));  
		
		
		// Mostrar mensaje final ***********************
		System.out.println("Termino...");
		//fin mostrar mensaje final ********************
	}

	/**
	 * Muestra resultado en la consola.
	 * @param totalSueldo
	 */
	static void mostrarResultado(int totalSueldo) {
		System.out.println(totalSueldo);
	}

	/**
	 * Calcula sueldo según los límites y precios establecidos.
	 * @param totalHoras
	 * @return sueldoResultante
	 */
	static int calcularSueldo(int totalHoras) {
		int sueldoResultante;
		if (totalHoras > LIMITE_HORAS_NORMALES) {
			sueldoResultante = LIMITE_HORAS_NORMALES * PRECIO_HORA_NORMAL;
			sueldoResultante += (totalHoras - LIMITE_HORAS_NORMALES) * PRECIO_HORA_EXTRA;
		}
		else {
			sueldoResultante = totalHoras * PRECIO_HORA_NORMAL;
		}
		return sueldoResultante;
	}
	
	/**
	 * Obtiene datos para el calcular el sueldo.
	 * @return totalHoras
	 */
	static int obtenerDatos() {
		
		System.out.println("Calcula sueldo...");
		System.out.print("Teclea total de horas: ");
		int totalHoras = new Scanner(System.in).nextInt();
		return totalHoras;
	}
} // class
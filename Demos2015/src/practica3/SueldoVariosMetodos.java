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
		do {		
			int horas = obtenerDatos();
			int sueldo = calcularSueldo(horas);
			mostrarResultado(sueldo);
		} 
		while (dialogarContinuar());  
		mostrarMensaje("Termino...");
	}

	/**
	 * Muestra un mensaje por consola.
	 * @param mensaje
	 */
	static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}

	/**
	 * Dialogo para continuar
	 * @return true, para continuar
	 */
	static boolean dialogarContinuar() {
		System.out.println("¿Quieres continuar?");
		String tecla = new Scanner(System.in).next();
		if (tecla.equalsIgnoreCase("S"))
			return true;
		return false;
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
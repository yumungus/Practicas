package practica2;
/**
 * Cuadrado.java
 * Programa que muestra en pantalla un cuadrado de tamaño variable de asteriscos.
 * ajp - 2015.10.29
 */	
public class CuadradoMejor 	{

	public static void main(String[] arg) {

		final int TAMAÑO_CUADRADO = 7;
		
		int longitudLinea = TAMAÑO_CUADRADO;
		String textoBase = "* ";
		String lineaBuffer = "";

		//Primera línea.	
		for (int i = 1; i <= longitudLinea; i++) {
			lineaBuffer += textoBase;
		}
		System.out.println(lineaBuffer);

		// Bloque central de líneas. 
		for (int j = 2; j < TAMAÑO_CUADRADO; j++) {
			
			//Línea con huecos.
			lineaBuffer = textoBase;
			for (int i = 2; i < longitudLinea; i++) {
				lineaBuffer += "  ";
			}
			lineaBuffer += textoBase;
			System.out.println(lineaBuffer);
		}

		//Última línea.	
		lineaBuffer = "";
		for (int i = 1; i <= longitudLinea; i++) {
			lineaBuffer += textoBase;
		}
		System.out.println(lineaBuffer);	
	}
	
} //class










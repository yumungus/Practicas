package practica3;
/**
 * Cuadrado.java
 * Programa que muestra en pantalla un cuadrado de tamaño variable de asteriscos.
 * ajp - 2015.10.29
 */	
public class CuadradoMetodos 	{

	public static void main(String[] arg) {

		final int TAMAÑO_CUADRADO = 7;
		
		int longitudLinea = TAMAÑO_CUADRADO;
		String textoBase = "* ";
		String lineaBuffer = "";
		String salidaConsola = "";

		//Primera línea.	
		lineaBuffer = generarBloqueCaracteres(longitudLinea, textoBase);
		salidaConsola += lineaBuffer + "\n";

		// Bloque central de líneas. 
		for (int j = 2; j < TAMAÑO_CUADRADO; j++) {	
			//Línea con huecos.
			lineaBuffer = textoBase;
			lineaBuffer += generarBloqueCaracteres(longitudLinea - 2, "  ");
			lineaBuffer += textoBase;
			salidaConsola += lineaBuffer + "\n";
		}

		//Última línea.	
		lineaBuffer = generarBloqueCaracteres(longitudLinea, textoBase);
		salidaConsola += lineaBuffer + "\n";
		
		System.out.println(salidaConsola);	
	}
	
	/**
	 * Genera un bloque de tamaño variable de caracteres iguales. 
	 * @param longitud, el tamaño del bloque.
	 * @param c, el carácter base.
	 * @return resultado, el bloque obtenido.
	 */
	static String generarBloqueCaracteres(int longitud, String textoBase) {
		String resultado = "";
		for (int i = 0; i < longitud; i++) {
			resultado += textoBase;
		}
		return resultado;
	}
	
} //class










package practica3;
/**
 * Cuadrado.java
 * Programa que muestra en pantalla un cuadrado de tamaño variable de asteriscos.
 * ajp - 2015.10.29
 */	
public class CuadradoMetodos 	{


	public static void main(String[] arg) {

		int tamañoCuadrado = 7;	
		System.out.println(generarCuadrado(tamañoCuadrado));	
	}

	/**
	 * Genera un cuadrado hueco de tamaño variable.
	 * @param tamañoCuadrado.
	 * @return resultado, el texto con el cuadrado formado.
	 */
	private static String generarCuadrado(int tamañoCuadrado) {
		int longitudLinea = tamañoCuadrado;
		String textoBase = "* ";
		String lineaBuffer = "";
		String resultado = "";

		//Primera línea.	
		lineaBuffer = generarBloqueCaracteres(longitudLinea, textoBase);
		resultado += lineaBuffer + "\n";

		// Bloque central de líneas. 
		for (int i = 2; i < tamañoCuadrado; i++) {	
			//Línea con huecos.
			lineaBuffer = textoBase;
			lineaBuffer += generarBloqueCaracteres(longitudLinea - 2, "  ");
			lineaBuffer += textoBase;
			resultado += lineaBuffer + "\n";
		}

		//Última línea.	
		lineaBuffer = generarBloqueCaracteres(longitudLinea, textoBase);
		resultado += lineaBuffer + "\n";

		return resultado;
	}

	/**
	 * Genera un bloque de tamaño variable de caracteres iguales. 
	 * @param longitud, el tamaño del bloque.
	 * @param textoBase.
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










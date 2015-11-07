package practica2;
/**
 * Cuadrado.java
 * Programa que muestra en pantalla un cuadrado variable de asteriscos
 * ajp - 2014.10.23
 */	
public class CuadradoPeor 	{

	public static void main(String argumentos[]) {

		final int NUM_LINEAS = 5; 			// Constante

		// Declaración de variables 

		int longitud = NUM_LINEAS;
		int contFilas = NUM_LINEAS;
		int increm = 0;
		String linea = "";

		//Muestra primera línea de asteriscos	
		for (int i = 1; i <= NUM_LINEAS; i++) {
			linea += "* ";
		}
		System.out.println(linea);


		// Muestra filas con blancos 
		for (contFilas = 2; contFilas < NUM_LINEAS; contFilas++)	
		{
			//Muestra línea asteriscos con huecos
			linea = "*";
			for (int i = 3; i < longitud * 2; i++) {
				linea += " ";
			}
			linea += "*";
			System.out.println(linea);
		}

		//Muestra última línea de asteriscos	
		linea = "";
		for (int i = 1; i <= NUM_LINEAS; i++) {
			linea += "* ";
		}
		System.out.println(linea);

		
		//while//////////////////////////////////////
		
		
		//Muestra primera línea de asteriscos	
		linea = "";
		int i1 = 1;
		while (i1 <= NUM_LINEAS) {
			linea += "* ";
			i1++;
		}
		System.out.println(linea);


		// Muestra filas con blancos 
		contFilas = 2;
		while (contFilas < NUM_LINEAS)	
		{
			//Muestra línea asteriscos con huecos
			linea = "*";
			int i3 = 3;
			while (i3 < longitud * 2) {
				linea += " ";
				i3++;
			}
			linea += "*";
			System.out.println(linea);
			contFilas++;
		}

		//Muestra última línea de asteriscos	
		linea = "";
		int i2 = 1;
		while (i2 <= NUM_LINEAS) {
			linea += "* ";
			i2++;
		}
		System.out.println(linea);

		
		//do-while//////////////////////////////////////
		
		
		//Muestra primera línea de asteriscos	
		linea = "";
		int i4 = 1;
		do {
			linea += "* ";
			i4++;
		} 
		while (i4 <= NUM_LINEAS);
		
		System.out.println(linea);


		// Maestra filas con blancos 
		contFilas = 2;
		do	
		{
			//Muestra línea asteriscos con huecos
			linea = "*";
			int i3 = 3;
			do {
				linea += " ";
				i3++;
			}
			while (i3 < longitud * 2);
			linea += "*";
			System.out.println(linea);
			contFilas++;
		}
		while (contFilas < NUM_LINEAS);

		//Muestra última línea de asteriscos	
		linea = "";
		int i5 = 1;
		do {
			linea += "* ";
			i5++;
		}
		while (i5 <= NUM_LINEAS);
		System.out.println(linea);

	}

	
} //class










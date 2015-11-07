package practica1;
import java.util.Scanner;

/**
 * Literal.java
 * Programa que comprueba los tipos de valores literales.
 * ajp - 2015.10.7
 */

public class Literal {
	public static void main(String[] args) {	
		double dato1 = -11.1;			
		float dato2 = (float) -11.1;
		String dato3 = "cañon";
		int dato4 = 0377;
		int dato5 = 9999;
		//  dato6 = 099;
		int  dato7 = 077;
		
		double dato8 = -88.28;

		double dato9 = .3e27;

		// dato10 = 23e2.3;

		String dato11 ="cañón";
		
		double dato12 = +521.6;

		double dato13 = 1.26;

		double dato14 = 5E-002;

		int dato15 = 0xFE;

		int dato16 = 0b101010;

		float dato17 = 1.26f;

		char dato18 = '\n';

		// dato19 = while;

		// dato20 = \xFE;

		int dato21 = 1234;

		double dato22 = .567;

		int dato23 = 0xFFFE;

		// dato24 = XGA;

		String dato25 = "a";

		// dato26 ='abc';

		double dato27 = 02.45;

		char dato28 = 'a';

		// dato29 = xF2E;

		byte dato30 = 0xf;

		// dato31 = abc;

		// dato32 = ab"c;

		// dato33 = "abc;

		// dato34 = "abc';

		// dato31 = a';

		String dato36 = "abc;";

		String dato37 = "abc'";

		// dato38 = "abc"";

		// dato39 = ""abc"";

		String dato40 = "true";

		// dato41 = True;

		boolean dato42 = false;

		char dato43 = '\\';

	
		
		System.out.println(dato8);
		
	
		//E/S en base numeración específica
		Scanner teclado = new Scanner(System.in);

		Integer  envoltorio1 = 0xFE;
		//salida en una base numeración específica 
		String textoSalida = Integer.toString(envoltorio1,16);
		System.out.println(textoSalida);
		
		
		//entrada en una base numeración específica 
		System.out.println("Escribe un número en base 16...");
		String textoEntrada = teclado.nextLine();
		dato1 = Integer.parseInt(textoEntrada, 16);
		System.out.println(dato1);

		
		
		
		System.out.println("Fin programa...");  
	}

}
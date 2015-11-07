package practica1;
/**
 * Integer.java
 * Programa para mostrar cambio de base con envoltorios.
 * ajp - 2015.09.20
 */

public class Envoltorios
{
	public static void main(String[] arg)
	{	
		String textoNumEnBinario = ""; 	// Salida por pantalla
		int num = 45546546;	
		
		textoNumEnBinario = Integer.toString(num, 2);
				
		System.out.println("El número " 
							+  num
							+ " en binario es: " 
							+ textoNumEnBinario);
	
		
		
		
		
		int num1 = 5;
		int num2 = 3;
		
		System.out.println(num1 + "+" + num2);
			
	}
}	










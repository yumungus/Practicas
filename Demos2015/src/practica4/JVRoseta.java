package practica4;

public class JVRoseta {


	// En este array  0 indica celda con célula muerta y 1 viva
	static char[][] mundo = { 
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
		{ 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
		{ 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0 }, //
		{ 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, //
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 
		{ 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0 }, // 
		{ 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0 }, //
		{ 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0 }, // proporcionados:
		{ 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 1x Planeador
		{ 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 1x Flip-Flop
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }  // 1x Still Life
	};

	final static int TAMAÑO = 12;
	final static int CICLOS = 120;

	public static void main(String[] args)
	{
		int gen = 0; 		//Generaciones

		do {
			System.out.println("\nGeneración: " + gen);
			mostrarMundo();
			mundo = actualizarMundo();
			gen++;
		}
		while (gen <= CICLOS);
	}

	static void mostrarMundo() {

		for (int i = 0; i < TAMAÑO; i++) {
			for (int j = 0; j < TAMAÑO; j++) {

				System.out.print((mundo[i][j] == 1) ? "|o" : "| ");
			}
			System.out.println("|");
		}
	}

	static char[][] actualizarMundo()  {     					
		
		char[][] nuevaRealidad = new char[TAMAÑO][TAMAÑO];
		
		for (int i = 0; i < TAMAÑO; i++) {
			
			for (int j = 0; j <= 11; j++) {
				
				int vecinas = 0;					//células adyacentes

				// las celdas situadas fuera del mundo, con índices fuera de rango, darán
				// ArrayIndexOutOfBoundsException y son equivalentes a células vacías a efectos de 
				// vecindad.
				try {
					vecinas += mundo[i-1][j];		//celda N			NO | N | NE
					vecinas += mundo[i-1][j+1];		//celda NE			----------- 
					vecinas += mundo[i][j+1];		//celda E			 O |   | E
					vecinas += mundo[i+1][j+1];		//celda SE          -----------
					vecinas += mundo[i+1][j]; 		//celda S           SO | S | SE
					vecinas += mundo[i+1][j-1]; 	//celda SO 
					vecinas += mundo[i][j-1];		//celda O           			                                     	
					vecinas += mundo[i-1][j-1]; 	//celda NO
					
					
				} 
				catch (java.lang.ArrayIndexOutOfBoundsException e) { } 

				if (vecinas < 2) 
					nuevaRealidad[i][j] = 0; 				// subpoblación, muere

				if (vecinas > 3) 
					nuevaRealidad[i][j] = 0; 				// sobrepoblación, muere

				if (vecinas == 3) 
					nuevaRealidad[i][j] = 1; 				// pasa a estar viva o se mantiene

				if (vecinas == 2 && mundo[i][j] == 1) 						
					nuevaRealidad[i][j] = 1; 				// se mantiene viva
			}
		}
		return nuevaRealidad;
	}
}


/*
 * ¿Cuántos epigrafes? --> 3 (Filas)
 * ¿Cómo se llama el 1º epígrafe? ---> Mat. de Oficina
 * ¿Cómo se llama el 2º epígrafe? ---> Transporte
 * ¿Cómo se llama el 3º epígrafe? ---> Sueldos
 * ¿Cúantos periódos? ---> 4 (columnas)
 * ¿Cuál es el 1º periodo? ---> Primavera 
 * ¿Cuál es el 2º periodo? ---> Verano
 * ¿Cuál es el 3º periodo? ---> Otoño
 * ¿Cuál es el 4º periodo? ---> Invierno
 * 
 * Para Primavera ---> gastos en material, transporte y sueldo
 * Para Verano --->  gastos en material, transporte y sueldo
 * Para Otoño --->  gastos en material, transporte y sueldo
 * Para Invierno --->  gastos en material, transporte y sueldo
 * 
 * Total gastado.
 * 
 * Supuesta salida:
 * 
 *                   Primavera      Verano         Otoño          Invierno       
 * Mat. de Oficina           X           X             X                 X
 * ...
 */

import java.util.Scanner;

public class DatosContables {

	public static void main(String[] args) {

		// Creamos las variables.
		int numEpi, numPer, i, k;
		float total;
		String[] nomEpi, nomPer;
		float[][] gastos;
		Scanner kb = new Scanner(System.in);
		total = 0.0f;
		final int ANCHO=15;
		
		// Comienza el algoritmo.
		
		//Pedimos cantidad de epígrafes y guardamos nombres.
		System.out.println("¿Cuántos epígrafes va a introducir? ");
		numEpi = kb.nextInt();
		kb.nextLine();
		nomEpi = new String[numEpi];
		for (i = 0; i < numEpi; i++) {
			System.out.println("¿Cómo se llama el " + (i + 1) + "º epígrafe? ");
			nomEpi[i] = kb.nextLine();
		}
		
		//Pedimos cantidad de periodos y guardamos nombres.
		System.out.println("¿Cuántos periodos va a introducir? ");
		numPer = kb.nextInt();
		kb.nextLine();
		nomPer = new String[numPer];
		for (i = 0; i < numPer; i++) {
			System.out.println("¿Cómo se llama el " + (i + 1) + "º periodo? ");
			nomPer[i] = kb.nextLine();
		}
		
		
		/*
		 * Con las cantidades de Epigrafes y Periodos creamos la tabla bidimensional gastos y le asignamos valores,
		 * Tambien vamos guardando todos esos valores en una variable externa.
		 */
		gastos = new float[numEpi][numPer];
		
		for(k=0;k<numPer;k++){
			for(i=0;i<numEpi;i++){
				gastos[i][k] = kb.nextFloat();
				total = total+gastos[i][k];
			}
		}
		
		//Pasamos a mostrar los datos recogidos en forma de tabla (con formato) y dar el valor total.
		
		System.out.printf("%"+ANCHO+"s","");
		for(i=0;i<numPer;i++){
			System.out.printf("%"+ANCHO+"s |",nomPer[i]);
		}
		
		System.out.println();
		
		for(i=0;i<numEpi;i++){
			System.out.printf("%"+ANCHO+"s",nomEpi[i]);
			for(k=0;k<numPer;k++){
				System.out.printf("%"+ANCHO+".2f |",gastos[i][k]);
				
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("El total en gastos es de "+total+" €.");
		kb.close();

	}

}

package pruebas;

import java.util.Scanner;
import deClase.CajaSecreta;


public class PruebaCajaSecreta {
	public static void main(String[] args){
		CajaSecreta p = new CajaSecreta();
		Scanner kb = new Scanner(System.in);
		int numInsertado;
		int numErrores = 0;
		boolean numCorrecto = false;
		
		
		do {
			System.out.println("Inserte un número entre 1 y 10 para abrir la caja: ");
			numInsertado=kb.nextInt();
			p.abrir(numInsertado);
		
			try{
				p.getX();
				numCorrecto = true;
			} catch(RuntimeException e) {
				System.out.println("Ese número no es el correcto.");
				System.out.println();
			}
			numErrores++;
		} while (numErrores < 3 && !numCorrecto);
		
		if (numCorrecto){
			System.out.println("Número Correcto, la caja se ha abierto.");
		}
		else{
			System.out.println("No ha dado con el número correcto, la caja permanecerá cerrada.");	
		}
				
		
	}
}

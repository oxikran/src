package sumadenumeros;

import java.util.Scanner;

public class sumamenores21 {

	public static void main(String[] args) {
		double numero, total;
		int i;
		
		final int CUANTOS_NUMEROS=4;
		final int TOPE=20;
		Scanner nj = new Scanner(System.in);
		
		
		System.out.println("introduzca "+CUANTOS_NUMEROS+" numeros.....");
		total=0.0;
		for(i=1;i<=CUANTOS_NUMEROS;i++){
			System.out.println(i+". ");
			numero=nj.nextDouble();
			if(numero<=TOPE){
				total=total+numero;
			}
		}
		System.out.println("El total (solo de los menores que "+TOPE+") es: ");
		System.out.println(total);
	}
	}




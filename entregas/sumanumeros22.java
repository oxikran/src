package sumadenumeros;

import java.util.Scanner;

public class sumanumeros22 {

	public static void main(String[] args) {
		double total;
		int i;
		double[] numeros;
		
		final int cuantosNumeros;
		final int tope;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cuantos numeros desea introducir: ");
		cuantosNumeros=entrada.nextInt();
		
		numeros=new double [cuantosNumeros];
		
		System.out.println("introduzca "+cuantosNumeros+" numeros.....");
		total=0.0;
		for(i=0;i<cuantosNumeros;i++){
			System.out.println((i+1)+". ");
			numeros[i]=entrada.nextDouble();
			
			}

		System.out.println("Cual es el tope para ser acumulado: ");
		tope=entrada.nextInt();
		
		total=0.0;
		for(i=0;i<cuantosNumeros;i++){
			if(numeros[i]<=tope){
				total=total+numeros[i];
			}
		}
		System.out.println("El total (solo de los menores que "+tope+") es: ");
		System.out.println(total);
	}
	}
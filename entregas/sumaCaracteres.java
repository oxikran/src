package sumaDeNumeros;

import java.util.Scanner;

public class sumaCaracteres {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		String[] nombre;
		int i,caracteres;
		final int CUANTOS_NOMBRES=5;
		nombre=new String[CUANTOS_NOMBRES];
		
		System.out.println("Introduzca los nombres: ");
		for(i=0;i<CUANTOS_NOMBRES;i++){
			System.out.print((i+1)+". ");
			nombre[i]=entrada.nextLine();		
		}
		
		System.out.println("Numero de caracteres maximos del nombre");
		caracteres=entrada.nextInt();
		System.out.println("Nombres con menos de "+caracteres+" caracteres: ");
		for(i=0;i<CUANTOS_NOMBRES;i++){
			if(nombre[i].length()<caracteres)
				System.out.println(nombre[i]);		
		}
	}
}

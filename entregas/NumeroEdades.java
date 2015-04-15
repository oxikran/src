import java.util.Scanner;

public class NumeroEdades {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int edad, n, numPersonas;
		String nombre, asteriscos;
		System.out.println("¿Cuantos valores va a introducir?");
		n = entrada.nextInt();
		entrada.nextLine();
		int[] listaEdad = new int[n];
		String[] listaNombre = new String[n];
		for (int i = 0; i < n; i++){		
			System.out.println("Introduce el nombre de la persona numero " + (i+1));
			nombre = entrada.nextLine();
			System.out.println("Introduce la edad (entre 0 y 17) de la persona numero " + (i+1));
			edad = entrada.nextInt();
			entrada.nextLine();
			listaNombre[i] = nombre;
			listaEdad[i] = edad;
		}
		for (int j = 0; j <= 17; j++){
			asteriscos = "";
			numPersonas = 0;
			for (int z = 0; z < n; z++)
				if (listaEdad[z] == j)
					numPersonas++;
			for (int y = 1; y <= numPersonas; y++)
				asteriscos = asteriscos + "*";
			System.out.println(j + "----- " + numPersonas + " persona/s " + asteriscos);
		}
	}
}

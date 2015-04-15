package practicas.pro;

import java.util.Scanner;

public class Oct3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Numero de uno a diez
		Scanner escaner = new Scanner(System.in);

		int numero = 0;

		System.out
				.print("Mostrar la tabla de multiplicación del numero: [1-10] ");
		numero = escaner.nextInt();
		if (!(numero < 1 || numero > 10)) {
			escaner.close();

			for (int i = 1; i <= 10; i++) {

				System.out
						.printf("%2d x%2d = %-2d %n", i, numero, (i * numero));

			}
		} else {
			System.out.println(numero + " no es un numero valido.");
			main(args);
		}

	}

}

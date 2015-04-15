package errores.pro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ene13 {

	public static void main(String[] args) {
		// Juego, averiguar un numero. Generar numero aleatorio 1-10, pedir por
		// entrada estandar numeros
		// al usuario, cada vez que el usuario introduzca un numero le dira si
		// el numero aleatorio
		// es mayor o menor, 3 intentos para acertar. Si no lo consigue le dira
		// el numero aleatorio.
		// Se le tolerara un solo error al introducir un numero al usuario,
		// avisar del error al usuario.
		// A partir del 2º error se le contara como intento fallido.

		int INTENTOS = 4;
		Scanner entrada = new Scanner(System.in);

		int numAleatorio, numero;
		boolean haFallado = false, juegoFinalizado = false;

		numAleatorio = (int) (Math.random() * 10) + 1;

		do {
			try {
				System.out.println("Le queda/n " + INTENTOS + " intento/s");
				System.out.print("Introduzca un numero entero entre 1 y 10: ");
				numero = entrada.nextInt();
				if (numAleatorio == numero) {
					juegoFinalizado = true;
					System.out.println("Correcto, ha ganado.");
					INTENTOS--;
					System.out.println(INTENTOS + " intento/s sobrantes.");
				} else {
					INTENTOS--;
					if (INTENTOS == 0) {
						juegoFinalizado = true;
						System.out.println("Incorrecto, no le quedan intentos restantes, ha perdido.");
						System.out.println("El numero secreto era " + numAleatorio);
					} else {
						if (numero < numAleatorio) {
							System.out.println("Incorrecto, el numero secreto es mayor al introducido.");
						} else {
							System.out.println("Incorrecto, el numero secreto es menor al introducido.");
						}
					}
				}
			} catch (InputMismatchException e) {
				entrada.nextLine();
				if (haFallado) {
					INTENTOS--;
					if (INTENTOS == 0) {
						juegoFinalizado = true;
						System.out.println("Eso no es un numero valido, ya no le quedan más intentos, ha perdido.");
						System.out.println("El numero secreto era " + numAleatorio);
					} else {
						System.out.println("Eso no es un numero valido.");
					}
				} else {
					haFallado = true;
					System.out.println("Eso no es un numero valido, la proxima vez contará como intento fallido.");
				}
			}
		} while (!juegoFinalizado);

		entrada.close();
	}
}

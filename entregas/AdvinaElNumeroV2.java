import java.util.*;

public class AdvinaElNumeroV2 {
	static boolean haFallado = false;
	static int numeroInvalido = 999;

	public static void main(String[] args) {

		int numUsuario, numRandom;
		int nIntentos = 3;
		Random random = new Random();
		numRandom = random.nextInt(9) + 1;
		System.out.println("Empieza el juego. Adivina el número");
		do {
			// PRIMER INTENTO
			if (nIntentos == 3) {

				numUsuario = LeerNumero();
				if (numUsuario == numRandom) {
					System.out.println("¡Tu ganas!");
					nIntentos = 0;
				}
				if (numUsuario == numeroInvalido) {
					System.out.println("Introduzca un valor valido.");
					nIntentos--;
				}else if (numUsuario < numRandom) {
					System.out.println("El número generado es mayor");
					nIntentos--;
				} else if (numUsuario > numRandom) {
					System.out.println("El número generado es menor");
					nIntentos--;
				}
			}
			// SEGUNDO INTENTO
			if (nIntentos == 2) {
				System.out.println("Segundo intento");
				numUsuario = LeerNumero();
				if (numUsuario == numRandom) {
					System.out.println("¡Tu ganas!");
					nIntentos = 0;
				}
				if (numUsuario == numeroInvalido) {
					System.out.println("Introduzca un valor valido.");
					nIntentos--;
				} else if (numUsuario < numRandom) {
					System.out.println("El número generado es mayor");
					nIntentos--;
				} else if (numUsuario > numRandom) {
					System.out.println("El número generado es menor");
					nIntentos--;
				}
			}

			// TERCER INTENTO
			if (nIntentos == 1) {
				System.out.println("Tercer intento");
				numUsuario = LeerNumero();
				if (numUsuario == numRandom) {
					System.out.println("¡Tu ganas!");
					nIntentos = 0;
				}
					if (numUsuario == numeroInvalido) {
						System.out.println("Lo siento, vuelve a intentarlo.");
						nIntentos--;
					} else if (numUsuario < numRandom) {
						System.out.println("El número generado es mayor");
						System.out.println("Lo siento, vuelve a intentarlo.");
						nIntentos--;
					} else if (numUsuario > numRandom) {
						System.out.println("El número generado es menor");
						System.out.println("Lo siento, vuelve a intentarlo.");
						nIntentos--;
					}
				}
			
		} while (nIntentos == 3 | nIntentos == 2 | nIntentos == 1);

		System.out.println("El número generado fue el " + numRandom);
	}
// Lectura del número introducido por el usuario
	private static int LeerNumero() {
		Scanner leer = new Scanner(System.in);
		int devolvernum = 0;
		if (haFallado == false) {
			try {
				devolvernum = leer.nextInt();
			} catch (RuntimeException e) {
				System.out.println("Introduzca un valor valido.");
				System.out
						.println("Este es su primer error y no contabilizara");
				haFallado = true;
				System.out
						.println("¡El juego sigue! Escriba un valor correcto nuevamente");
				leer.next();
				devolvernum = LeerNumero();
			}
		} else {
			try {
				devolvernum = leer.nextInt();
			} catch (RuntimeException e) {
				devolvernum = numeroInvalido;
				leer.next();
			}
		}
		return devolvernum;

	}
}

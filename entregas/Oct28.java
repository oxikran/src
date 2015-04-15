package arrays.pro;

import java.util.Scanner;

public class Oct28 {

	public static void main(String[] args) {
		// 1º: Leer una frase (manejar como tabla) informar de cuantas vocales
		// hay en la frase, acentuadas o no.

		Scanner entrada = new Scanner(System.in);
		final char[] VOCALES = "áàäâaéèëêeíìïîióòöôoúùüûu".toCharArray();
		String frase;
		char[] letras;
		int i, x, vocales;
		boolean esVocal;

		System.out.print("Escriba una frase: ");
		frase = entrada.nextLine();
		entrada.close();
		frase = frase.toLowerCase();
		letras = frase.toCharArray();

		esVocal = false;
		vocales = 0;
		for (i = 0; i < letras.length; i++) {
			x = 0;
			while (x < VOCALES.length && !esVocal) {
				if (letras[i] == VOCALES[x]) {
					vocales++;
					esVocal = true;
				}
				x++;
			}
			esVocal = false;
		}
		System.out.println("Hay " + vocales + " vocales en la frase.");
	}
}

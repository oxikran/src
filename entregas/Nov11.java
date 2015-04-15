package arrays.pro;

import java.util.Scanner;

public class Nov11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int i, j;
		char[][] caracteres = new char[8][8];
		for (i = 0; i < 8; i++) {
			for (j = 0; j < 8; j++) {
				caracteres[i][j] = " ".charAt(0);
			}
		}
		String temp;
		int fila = 0;
		int columna = 0;
		char caracterFicha = " ".charAt(0);
		String ficha;
		ficha = entrada.nextLine();
		while (!ficha.equalsIgnoreCase("fin")) {
			temp = ficha.substring(0, 2);
			if (temp.charAt(1) == "b".charAt(0)) {
				caracterFicha = Character.toLowerCase(temp.charAt(0));
			} else {
				caracterFicha = Character.toUpperCase(temp.charAt(0));
			}
			fila = Integer.parseInt(ficha.substring(2, 3));

			temp = ficha.substring(3);
			switch (temp) {
			case "td":
				columna = 1;
				break;
			case "cd":
				columna = 2;
				break;
			case "ad":
				columna = 3;
				break;
			case "d":
				columna = 4;
				break;
			case "r":
				columna = 5;
				break;
			case "ar":
				columna = 6;
				break;
			case "cr":
				columna = 7;
				break;
			case "tr":
				columna = 8;
			}
			caracteres[fila - 1][columna - 1] = caracterFicha;
			ficha = entrada.nextLine();
		}
		entrada.close();

		System.out.println("---------------------------------");
		for (i = caracteres.length-1; i >= 0; i--) {
			System.out.print("| ");
			for (j = 0; j < caracteres[0].length; j++) {
				System.out.print(caracteres[i][j] + " | ");
			}
			System.out.println("\n---------------------------------");
		}
	}
}

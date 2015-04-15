package Clase;
import java.util.Scanner;

public class CobroServicioCentimos {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int cost=0;
		System.out.println("Introduzca su edad, por favor:");
		int age = kb.nextInt();
		System.out.println("Introduzca el número de minutos que ha usado el servicio prestado, por favor:");
		int time = kb.nextInt();
		if (age >= 0 && time >0) {
			if (age < 18) {
				cost = 45 * time;
			}
			else if (age < 65) {
				cost = 55 * time;
			}
			else {
				cost = 30 * time;
			}
			System.out.println("El precio a pagar asciende a un total de "
					+ cost + " céntimos.");
		}
		else
			System.err.println("Introduzca valores válidos, por favor.");
	}
}

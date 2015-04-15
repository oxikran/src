import java.util.Scanner;

public class secuenciamultiplicativa {
	public static void main(String[] args) {
		int min,max,aux,total;
		Scanner ro = new Scanner (System.in);
		System.out.println ("Introduzca el primer número");
		min = ro.nextInt();
		System.out.println ("Introduzca el segundo número");
		max = ro.nextInt();
		if (max < min) {
			aux = max;
			max = min;
			min = aux;
		}
		int total_ant;
		int total_pos;
		total = 1;
		int i = min;
		do {
			total_ant = total;
			total = total * i;
			total_pos = total / i;
			i = i +1;
		} while (i<=max && total_ant == total_pos);
		if (total_ant != total_pos) {
			System.err.println("No hay solución");
		}
		else {
			System.out.println("Total "+ total);
		}
	}

}
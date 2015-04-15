package Clase;
import java.util.Scanner;

public class CobroServicioEuros {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double cost=0;
		int centcost=0;
		int eurcost=0;
		System.out.println("Introduzca su edad, por favor:");
		int age = kb.nextInt();
		System.out.println("Introduzca el número de minutos que ha usado el servicio prestado, por favor:");
		int time = kb.nextInt();
		if (age >= 0 && time >0) {
			if (age < 18) {
				eurcost = 45 * time/100;
				cost = 0.45 * time;
				centcost=(int) ((cost-eurcost)*100);
			}
			if (age >= 18 && age < 65) {
				eurcost = 55 * time/100;
				cost = 0.55 * time;
				centcost=(int) ((cost-eurcost)*100);
			}
			if (age >= 65) {
				eurcost = 30 * time/100;
				cost = 0.30 * time;
				centcost=(int) ((cost-eurcost)*100);
			}
			if (eurcost>0 && centcost>0)
				System.out.println("El precio a pagar asciende a un total de "
					+ eurcost +" € y "+centcost+ " céntimos.");
			else if(eurcost>0 && centcost==0)
				System.out.println("El precio a pagar asciende a un total de "
						+ eurcost +" €.");
			else if(eurcost==0 && centcost<0)
				System.out.println("El precio a pagar asciende a un total de "
						+ centcost +" céntimos.");
		}
		else
			System.err.println("Introduzca valores válidos, por favor.");
	}
}

import java.util.Scanner;


public class Cobro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int edad, minutos;
		System.out.println("Introduzca su edad");
		edad=entrada.nextInt();

		if(edad==18){
			System.out.println("Minutos trabajados");
			minutos=entrada.nextInt();
			System.out.println("Su salario es de: "+ (45*minutos +" céntimos"));
			}
		else{
			if (edad==65)
				System.out.println("Minutos trabajados");
				minutos=entrada.nextInt();
				System.out.println("Su salario es de: "+ (55*minutos +" céntimos"));
			else{
				System.out.println("Minutos trabajados");
				minutos=entrada.nextInt();
				System.out.println("Su salario es de: "+ (30*minutos +" céntimos"));
			}
			;
		}
		;
	}
	;
}
		
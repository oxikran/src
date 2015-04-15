import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int base, altura, opcion;
		float area;
	
		System.out.println("Elige un área:\n1. Triángulo\n2. Cuadrado");
		opcion = entrada.nextInt();
		if (opcion == 1){
			System.out.print("Dame su base: ");
			base = entrada.nextInt();
			System.out.print("Ahora dame su altura: ");
			altura = entrada.nextInt();
			area = (base * altura) / 2f;
			System.out.println("El área del triángulo es: " + area);
		}
		else if (opcion == 2){
			System.out.print("Dame su base: ");
			base = entrada.nextInt();
			System.out.print("Ahora dame su altura: ");
			altura = entrada.nextInt();
			area = base * altura;
			System.out.println("El área del cuadrado es: " + area);
		}
		else{
			System.out.println(opcion + " no es una opción válida");
		}
		
			
	}
	
}
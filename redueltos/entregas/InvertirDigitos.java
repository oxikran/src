import java.util.Scanner;


public class InvertirDigitos {

	public static void main(String[] args) {
		
		String invertido;
		invertido = "";
		long resto, numero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un número entero positivo: ");
		numero = entrada.nextLong();
		
		if (numero >= 0) {
			while(numero != 0){
				resto = numero % 10;
				invertido = invertido + resto;
				numero = numero / 10;
			}
			System.out.println("El número invertido es: " + invertido);
		}
		else
			System.err.println("El número no es correcto");
		
		entrada.close();
	}

}

import java.util.Scanner;
public class DNI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int DNI, resto;
		String letraDNI;
		letraDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
		
		System.out.print("Introduce tu DNI sin letra: ");
		DNI = entrada.nextInt();
		resto = DNI%23;
		System.out.println("La letra de su DNI es: "+letraDNI.charAt(resto));
	}
}
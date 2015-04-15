import java.util.Scanner;

public class PasarDecimalABinario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int decimal, resto;
		String binario= "";
		System.out.println("Introduce un numero decimal para pasarlo a binario: ");
		decimal = entrada.nextInt();
		while (decimal > 1) {
			resto = decimal % 2;
			binario = resto + binario;
			decimal = decimal / 2;
		}
		binario = decimal + binario;
		for (int i=1; i<4; i++) {
			if (binario.length()<4)
				binario = "0" + binario;
		}
		System.out.println("El numero en binario es: " + binario);
	}
}
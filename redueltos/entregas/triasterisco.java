import java.util.Scanner;


public class triasterisco {
	public static void main (String[] args) {
		int a;
		Scanner m = new Scanner (System.in);
		System.out.println ("Introdusca la altura para el triángulo");
		a = m.nextInt();
		System.out.println("Ha marcado "+a+" asteriscos de altura ");
		for (int i=1;i<=a;i++) {
			for (int p=1;p<=i;p++) {
			System.out.print("*");

		}
			System.out.println ("");
		}
	}

}
import java.util.Scanner;

public class Marrero_Narciso_Rey {

	public static void main(String[] args) {
		Scanner nj = new Scanner(System.in);
		String nombresreyes, nombressuc;
		String[] antecesores, descendiente;
		int reyes, sucesores, i, total = 1, k;

		reyes = nj.nextInt();
		while (reyes != 0) {
			nj.nextLine();
			nombresreyes = nj.nextLine();
			antecesores = nombresreyes.split(" ");

			sucesores = nj.nextInt();
			nj.nextLine();
			nombressuc = nj.nextLine();
			descendiente = nombressuc.split(" ");

			System.out.println(" ");

			for (k = 0; k < sucesores; k++) {
				for (i = 0; i < reyes; i++) {
					nombresreyes = antecesores[i];
					nombressuc = descendiente[k];
					if (nombressuc.equals(nombresreyes)) {
						total = total + 1;
					}
				}
				System.out.println(total);
				total = 1;
			}
			System.out.println(" ");
			reyes = nj.nextInt();
		}

	}

}

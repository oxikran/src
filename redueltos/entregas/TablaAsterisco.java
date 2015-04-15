import java.util.Scanner;


public class TablaAsterisco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Definimos las variables
		Scanner kb = new Scanner(System.in);
		int numfil, numcol, i, x;
	//Pedimos al usuario cuantas filas y columnas quiere
		System.out.println("¿Cuantas filas quiere que tenga el dibujo? ");
		numfil = kb.nextInt();
		System.out.println("¿Cuantas columnas quiere que tenga el dibujo? ");
		numcol = kb.nextInt();
		kb.close();
	//Comenzamos el bucle
		for (i=0;i<numfil;i++){
			System.out.print("*");
			for (x=1;x<numcol;x++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

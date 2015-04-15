import java.util.Scanner;

public class AjedrezCompleto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String jugada, cad;
		int fila, col;
		String nombreN, nombreB, nombre;
		String [][] tablero = {{"t1","c1","a1","d1","r1","a2","c2","t2"},
		{"p1","p2","p3","p4","p5","p6","p7","p8"},
		{"**","**","**","**","**","d","**","**"},
		{"**","**","**","**","**","**","**","**"},
		{"**","**","**","**","**","**","**","**"},
		{"**","**","**","**","**","**","**","**"},
		{"P1","P2","P3","P4","P5","P6","P7","P8"},
		{"T1","C1","A1","D1","R1","A2","C2","T2"}};
		System.out.println("Introduzca el nombre del primer jugador (fichas negras): ");
		nombreN = entrada.nextLine();
		System.out.println("Introduzca el nombre del segundo jugador (fichas blancas): ");
		nombreB = entrada.nextLine();
		for (int i = 0; i < 8; i++){
			System.out.println(" -- -- -- -- -- -- -- --");
			System.out.print("|");
			for (int j = 0; j < 8; j++)
				System.out.print(tablero[i][j] + "|");
			System.out.println("");
		}
		System.out.println(" -- -- -- -- -- -- -- --");
		System.out.println(nombreN + " introduce la jugada: ");
		jugada = entrada.nextLine();
		nombre = nombreN;
		while (!jugada.equalsIgnoreCase("fin")){
			for (int i = 0; i < 8; i++){
				for (int j = 0; j < 8; j++){
					cad = jugada.substring(0, 2);
					if (tablero[i][j].equals(cad)){
						tablero[i][j] = "**";
						fila = 8 - Character.getNumericValue(jugada.charAt(2));
						cad = jugada.substring(3);
						switch (cad){
							case "tr": col = 7;
									  tablero[fila][col] = jugada.substring(0, 1); break;
							case "td": col = 0;
									  tablero[fila][col] = jugada.substring(0, 1); break;
							case "cr": col = 6;
									  tablero[fila][col] = jugada.substring(0, 1); break;
							case "cd": col = 1;
								   	  tablero[fila][col] = jugada.substring(0, 1); break;
							case "ar": col = 5;
								   	  tablero[fila][col] = jugada.substring(0, 1); break;
							case "ad": col = 2;
									  tablero[fila][col] = jugada.substring(0, 1); break;
							case "d":  col = 3;
									  tablero[fila][col] = jugada.substring(0, 1); break;
							case "r":  col = 4;
									  tablero[fila][col] = jugada.substring(0, 1); break;
						}
					}
				}
			}
			for (int i = 0; i < 8; i++){
				System.out.println(" -- -- -- -- -- -- -- --");
				System.out.print("|");
				for (int j = 0; j < 8; j++)
					System.out.print(tablero[i][j] + "|");
				System.out.println("");
			}
			System.out.println(" -- -- -- -- -- -- -- --");
			if (nombre == nombreN)
				nombre = nombreB;
			else
				nombre = nombreN;
			System.out.println(nombre + " introduce la jugada, si desea terminar introduzca (fin): ");
			jugada = entrada.nextLine();
		}

	}
}
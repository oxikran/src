package arrays.pro;

import java.util.Scanner;

public class Nov11vHTML {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int i, j;
		String styleC, bgColor;
		char[][] caracteres = new char[8][8];
		for (i = 0; i < 8; i++) {
			for (j = 0; j < 8; j++) {
				caracteres[i][j] = " ".charAt(0);
			}
		}
		String temp;
		int fila = 0;
		int columna = 0;
		char caracterFicha = " ".charAt(0);
		String ficha = "";
		ficha = entrada.nextLine();
		while (!ficha.equalsIgnoreCase("fin")) {
			temp = ficha.substring(0, 2);
			if (temp.charAt(1) == "b".charAt(0)) {
				caracterFicha = Character.toLowerCase(temp.charAt(0));
			} else {
				caracterFicha = Character.toUpperCase(temp.charAt(0));
			}
			fila = Integer.parseInt(ficha.substring(2, 3));

			temp = ficha.substring(3);
			switch (temp) {
			case "td":
				columna = 1;
				break;
			case "cd":
				columna = 2;
				break;
			case "ad":
				columna = 3;
				break;
			case "d":
				columna = 4;
				break;
			case "r":
				columna = 5;
				break;
			case "ar":
				columna = 6;
				break;
			case "cr":
				columna = 7;
				break;
			case "tr":
				columna = 8;
			}
			caracteres[fila - 1][columna - 1] = caracterFicha;
			ficha = entrada.nextLine();
		}
		entrada.close();

		System.out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\n \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
		System.out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
		System.out.println("<head>");
		System.out.println("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\"/>");
		System.out.println("<style>");
		System.out.println("charW {");
		System.out.println("color: white;");
		System.out.println("}");
		System.out.println("charB {");
		System.out.println("color: black;");
		System.out.println("}");
		System.out.println("</style>");
		System.out.println("<title>Ajedrez</title>");
		System.out.println("</head>");
		System.out.println("<body>");
		System.out.println("<table border=\"1px\" width=\"320px\" height=\"320px\">");
		
		for (i = caracteres.length-1; i >= 0; i--) {
			System.out.println("<tr height=\"40px\">");
			for (j = 0; j < caracteres[0].length; j++) {
				if ((i % 2 != 0 && j % 2 == 0) || (i % 2 == 0 && j % 2 != 0)) {
					styleC = "charB";
					bgColor = "white";
				} else {
					styleC = "charW";
					bgColor = "black";
				}
				System.out.print("<td bgcolor="+ bgColor +" width=\"40px\" align=\"center\">");
				System.out.print("<" + styleC + ">" + caracteres[i][j] + "</" + styleC + ">");
				System.out.print("</td>");
			}
			System.out.println("\n</tr>");
		}
		System.out.println("</table>");
		System.out.println("</body>");
		System.out.println("</html>");
	}
}

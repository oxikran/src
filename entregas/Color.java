package color;

public class Color {

	public static void main(String[] args) {
		
		int r, g, b;
		
		System.out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\n \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
		System.out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
		System.out.println("<head>");
		System.out.println("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\"/>");
		System.out.println("<style type=\"text/css\">");
		System.out.println(".codigocolor {");
		System.out.println("color: white;");
		System.out.println("text-shadow:-1px -1px 0 #000, 1px -1px 0 #000, -1px 1px 0 #000, 1px 1px 0 #000;"); // Aplica un contorno al texto para que sea visible tanto en colores oscuros como claros.
		System.out.println("}");
		System.out.println("td { padding:15px; }");
		System.out.println("</style>");
		System.out.println("<title>Tabla de colores</title>");
		System.out.println("</head>");
		System.out.println("<body>");
		System.out.println("<table>");
		
		for(r = 0; r < 256; r+=16){
			for(g = 0; g < 256; g+=16){
				System.out.print("<tr>");
				for(b = 0; b < 256; b+=16){
					System.out.printf("<td style=\"background-color:#%02x%02x%02x\">", r, g, b);
					System.out.printf("<span class=\"codigocolor\">#%02x%02x%02x</span>", r, g, b);
					System.out.print("</td>");
				}
				System.out.println("</tr>");
			}
		}
		System.out.println("</table>");
		System.out.println("</body>");
		System.out.println("</html>");
	}

}
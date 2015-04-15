import java.util.Scanner;

/**
 * 
 */

/**
 * @author alumno
 *
 */
public class Mooltiplicaar2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,c;
		
		System.out.println("<body> <html>");
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce la tabla que quieres ver");
		c= entrada.nextInt();
		System.out.println("<table border="+"2"+">");
		for(i=0; i<=10; i++){
			System.out.println("<tr><td>"+c+"x"+i+"</td>"+"<td>"+c*i+"</td><tr>");
		
		}
		System.out.println("</table>");
		System.out.println("<B><PRE>-------------------------------</B></PRE>");
		System.out.println(" </body> </html>");
	}

}

package T5;
/*Incrmenta el precio 11% si es mayor a 1000 "carisimo!!"*/
import java.util.Scanner;
public class Precio {
	public static void main(String[]args){
		double p,i;
		Scanner s = new Scanner(System.in);
		p = s.nextFloat();
		i = p+p*.11;
		if(i<1000){
			System.out.println(i);
		}
		else {System.out.println("\"Cariiiisimo!!!\"");}
	}
}

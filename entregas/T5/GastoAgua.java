package T5;
/* 0,1 € por litro entre 50 y 200 litros
 * 0,3 € por litor a partir de los 200 litros*/
import java.util.Scanner;
public class GastoAgua {
	public static void main(String[]args){
		float l,p;
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca  el número de litros gastados: ");
		l = s.nextFloat();
		if (l<=50) {p= 6;}
		else {
			if (l>50 && l<200) {
				p = (float) (6+l*.1);
				if(p<6) p=6;
			}
				else{p = (float) (6+l*.3);}
		}
		System.out.println("El gasto en agua es:"+p+" euros");
	}
}

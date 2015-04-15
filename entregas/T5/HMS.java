package T5;
import java.util.Scanner;
public class HMS {
	public static void main(String[]args){
		double h,m,s;
		Scanner c = new Scanner(System.in);
		System.out.println("Introduzca horas, minutos y segundos:");
		h = c.nextDouble();
		m = c.nextDouble();
		s = c.nextDouble();
		for(;m>59;){
			h += m/60;
			m = Math.ceil((h-(int)h)*60);	//redondea por arriba
			s += (m-(int)m)*60;
		}
		for(;s>59;){
			m += s/60;
			s = Math.ceil((m-(int)m)*60);
		}
		System.out.println((int)h+" "+(int)m+" "+(int)s);
	}
}

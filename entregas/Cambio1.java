import java.util.Scanner;


public class Cambio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int euros,centimos,billete50,billete20,billete10,billete5,moneda2euros,moneda1euro,
		moneda50cent,moneda20cent,moneda10cent,moneda5cent,moneda2cent,moneda1cent;
		
		System.out.println("Introduzca los euros:   ");
		euros= entrada.nextInt();
		System.out.println("Introduzca los centimos:   ");
		centimos= entrada.nextInt();
		billete50 = euros/50;
		billete20=(euros%50)/20;
		billete10=(euros%20)/10;
		billete5=(euros%10)/5;
		moneda2euros=(euros%5)/2;
		moneda1euro=(euros%2)/1;
		moneda50cent= centimos/50;
		moneda20cent=(centimos%50)/20;
		moneda10cent=(centimos%20)/10;
		moneda5cent=(centimos%10)/5;
		moneda2cent=(centimos%5)/25;
		moneda1cent=(centimos%2);
		System.out.println("billete50: "+billete50);
		System.out.println("billete20: "+billete20);
		System.out.println("billete10: "+billete10);
		System.out.println("billete5: "+billete5);
		System.out.println("moneda2euros: "+moneda2euros);
		System.out.println("moneda1euro: "+moneda1euro);
		System.out.println("moneda50cent: "+moneda50cent);
		System.out.println("moneda20cent: "+moneda20cent);
		System.out.println("moneda10cent: "+moneda10cent);
		System.out.println("moneda5cent: "+moneda5cent);
		System.out.println("moneda2cent: "+moneda2cent);
		System.out.println("moneda1cent: "+moneda1cent);

	}

}

import java.util.Scanner;


public class cambio2 {

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
		euros= euros % 50;
		billete10=(euros%20)/10;
		euros=euros % 20;
		billete5=(euros%10)/5;
		euros=euros % 10;
		moneda2euros=(euros%5)/2;
		euros=euros % 5;
		moneda1euro=(euros%2)/1;
		euros=euros % 2;
		moneda50cent= centimos/50;
		moneda20cent=(centimos%50)/20;
		centimos=centimos%50;
		moneda10cent=(centimos%20)/10;
		centimos=centimos % 20;
		moneda5cent=(centimos%10)/5;
		centimos=centimos % 10;
		moneda2cent=(centimos%5)/2;
		centimos=centimos %5;
		moneda1cent=(centimos%2);

		System.out.println("billete 50: "+billete50);
		System.out.println("billete 20: "+billete20);
		System.out.println("billete 10: "+billete10);
		System.out.println("billete 5: "+billete5);
		System.out.println("monedas 2 euros: "+moneda2euros);
		System.out.println("monedas 1 euro: "+moneda1euro);
		System.out.println("monedas 50 cent: "+moneda50cent);
		System.out.println("monedas 20 cent: "+moneda20cent);
		System.out.println("monedas 10 cent: "+moneda10cent);
		System.out.println("monedas 5 cent: "+moneda5cent);
		System.out.println("monedas 2 cent: "+moneda2cent);
		System.out.println("monedas 1 cent: "+moneda1cent);

	}

}

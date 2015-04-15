package ejemplosHerencias;

public class Prueba {
	public static void main(String[] args) {
		CajaEntero prueba = new CajaEntero(4);
 CajaEntero prueba1 = new CajaEntero(4);
 CajaEntero prueba2 = new CajaEntero(2);
 CajaEntero prueba3 = new CajaEntero(7);
 System.out.print(prueba.compareTo(prueba1));
 System.out.print(prueba.compareTo(prueba2));
 System.out.print(prueba.compareTo(prueba3));
	}
}

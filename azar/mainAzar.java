package azar;

public class mainAzar {

	public static void main(String[] args) {
		
		SacoManoInocente bolsa = new SacoManoInocente();
		String[] lista = {"Juan","Jose","Aznar","Rajoy","Alvaro","Azir"};
		
		bolsa.meter(lista);
		
		bolsa.meter("Jose");
		bolsa.meter("Pedro");
		bolsa.meter("Jorge");
		bolsa.meter("Gabriel");
		bolsa.meter("Lissandra");
		bolsa.meter("Gabriel");
		bolsa.meter("Ambar");
		bolsa.meter("Gabriel");
		bolsa.meter("Pedro");
		bolsa.meter("Fernando");
		bolsa.meter("Pedro");		

		bolsa.mostrar(bolsa);
		

		bolsa.sacar(1);
		bolsa.sacar(5);
		bolsa.sacar(0);
		
		bolsa.mostrar(bolsa);

		bolsa.sacar();
		bolsa.mostrar(bolsa);
		
		bolsa.sacar(2);
		bolsa.mostrar(bolsa);
		bolsa.vaciar();
	}

}

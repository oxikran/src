package azar;

public class mainAzar {

	public static void main(String[] args) {
		
		SacoManoInocente bolsa = new SacoManoInocente();
		String[] lsita = {"Juan","Jose","Aznar","Rajoy","Alvaro","Azir"};
		
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
		
		/*
		bolsa.sacar();
		bolsa.sacar();
		bolsa.sacar();
		bolsa.sacar();
		*/

		bolsa.sacar(1);
		
		bolsa.mostrar(bolsa);

		bolsa.sacar();
		bolsa.mostrar(bolsa);
		
		bolsa.sacar(2);
		bolsa.mostrar(bolsa);
		bolsa.vaciar();
		
		
		
		
	}

}

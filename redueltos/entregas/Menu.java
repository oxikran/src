import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private ArrayList <String> ArrayMenu = new ArrayList <String> ();
	public Menu (String terminar){
		 ArrayMenu.add(terminar);
	}
	public void mostrar (){
		int i;
		for (i = 1; i < ArrayMenu.size(); i++){
			System.out.println(i + ". " + ArrayMenu.get(i));
		}
		System.out.println((i) + ". " + ArrayMenu.get(0));
		System.out.print("Opcion: ");
	}
	public int añadir (String opcion){
		ArrayMenu.add(opcion);
		return (ArrayMenu.size()-1);
	}
	public int leer (Scanner entrada){
		return entrada.nextInt();
	}
}

package deClase;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	private ArrayList<String> arrayMenu = new ArrayList <String> ();
	public Menu (String terminar){
		 arrayMenu.add(terminar);
	}
	
	public int ultimaOpcion() {
		return arrayMenu.size();
	}
	
	public void mostrar (){
		int i;
		for (i = 1; i < arrayMenu.size(); i++){
			System.out.println(i + ". " + arrayMenu.get(i));
		}
		System.out.println(i + ". " + arrayMenu.get(0));
		System.out.print("Opcion: ");
	}

	public int añadir (String opcion){
		arrayMenu.add(opcion);
		return (arrayMenu.size()-1);
	}
	public int leer (Scanner entrada){
		int pos;
		try{
			pos = entrada.nextInt();
			if(pos<=0 || pos >arrayMenu.size())
				pos=arrayMenu.size();				
		} catch(InputMismatchException e){
			pos=arrayMenu.size();
		}
		return pos;
	}
}

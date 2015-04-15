import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private ArrayList<String> listaOpciones = new ArrayList<String>();
	private ArrayList<Character> letrasMenu = new ArrayList<Character>();

	public Menu(String s){
		String tmpPalabra = "", tmpP;
		int i;
		char tmpC;
		tmpP = s.toLowerCase();
		tmpC = tmpP.charAt(0);
		tmpPalabra += ("&" + s.charAt(0));
		
		for(i = 1; i < s.length(); i ++)
			tmpPalabra += s.charAt(i);
		
		listaOpciones.add(tmpPalabra);
		letrasMenu.add(tmpC);
	}
	
	public void mostrar(){
		int i;
		for(i = 1; i < listaOpciones.size(); i++)
			System.out.println(i + ". " + listaOpciones.get(i));
		System.out.println(i + ". " + listaOpciones.get(0));
		System.out.print("Opcion: ");	
	}
	
	public int añadir(String texto){
		int i, j, k;
		String caracter;
		String tmpOpcion = "", tmpP;
		char tmpC = 0;
		boolean encontrada = true;
		i=0;
		j=0;
		
		tmpP = texto.toLowerCase();
		
		while(i < texto.length() && encontrada){
			while(texto.charAt(i) == ' ' && i < texto.length())
				i++;
			tmpC = tmpP.charAt(i);
			j= 0;			
			while((j < letrasMenu.size()) && (tmpC != letrasMenu.get(j))){	
				j++;
			}
			if(j < letrasMenu.size())
				i++;
			else
				encontrada = false;
		}
		
		if(i >= texto.length())
			throw new RuntimeException ("Ya existen todos los caracteres en el array");
				
		letrasMenu.add(tmpC);
		
		caracter = "&" + texto.charAt(i);
				
		for(k=0; k < texto.length(); k++){
			if(k == i)
				tmpOpcion += caracter;
			else
				tmpOpcion += texto.charAt(k);
		}
		
		listaOpciones.add(tmpOpcion);
					
		return (listaOpciones.size()-1);
	}
	
	public int leer(Scanner e){
		int opcion = 0,i;		
		String opcionLetra, tmpP;
		char tmpC;
		
		opcionLetra = e.nextLine();
		
		try{			
			opcion = Integer.parseInt(opcionLetra);			
			if(opcion <= 0 || opcion > listaOpciones.size())
				opcion = listaOpciones.size();			
		}
		catch (java.lang.NumberFormatException a){
			tmpP = opcionLetra.toLowerCase();
			tmpC = tmpP.charAt(0);			
			for(i = 0; i < letrasMenu.size() && tmpC != letrasMenu.get(i);i++){			
				opcion = i + 1;
			}
			if(i >= letrasMenu.size() || i == 0)
				opcion = listaOpciones.size();
		}			
		return opcion;
	}
	
	public int ultimaOpcion(){
		return listaOpciones.size();
	}
}

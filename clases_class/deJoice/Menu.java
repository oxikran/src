package deJoice;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private ArrayList<String> listaOpciones = new ArrayList<String>();
	private ArrayList<Character> letrasMenu = new ArrayList<Character>();

	public Menu(String s){
		añadir(s);
		/*
		String tmpPalabra = "";
		int i;
		char tmpC;
		tmpC = s.toLowerCase().charAt(0);
		tmpPalabra += ("&" + s.charAt(0));
		
		for(i = 1; i < s.length(); i ++)
			tmpPalabra += s.charAt(i);
		
		listaOpciones.add(tmpPalabra);
		letrasMenu.add(tmpC);
		*/
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
		String tmpP;
		StringBuffer tmpOpcion = new StringBuffer(texto); 
		char tmpC = 0;
		boolean yaUsada = true;
		i=0;
		j=0;
		
		tmpP = texto.toLowerCase();
		
		while(i < texto.length() && yaUsada){
			while(i < texto.length() && ! Character.isLetter(texto.charAt(i)))
				i++;
			tmpC = tmpP.charAt(i);
			
			j=letrasMenu.indexOf(tmpC);
			if(j != -1)
				i++;
			else
				yaUsada = false;
		}
		
		if(i >= texto.length())
			throw new RuntimeException ("Ya existen todos los caracteres en el array");
				
		letrasMenu.add(tmpC);
		
		/*		
		for(k=0; k < texto.length(); k++){
			if(k == i)
				tmpOpcion += "("+texto.charAt(k)+')';
			else
				tmpOpcion += texto.charAt(k);
		}
		*/
		tmpOpcion.insert(i+1, ')');		
		tmpOpcion.insert(i, '(');
		listaOpciones.add(tmpOpcion.toString());
	
		return (listaOpciones.size());
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

			tmpC = opcionLetra.toLowerCase().charAt(0);		
			i=letrasMenu.indexOf(tmpC);
			if(i == -1)
				opcion = listaOpciones.size();
			else{
				if(opcion==0)
					opcion=listaOpciones.size();
				else
					opcion = i;
			}
		}			
		return opcion;
	}
	
	public int ultimaOpcion(){
		return listaOpciones.size();
	}
}

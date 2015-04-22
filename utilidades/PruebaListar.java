package utilidades;

import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaListar{

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		ListIterator<String> i;
		
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		
		
		i= l.listIterator();
		//l.add("C"); // ERROR, no se puede insertar.
		i.next();
		Iteradores.listar(i);
	}

}

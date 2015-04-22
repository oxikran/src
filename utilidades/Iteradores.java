package utilidades;

import java.util.ListIterator;

public class Iteradores {

	public static void listar(ListIterator<String> l){
		while(l.hasNext()){
			System.out.println(l.next());
		}
		while(l.hasPrevious()){
			System.out.println(l.previous());
		}
		
	}
	
}

package contenedores;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayLista2<T> extends ArrayLista<T>{
	
	private class Recorredor implements Iterator<T>{
		private int actual = -1;
		boolean enDato;
		
		@Override
		public boolean hasNext(){
			return actual<contador-1;
		}
		
		@Override
		public T next(){
			if(!hasNext())
				throw new NoSuchElementException();
			actual++;
			enDato=true;
			return null;
		}
		
		@Override
		public void remove(){
			if(!enDato)
				throw new IllegalStateException();
			
			ArrayLista2.this.remove(actual);
			actual--;
			enDato=false;
		}
		
		
		//mostrar los elementos desde la posicion desde que esta el list iterator  y luego mostar la lista al reces
	@SuppressWarnings("unused")
	public void listar() {
		T aux;
		
		if(  ){
			
		}
		
	}
	
	
	}
	
	
}

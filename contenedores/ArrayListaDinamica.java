package contenedores;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class ArrayListaDinamica<T> {
	Nodo ini;
	private int contador;
	private class Nodo{
		T dato;
		Nodo sig;
	}
	private class Recorredor implements Iterator<T> {
		private int pos=0;
		@Override
		public boolean hasNext() {
			return pos<contador;
		}
		@Override
		public T next() {
			if(!hasNext())
				throw new NoSuchElementException();
			return (T)elementos[pos++];
		}
		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
	public Iterator<T> iterator(){
		return new Recorredor();
	}
	
	public ArrayListaDinamica() {
		ini= new Nodo();
	}
	

	public boolean add(T elemento) {
/*
 		Nodo i,nuevo;
 
		i=ini;
		while(i.sig!=null)
			i=i.sig;
		nuevo=new Nodo();
		nuevo.dato=elemento;
		i.sig=nuevo;		
		contador++;
*/
		add(contador,elemento);
		return true;
	}

	public void add(int posicion, T elemento) {
		Nodo i,nuevo;
		int pos;
		if(posicion < 0 | posicion > contador) {
			throw new RuntimeException("No se pueden insertar elementos en esa posicion");}
		i=ini;
		for(pos=0;pos<posicion;pos++){
			i=i.sig;
		}
		nuevo=new Nodo();
		nuevo.dato=elemento;
		nuevo.sig=i.sig;
		i.sig=nuevo;
		contador++;
	}
	
	public T set(int posicion, T elemento) {
		if(posicion < 0 | posicion >= contador) {
			throw new RuntimeException("No hay elementos en la posición indicada");}
		T aux=(T)elementos[posicion];
		elementos[posicion] = elemento;
		return aux;
	}
	
	public void clear() {
		contador = 0;
		elementos = new Object[tamInicial];
	}

	public T remove(int posicion) {
		int i;
		if(posicion < 0 || posicion >= contador) 
			throw new RuntimeException("No hay elementos en la posición indicada");
		T aux = (T)elementos[posicion];
		for(i=posicion;i<contador-1;i++) {
			elementos[i] = elementos[i+1];
		}
		contador--;
		return aux;
	}
	
	public int size() {
		return contador;
	}
	

  	public String toString() {

		int i;
		String aux = "[";
		if(contador>0){
			for(i=0;i<contador-1;i++) {
				aux = aux + "\"" + elementos[i] + "\",";
			}
			aux = aux + "\"" + elementos[contador-1] + "\"" + "]";			
		}
		else
			aux = aux + "]";
		return aux;
	}
	
}
package contenedores;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class ArrayLista<T> {
	private static int tamInicial=10;
	private int tamIncremento=10;
	private Object[] elementos;
	int contador;
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
	
	public ArrayLista() {
		elementos = new Object[tamInicial];
		contador = 0;
	}
	
	private void comprobarTamaÒo() {
		
		if(contador == elementos.length) {
			int i;
			Object[] aux;
			aux=new Object[elementos.length+tamIncremento];
			for (i = 0; i < elementos.length; i++) {
				aux[i]=elementos[i];
			}
			elementos=aux;
		}		
	}	
	
	public boolean add(T elemento) {
		comprobarTamaÒo();
		elementos[contador] = elemento;
		contador++;
		return true;
	}

	public void add(int posicion, T elemento) {
		int i;
		if(posicion < 0 | posicion > contador) {
			throw new RuntimeException("No se pueden insertar elementos en esa posicion");}
		comprobarTamaÒo();
		for(i=contador;i>posicion;i--){
			elementos[i] = elementos[i-1];
		}
		elementos[posicion] = elemento;
		contador++;
	}
	
	public T set(int posicion, T elemento) {
		if(posicion < 0 | posicion >= contador) {
			throw new RuntimeException("No hay elementos en la posici√≥n indicada");}
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
			throw new RuntimeException("No hay elementos en la posici√≥n indicada");
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
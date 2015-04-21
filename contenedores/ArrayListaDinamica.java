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
	private Nodo act=ini, ant;
	@Override
	public boolean hasNext() {
		return act.sig!=null;
	}
	@Override
	public T next() {
		if(!hasNext())
			throw new NoSuchElementException();
		ant=act;
		act=act.sig;
		return act.dato;
	}
	@Override
	public void remove() {
		if(ant == act)
			throw new NoSuchElementException();
		
		ant.sig=act.sig;
		act=ant;
		contador--;
		
		/*
		Nodo last;
		Nodo actual;
		
		last=act;
		actual=act.sig;
		last.sig=actual.sig.sig;
		*/
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
		if(posicion < 0 | posicion >= contador) 
			throw new RuntimeException("No hay elementos en la posición indicada");
		T aux;
		Nodo i;
		int pos;
		i=ini.sig;
		for(pos=0;pos<posicion;pos++){
			i=i.sig;
		}
		aux=i.dato;
		i.dato=elemento;
		return aux;
	}
	
	public void clear() {
		contador = 0;
		ini.sig=null;
	}

	public T remove(int posicion) {
		if(posicion < 0 || posicion >= contador) 
			throw new RuntimeException("No hay elementos en la posición indicada");
		T aux;
		int pos;
		Nodo i;

		i=ini;
		for(pos=0;pos<posicion;pos++) {
			i=i.sig;
		}
		
		aux=i.sig.dato;
		i.sig=i.sig.sig;
		
		contador--;
		return aux;
	}
	
	public int size() {
		return contador;
	}
	

  	public String toString() {

		Nodo i;
		String aux = "[";
		if(contador>0){
			for(i=ini.sig;i.sig!=null;i=i.sig) {
				aux = aux + "\"" + i.dato + "\",";
			}
			aux = aux + "\"" + i.dato + "\"" + "]";			
		}
		else
			aux = aux + "]";
		return aux;
	}
	
}
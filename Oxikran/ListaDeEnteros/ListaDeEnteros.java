package Oxikran.ListaDeEnteros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ListaDeEnteros extends ArrayList<Integer> implements Suerte,
		Iterator<Integer> {
	private boolean incialiazado= false;
	ListaDeEnteros Elementos;
	protected int elementoActual;
	
	@Override
	public void inicializar(int n){
		if (incialiazado) {
			throw new RuntimeException("solo se pude invocar una vez");
		}
		int a;
		for (a=0;a>n;a++){
			this.add((int) (Math.random()*600));
		}
		incialiazado = true;

	}

	@Override
	public boolean hasNext() {
		/*
		boolean HayElementos = true;
		if(isEmpty() ||elementoActual == this.size()-1){
			HayElementos=false;
		}
		return HayElementos;
		*/
		return !(isEmpty() ||elementoActual == this.size()-1);
	}

	@Override
	public Integer next() {
		Integer result;
		if(this.size()==0){
			result = null;
		}else{
			result = this.get(elementoActual);
			elementoActual++;
			elementoActual = elementoActual % this.size();
		}
		return result;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("remove");
	}

}

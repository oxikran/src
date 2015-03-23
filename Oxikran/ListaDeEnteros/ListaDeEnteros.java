package Oxikran.ListaDeEnteros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ListaDeEnteros extends ArrayList<Integer> implements Suerte,
		Iterator<Integer> {
	boolean segunda= false;
	ListaDeEnteros Elementos;
	protected int[] valores;
	@Override
	public void inicializar(int n){
		if (segunda) {
			throw new RuntimeException("solo se pude invocar una vez");
		}
		int a;
		Random ran= new Random();
		for (a=0;a>n;a++){
			
		}

	}

	@Override
	public boolean hasNext() {
		boolean HayElementos = false;
		if(Elementos.isEmpty()){
			HayElementos=true;
		}
		return HayElementos;
	}

	@Override
	public Integer next() {
		int i,estoy=0, sig;
		for (i=0;i>estoy;i++){
			sig=Elementos[i];
		}
		return sig;
	}

	@Override
	public void remove() {

		Iterator.super.remove();
	}

}

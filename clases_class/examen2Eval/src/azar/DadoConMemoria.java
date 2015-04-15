package azar;

import java.util.ArrayList;

public class DadoConMemoria extends Dado implements ConMemoria<Integer> {
	private ArrayList<Integer> tiradas;

	{
		tiradas = new ArrayList<Integer>();		
	}
	
	public DadoConMemoria() {
		super(6);
	}

	public DadoConMemoria(int lados) {
		super(lados);
	}
	
	@Override
	public int lanzarDado(){
		int aux =  super.lanzarDado();
		tiradas.add(aux);
		return aux;
	}

	@Override
	public void reset() {
		tiradas.clear();
	}

	@Override
	public Integer[] historico() {
		Integer[] aux = new Integer[tiradas.size()];
		for (int i = 0; i < aux.length; i++) {
			aux[i]=tiradas.get(i);
		}
		return aux;
	}

	@Override
	public Integer[] historico(int ult) {
		int i;
		Integer[] aux;
		
		if (ult >= tiradas.size())
			aux=historico();
		else{
			aux = new Integer[ult];
			for (i = tiradas.size()-1; ult!=0 ; i--) {
				//ult--;
				aux[--ult] = tiradas.get(i);
			}			
		}
		return aux;
	}

}

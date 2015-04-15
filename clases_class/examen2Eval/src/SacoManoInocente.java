

import java.util.Random;

public class SacoManoInocente {
	private String[] listaNombres;
	private int indice;

	private final static int TAMINICIAL = 10;
	private final static int TAMINCREM = 10;

	public SacoManoInocente() {
		listaNombres = new String[TAMINICIAL];
		indice = 0;
	}

	public void meter(String nombre) {
		int i;
		boolean encontrado = false;

		if (indice == listaNombres.length)
			agrandarArray();
		for (i = 0; i < indice && !listaNombres[i].equalsIgnoreCase(nombre); i++);
		if (i==indice) {
			listaNombres[indice] = nombre;
			indice++;
		}
	}

	public void meter(String[] nombre) {
		int i;
		for (i = 0; i < nombre.length; i++) {
			meter(nombre[i]);
		}
	}

	public String[] sacar(int cuantos) {
			
		int i, j, n;
		String[] aux;

		if (cuantos >= indice){
			aux=listaNombres;
			indice=0;
		}
		else{
			aux=new String[cuantos];
			for (i = 0; i < cuantos; i++) 
				aux[i] = sacar();
		}
		return aux;
	}

	public String sacar() {
		String nombreEliminado;
		int i, n;
		Random rnd = new Random();

		if (indice == 0)
			nombreEliminado = null;
		else {
			n = rnd.nextInt(indice);
			nombreEliminado = listaNombres[n];
			listaNombres[n] = listaNombres[indice-1];
			indice--;
		}
		return nombreEliminado;
	}

	void vaciar() {
		listaNombres = new String[TAMINICIAL];
		indice = 0;
	}

	private void agrandarArray() {
		String[] nuevaLista;
		int i;

		nuevaLista = new String[listaNombres.length + TAMINCREM];

		for (i = 0; i < listaNombres.length; i++)
			nuevaLista[i] = listaNombres[i];

		listaNombres = nuevaLista;
	}
}

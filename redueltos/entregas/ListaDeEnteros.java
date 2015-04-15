package temp.pro;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaDeEnteros extends ArrayList<Integer> implements Suerte, Iterator<Integer> {

	private static final long serialVersionUID = -8768161154609593108L;
	private boolean inicializado;
	private int elementoActual;

	public ListaDeEnteros() {
		inicializado = false;
		elementoActual = 0;
	}

	@Override
	public void inicializar(int cantidad) {
		if (inicializado) {
			throw new RuntimeException("Inicializar solo puede ser llamado una vez");
		}
		for (int i = 0; i < cantidad; i++) {
			this.add((int) (Math.random() * 600));
		}
		inicializado = true;

	}

	@Override
	public boolean hasNext() {
		boolean r = true;
		if (isEmpty() || elementoActual == this.size()) {
			r = false;

		}
		return r;
	}

	@Override
	public Integer next() {
		Integer result;
		if (this.size() == 0) {
			result = null;
		} else {
			elementoActual = elementoActual % this.size();
			result = this.get(elementoActual);
			elementoActual++;
		}
		return result;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("remove");
	}

}

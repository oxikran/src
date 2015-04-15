package ejemplosHerencia;

import java.util.Random;

public class CajaModificable extends CajaEntero {
	private boolean estaCerrado;
	private int codigo;

	public CajaModificable() {
		cerrar();
	}

	public CajaModificable(int valor) {
		super(valor);
		cerrar();
	}

	public void abrir(int num) {
		if (codigo == num)
			estaCerrado = false;

	}

	public void cerrar() {
		if (!estaCerrado) {
			estaCerrado = true;
			codigo = new Random().nextInt(11);
		}
	}

	@Override
	public void setX(int valor) {
		if (estaCerrado)
			super.setX(valor);
		else {
			x = valor;
			tieneValor = true;
		}
	}

}

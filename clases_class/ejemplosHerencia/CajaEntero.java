package ejemplosHerencia;

public class CajaEntero {
	protected int x;
	protected boolean tieneValor;

	public CajaEntero() {
		tieneValor = false;
	}

	public CajaEntero(int valor) {
		x = valor;
		tieneValor = true;
	}

	public int getX() {
		if (!tieneValor) 
			throw new RuntimeException("No tiene valor.");
		return x;	
	}
	public void setX(int valor) {
		if (tieneValor)
			throw new RuntimeException("La caja tiene valor, o se ha llamado al menos 1 vez a la función");
		x = valor;
		tieneValor=true;
	}
}

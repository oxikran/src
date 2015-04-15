package Objetos;

public class Contador {
	private int contador, inicializador;
	private long empieza, acaba;
	public Contador (int inicio) {
		inicializador = inicio;
		contador = inicio;
		empieza = System.currentTimeMillis();
	}
	private void reiniciar(){
		acaba = System.currentTimeMillis();
		if ((acaba-empieza) >= 60000)
			contador = inicializador;
		empieza = System.currentTimeMillis();
	}
	public void incrementar (){
		reiniciar();
		contador++;
	}
	public int getValor() {
		reiniciar();
		return contador;
	}

}

package deClaseST;

public class ColaDeCaracteres {
	private char[] datos;
	private int cab, cola;

	public ColaDeCaracteres(int tam){
		datos = new char[tam+1];
		cab = 0;
		cola = -1;
	}
	
	public boolean vacia(){
		return sig(cola) == cab;		
	}
	
	public boolean llena(){
		return sig(sig(cola)) == cab;		
	}
	
	public void acolar(char ch){
		if(llena())
			throw new RuntimeException("La cola está llena");
		cola = sig(cola);
		datos[cola] = ch;
	}
	
	public char desacolar(){
		if(vacia())
			throw new RuntimeException("La cola está vacía");
		
		char aux;
		aux = datos[cab];
		cab = sig(cab);
		return aux;
	}
	
	private int sig(int n){
		//Si la n ha llegado a la última posición, 
		//se devuelve 0, sino, se devuelve n + 1: 
		return (n == datos.length -1) ? 0 : n + 1;
		//return (n + 1) % datos.length;
	}
	
	@Override
	public String toString() {
		int i;
		StringBuffer aux = new StringBuffer("[");
		for (i = cab; i != cola; i = sig(i)) {
			aux.append("\'" + datos[i] + "\', ");
		}
		if(!vacia())
			aux.append("\'" + datos[i] + "\']");
		else
			aux.append("]");
		
		return aux.toString();
	}
}

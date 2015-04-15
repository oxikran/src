/* StringsArray --> tamaño por defecto: 10 (constante estatica)
   - constructor --> inicializa la tabla y un atributo que contenga cuantos elementos tenga la tabla en el momento
   - add(String ) --> añade un nuevo elemento al final de los que ya hay y incrementa el atributo
   - add(int index, String ) --> se puede insertar el String en la posicion indicada por int
   
   - set (int index, String ) --> cambia lo que habia en el hueco int y pone lo de String
   - clear () --> elimina los elementos que hay dentro de la tabla
   - remove (int index) --> retorna el elemento que elimina (un String) y desaparece el elemento, por lo tanto
   los demas elementos que le siguen retroceden en una posicion
   - size() --> numero de elementos que contiene
   - toString() --> recorre la tabla desde 0 hasta el numero de elementos q tiene la tabla. Se retorna: 
   ["dato", "dato"]
   */
public class StringsArray {
	
	private final String [] ELEMENTOS;
	private int contador;
	private int i;
	
	public StringsArray() {
		ELEMENTOS = new String [10];
		contador = 0;
	}
	
	public void add(String elemento) {
		if(contador == ELEMENTOS.length) {
			throw new RuntimeException("La tabla está llena");}
		ELEMENTOS[contador] = elemento;
		contador++;
	}
	
	public void add(int posicion, String elemento) {
		if(posicion > contador) {
			throw new RuntimeException("No se pueden insertar elementos en esa posicion");}
		else if (contador == ELEMENTOS.length) {
			throw new RuntimeException("La tabla está llena");}
		for(i=contador;i>posicion;i--){
			ELEMENTOS[i] = ELEMENTOS[i-1];
		}
		ELEMENTOS[posicion] = elemento;
		contador++;
	}
	
	public void set(int posicion, String elemento) {
		if(posicion >= contador) {
			throw new RuntimeException("No hay elementos en la posición indicada");}
		ELEMENTOS[posicion] = elemento;
	}
	
	public void clear() {
		contador = 0;
	}
	
	public String remove(int posicion) {
		if(posicion >= contador) {
			throw new RuntimeException("No hay elementos en la posición indicada");}
		String aux = ELEMENTOS[posicion];
		for(i=posicion;i<contador-1;i++) {
			ELEMENTOS[i] = ELEMENTOS[i+1];
		}
		contador--;
		return aux;
	}
	
	public int size() {
		return contador;
	}
	
	public String toString() {
		int i;
		String aux = "[";
		for(i=0;i<contador-1;i++) {
			aux = aux + "\"" + ELEMENTOS[i] + "\",";
		}
		aux = aux + ELEMENTOS[contador-1] + "]";
		return aux;
	}
}
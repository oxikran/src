package contenedores;

public class ColaDinamica {
   
	private static class Nodo {
		char dato;
		Nodo sig;
	}

	private Nodo cola,cabeza;

    public boolean vacia() {
        return cabeza == null;
    }

    public boolean llena() {
        return false;
    }

    public void acolar(char ch){
    	Nodo aux;
    	aux=new Nodo();
    	aux.dato=ch;
    	// aux.sig=null;
    	if(vacia()){
    		cabeza=aux;
    	}
    	else{
    		cola.sig=aux;
    	}
		cola=aux;
    }

    public char desacolar() throws ColaException {
    	if(vacia())
    		throw new ColaException();
    	char aux;
    	aux=cabeza.dato;
    	cabeza=cabeza.sig;
    	return aux;
    }
	
    
    
	@Override
	public String toString() {
		int i;
		StringBuffer aux = new StringBuffer("[");
		if(!vacia()){
			for (i=cabeza; i!=cola; i=sig(i)) {
				aux.append("\'"+datos[i]+"\', ");
			}
			aux.append("\'"+datos[i]+"\']");
		}
		else
			aux.append("]");
		
		return aux.toString();
	}
	
	
	public boolean add(T elemento){
	/*	
		Nodo i;
		i=ini;
		while(i.sig!=null)
				i=i.sig;
		
		nuevo=new Nodo();
		nuevo.dato=elemento;
		i.sig=nuevo;
		contador++;
		*/
		add(contador,elemento);
		return true;
	}
	
	public add(int posicion, T elemento){
		Nodo i,pos;
		
		if(posicion < 0 | posicion > contador) {
			throw new RunTimeException("No se pueden"");
		}
		
		i=ini;
		for(pos=0;pos<posicion;pos++)
			i=i.sig;
		
		
		nuevo=new Nodo();
		elementos[posicion] = elemento;
		nuevo.sig=i.sig;
		i.sig=nuevo;
		contador++;
	}
}
package ListaEnteros;

public interface Suerte {
	
	boolean usada = false;
	public static int inicializar(int cantidad){
		
		if(usada = false){
			return (int) (Math.random()*cantidad);
			usada = true;
		}
		else{
			throw new UnsupportedOperationException("Solo puede inicializarse una única vez.");
		}
		
	}
}

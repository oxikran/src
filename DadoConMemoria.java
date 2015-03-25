
public class DadoConMemoria extends Dado implements ConMemoria{
	public int[] memoria;
	
	public DadoConMemoria(){
		super(lados=6);
	}

	public DadoConMemoria(int lados) {
		super(lados);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void reset() {
		for (int i=0;i<memoria.length;i++){
			memoria[i]=0;
		}
		
	}

	@Override
	public Object[] historico() {
		
		return historia;
	}

	@Override
	public Object[] historico(int ult) {
		int posicion= historia.length;
		Object[] historia2 = null;
		for(int i=0; i<ult;i++){
			historia2[i]=historia[posicion];
		}
		return historia2;
	}

}

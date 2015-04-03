package azar;

public class SacoManoInocente {
	
	private String[] saco = new String[1000000];
	private int last=0;
	
	public SacoManoInocente(){
		last=0;
		saco = new String[1000000];
	}

	public void meter(String nombre){
		saco[last]=nombre;
		last++;
		
		for(int i=0;i<last-1;i++){
			if(nombre.equals(saco[i]))
				last--;
		}
	}


	public void meter(String[] nombre){

		int longitud = nombre.length;
		
			for(int i=0;i<longitud;i++){
				meter(nombre[i]);	
			}
	}
	

	public void mostrar(SacoManoInocente bolsa){
		System.out.println();
		System.out.println("--SACO   CANTIDAD:"+last+"--");
		for(int i=0;i<last;i++)
			System.out.println(i+") "+saco[i]);
	}


	
	String sacar(){
		
		int ran = rand(last);
		String exit = saco[ran];

		try{
			saco[ran] = saco[last-1];
			last--;
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("ERROR, no quedan nombres que sacar en el saco");
			System.out.println(e);
			return null;
		}
		
		return exit;
	}
		

	public String[] sacar(int cuantos){
		String[] exit = new String[1000000];;
		
		if(cuantos >= last){
			last=0;
			return saco;	
		}
		else
			for(int i=0;i<cuantos;i++)
				exit[i] = sacar();
		
		return exit;
		
		
	}
	
	
	public void vaciar(){
		last=0;
	}
	
	
	int rand(int lim){
		int ran = (int) (Math.random()*lim);
		 return ran;
	}
	 
	
}

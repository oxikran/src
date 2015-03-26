import java.util.Random;

public class SacoManoInocente {

	public String [] sac;
	public int numeroel=0;
	public boolean esta= false;
	public String[] sacar; 
	
	public void meter(String nombre){
		/*if(numeroel<=0){
		sac= new String[1];
		}
		else{
			sac[numeroel]=nombre;
			numeroel++;
		}*/
		for (int i=0;i<numeroel;i++){
			if(nombre.equalsIgnoreCase(sac[i])){
				esta=true;
			}
		}
		if(esta=false){
			sac[numeroel+1]=nombre;
			numeroel=numeroel+1;
		}
	}
	
	public void meter(String[] nombre){
		int i;
		for (i=0;i<numeroel;i++){
			if(nombre[i].equalsIgnoreCase(sac[i])){
				esta=true;
			}
		}
		if(esta=false){
			sac[numeroel+1]=nombre[i];
			numeroel=numeroel+1;
		}
		
	}
	public String[] sacar(int cuantos){
		for(int i=0; i<cuantos; i++){
			int r=(int) ((Math.random()*cuantos)+1);
			sacar[i]=sac[r];
			sac[r]=null;
			while(sac[r]== null){
				sacar[i]=sac[r+1];
				r=r+1;
			}
			
		}
		return sacar;
		
	}
	public String sacar(){
			String salida;
			int r=(int) ((Math.random()*sac.length)+1);
			salida=sac[r];
			while(sac[r]== null){
				salida=sac[r+1];
				r=r+1;
			}
		return salida;
		
	}
	public void vaciar(){
		for(int i=0;i<=numeroel;i++){
			sac[i]=" ";
		}
	}
}

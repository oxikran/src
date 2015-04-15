package deClase;

import java.util.Random;

public class CajaSecreta {
	private int x;
	private boolean estaCerrado = true;
	
	public CajaSecreta(){
		Random rnd = new Random();
		x = rnd.nextInt(10) + 1;
	}
	
	public int getX(){
		if(estaCerrado)
			throw new RuntimeException ("La caja está cerrada");
		return x;			
	}
	
	public void abrir(int a){
		if(a == x)
			estaCerrado = false;
	}	
}

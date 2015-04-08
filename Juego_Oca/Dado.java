package Juego_Oca;

public class Dado {
	
	static int LanzarDado(){
		int result = (int) (Math.random()*6 + 1);
		return result;
	}
	
}

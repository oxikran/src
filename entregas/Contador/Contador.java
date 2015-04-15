/*
practica PRO:

Contador que cuando se construya se inicialice a un valor $dato "new contador(60)"
tiene una funcion incrementa que incrementa el valor del contador en 1
y otra funcion get_contador que te permite consultar el valor del contador
si no se incrementa ni se consulta durante 1 minuto se resetea al valor inicial (60)
*/



import java.util.*;
public class Contador {
	public static Scanner teclado = new Scanner(System.in);
	
	private static long cont,last,init;
	
	public Contador(long iniX){
		init = iniX;
		cont = iniX;
		last = System.currentTimeMillis();
	}
	
	public static void incrementar(){
		
		if ( System.currentTimeMillis() - last > 60000){
			cont = init;
			cont++;
			last = System.currentTimeMillis();
		}
		else{
			cont++;
			last = System.currentTimeMillis();
		}
	}

	
	public static long getValor(){
		if ( System.currentTimeMillis() - last > 60000){
			cont = init;
			return cont;
		}
		else{
			return cont;
		}
	}
	
}

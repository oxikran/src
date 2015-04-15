package examen;

import java.util.Scanner;

public class lectura_con_centinelas {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numero=0 , suma=0  , counter=0 , centinela=999 , media, p=0;
		
		System.out.println("introduce el primer numero sabiendo que si introduces 999 o mayor se acabará el calculo de la media");
		do{
			try{
				numero=kb.nextInt();
				p=1;
			}
			catch(java.util.InputMismatchException i){
				p=-1;
			}
		}while(p!=1);
		
		while(numero!=centinela){
			p=0;
			suma= suma + numero;
			counter++;
			do{
				try{
					numero=kb.nextInt();
					p=1;
				}
				catch(java.util.InputMismatchException i){
					p=-1;
				}
			}while(p!=1);
		}
		media= suma / counter;
		System.out.println("media: " + media +" la suma: " + suma + " numero de datos: " +counter);
	}

}

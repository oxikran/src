

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		ArrayList<Integer> cuantos = new ArrayList<Integer>();
		int num, i, pos;
		Scanner entrada = new Scanner(System.in);
		
		num = entrada.nextInt();
		while(num != 0){
			pos = numeros.indexOf(num);
			if(pos!=-1)
				cuantos.set(pos, cuantos.get(pos)+1);
			else{
				cuantos.add(1);
				numeros.add(num);
			}
			num = entrada.nextInt();
		}
		
		for(i = 0; i < numeros.size(); i++){
			System.out.println(numeros.get(i) + " " + cuantos.get(i));
		}
		
	}
}

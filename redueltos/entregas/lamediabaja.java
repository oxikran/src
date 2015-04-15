package sumaDeNumeros;
import java.util.Scanner;

public class lamediabaja {

	public static void main(String[] args) {
		final int TAMAÑO_TABLA=5;
		double[] numeros;
		double aux,total=0.0;
		int i;
		numeros= new double[TAMAÑO_TABLA];
		Scanner nj= new Scanner(System.in);
		System.out.println("por favor introduce 5 numeros:");
		for (i=0;i<TAMAÑO_TABLA;i++) {
			System.out.print((i+1)+"-");
			numeros[i]=nj.nextDouble();
		}
		total=0.0;
		for (i=0;i<TAMAÑO_TABLA;i++) {
			total=total+numeros[i];
		}
		total=total/TAMAÑO_TABLA;
		aux=total;
		total=0.0;
		for (i=0;i<TAMAÑO_TABLA;i++) {
			if (numeros[i]<aux) {
				total=total+numeros[i];
			}
		}
		System.out.println("la solución es "+total);
	}

}
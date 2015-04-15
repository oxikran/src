/*Ejercicio 1: Introducir tabla valores enteros. Tabla String. Aplicacion que lea nombres y edades de una secuencia de n personas
El programa pregunta cuantos datos se van a introducir y se introducen los nombre y edades.
Mostrar nombres y edades de las personas de la siguiente forma: 1. Macarena (cuantos años tiene + de la media)*/
package sumaDeNumeros;
import java.util.Scanner;
public class NombresEdad {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String [] nombres;
		int [] edades;
		int datos, i;
		int totalAños = 0;
		int media = 0;
		int contador =0;
		System.out.print("¿Cuántos datos desea introducir? ");
		datos = entrada.nextInt();
		nombres = new String [datos];
		edades = new int [datos];
		entrada.nextLine();
		for(i=0;i<datos;i++) {
			System.out.print("Nombre: ");
			nombres [i] = entrada.nextLine();
			System.out.print("Edad: ");
			edades [i] = entrada.nextInt();
			totalAños = totalAños + edades[i];
			entrada.nextLine();
		}
		media = totalAños/datos;
		for(i=0;i<datos;i++) {
			if(edades[i]>=media) {
			contador ++;
			System.out.println(contador+". "+(nombres[i])+" tiene "+(edades[i]-media)+" años más de la media.");
			}
		}	
	}
}
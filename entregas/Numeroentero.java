import java.util.Scanner;


public class Numeroentero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//leer como numero entero o long  y mostrar por la salida estandar la suma de sumar sus digitos por el numero
//quiero que suponga que en el string puede tener entre 25 y 30 digitos que valga para cualquier tamaño
		Scanner entrada = new Scanner(System.in);
		long num,resto,suma;
		suma=0;
		System.out.println("Introduce un numero entero positivo: ");
		num=entrada.nextLong();
		
		
		if(num>=0){
			for (;num!=0;){
			resto=num%10;
			suma=suma+resto;
		    num=num/10;}
		}
		else{
			
			System.out.println("el numero introducido no es valido");
		}
		System.out.println("la suma de los digitos es:  "+suma);
}

}

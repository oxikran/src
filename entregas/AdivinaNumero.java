/*Federico Lleo
*juego consiste en averiguar un numero al azar entre 1 y 10, y a continuacion
 * el programa leera de la entrada numeros a ver si los acierta
 * dira si es mayor o menor y si acierta dira PREMIO!
 * dara 3 oportunidades sino los consigue dira "fallaste" y dira el numero
 * tolerara un error en la entrada de datos
 * si no introduce un numero sacxara un aviso "solo valen numeros"
 * la primera vez no cuenta como error 
 * /*/
import java.util.InputMismatchException;
import java.util.Scanner;
public class AdivinaNumero {
	static	int n=0,m=0,a,i=1,c=0;
	public static  void main(String[]args){
		a = (int) (Math.random()*10)+1;
		do {	
			pedirNumero(n);
		}
		while (i<=3);
		mensajeTerminado();
	}
	public static void pedirNumero(int n) {
		Scanner s = new Scanner(System.in);
		try{
			for(;i<=3;i++){
				n = s.nextInt();
				if(n<a)  System.out.println("Te has quedado corto...");
				if(n>a)  System.out.println("Te has pasaooo!");
				if(n==a) {
					System.out.print("Has ganado!!");
					m=n;i=3;s.close();
				}
			}
		}
		catch (InputMismatchException e){
				if(c==0)
				System.out.println("Sólo números, por favor\nLa próxima vez perderás un intento. "+e);
				else System.out.println("Sólo números, por favor\nHas perdido "+i+" intento/s. "+e);
				c++;
				if(c>1) i++;
		}		
	}												
	public static void mensajeTerminado() {
		if (m!=a && i>3){ System.out.printf("\nHas consumido los tres intentos, el número a adivinar era el: %d",a);}
	}
}
			
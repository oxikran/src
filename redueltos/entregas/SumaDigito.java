import java.util.Scanner;


public class SumaDigito {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num, resto, suma, guard;
		suma=0;
		//
		System.out.println ("Número entero positivo");
		num=entrada.nextInt();
		
		if (num>=0) {
			while (num!=0){
				resto=num%10;
				suma=suma+resto;
				num=num/10;
				guard=resto;
				System.out.print (guard);
				}
			System.out.print("\n");
			System.out.println ("La suma de los dígitos es "+ suma);
			}
		else{
			System.out.println ("Número no válido");
			}	
	entrada.close();
	}
}

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Random rnd = new Random();
		int ran, intentos = 3, num = 0;
		boolean numInvalido = false, fallo = false;
		
		ran = rnd.nextInt(10) + 1;
		
		System.out.print("Introduzca un número: ");
		
		do{
			do{
				try{
					num = entrada.nextInt();
					numInvalido = false;					
				}
				catch(java.util.InputMismatchException a){					
					entrada.next();
					if(fallo || (fallo && intentos < 3)){
						intentos--;
						if(intentos > 0)
							System.out.printf("Debes introducir un número (le quedan %d intentos): ", intentos);
					}
					fallo = true;
					numInvalido = true;
				}
			}while(numInvalido && intentos > 0);			
			
			intentos--;
			
			 if(num > ran && intentos > 0)
				System.out.printf("Inténtalo con un número MENOR... (quedan %d intentos): ", intentos);
			 else if (num < ran && intentos > 0)
				System.out.printf("Inténtalo con un número MAYOR... (quedan %d intentos): ", intentos);			
			
		}while(intentos > 0 && num != ran);		
		
		if(num == ran)
			System.out.println("¡¡¡PREMIO!!!");
		else
			System.out.println("\nHas fallado... El número correcto era " + ran);
		
	}

}
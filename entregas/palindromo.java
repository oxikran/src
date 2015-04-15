import java.util.Scanner;
public class palindromo {

	public static void main(String[] args) {
	String palindromo,reverso= "";
	int tamaño,i;
	Scanner entrada = new Scanner(System.in);
	System.out.println("Introduce una frase:");
	palindromo = entrada.nextLine();
	entrada.close();
	palindromo = palindromo.replace(" ", "");
	palindromo = palindromo.toLowerCase();
	tamaño = palindromo.length()-1;
	for(i=tamaño;i >=0;i--){
		reverso= reverso + palindromo.charAt(i);
		}
	if (palindromo.equals(reverso)){
		System.out.println("Es palindromo");
	}
	else{
		System.out.println("No es palindromo");
	}
	}

}

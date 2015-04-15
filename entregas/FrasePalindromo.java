import java.util.Scanner;;
public class FrasePalindromo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String frase, fraseLimpia = "";
		char tablaFrase [], tablaEspeciales [];
		tablaEspeciales = " .,-\'\"¿?ªº!·$%&/()=*^`ç¨:_´{}+@#|¬\\¡![]".toCharArray();
		char letra;
		boolean esPalindromo = true, esEspecial = false;
		int i,j;
		
		System.out.println("Introduce una frase para saber si es un políndromo: ");
		frase = entrada.nextLine();
	
		for(i = 0; i < frase.length(); i++){
			for(j=0; j< tablaEspeciales.length; j++){
				if(frase.charAt(i) == tablaEspeciales[j])
					esEspecial = true;
			}
			if (esEspecial == false){
				letra = Character.toUpperCase(frase.charAt(i));
				switch(letra){
					case 'Á':
						letra = 'A';
						break;
					case 'É':
						letra = 'E';
						break;
					case 'Í':
						letra = 'I';
						break;
					case 'Ó':
						letra = 'O';
						break;
					case 'Ú':
						letra = 'U';
						break;
				}
				fraseLimpia = fraseLimpia + letra;
			}
			else
				esEspecial = false;
		}
		
		tablaFrase = fraseLimpia.toCharArray();
		j = tablaFrase.length - 1;
		
		for (i = 0; i < tablaFrase.length; i++){
				if(tablaFrase[i] != tablaFrase[j]){
					esPalindromo = false;
					break;
				}
				j = j -1;			
		}
		if(esPalindromo)
			System.out.println("La frase es un Palíndromo");
		else
			System.out.println("La frase no es un Palíndromo");

	}

}

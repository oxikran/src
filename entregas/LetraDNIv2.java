import java.util.Scanner;
public class LetraDNIv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//Definimos las variables
	Scanner kb = new Scanner(System.in);
	char lfa, lfb;                  						    //Usaremos lfa(letrafinal-a) y lfb para comparar la letra del usuario con la de la operación.
	int x, resto; 							                    //x se usará como contador.
	String letrasdni, dni;										//dni será utilizado para leer el dni completo y letrasdni para guardar las letras en orden.
	StringBuffer dnisb;							                //dnisb será donde se guarde el numero de dni separado de la letra para luego pasar su valor a x.
	dnisb = new StringBuffer();
	letrasdni = "TRWAGMYFPDXBNJZSQVHLCKE";	
	
	//Solicitamos al usuario el número de DNI.String letrafinal
	
	System.out.print("Por favor escriba su DNI con letra en mayúscula: ");
	dni = kb.nextLine();
	
	//Comenzamos el Algoritmo.
	
		if(dni.length()==9){
			
			for(x=0;x<dni.length()-1;x++){           //Añade los números de dni al SB dniop.
				dnisb.append(dni.charAt(x));
			}
			
		//Antes de ver si todo está correcto debemos pasar los datos de las letras al mismo tipo de variable.
			
			resto = Integer.parseInt(dnisb.toString())%23;     //Necesitamos el resto de la funcion Integer.parseInt() para pasar los datos de dnisb(como string) a numero y poder operar con ello.
			lfa = dni.charAt(x);               		    	 	//Aqui cogemos el carácter final de dni (la letra) y lo ponermos lfa.
			lfb = letrasdni.charAt(resto);						//Cogemos la letra correspondiente al resto de la division y la guardamos en lfb.
			
			if(lfa==lfb){
				
				System.out.print("El DNI introducido es correcto.");
			
			}
			
			else{
				System.out.print("El número o la letra del DNI son incorrectos.");
			}
		}
	
		else{
		
		System.out.print("Ha introducido un número incorrecto de caractéres.");
		
		}
		
		kb.close();
	
	}

}
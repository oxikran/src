import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numero, i, cuanta=0, k, p=0;
		boolean cero=false;
		int[] entrada, necesaria = null ;
		String[] aux, total = null;
		String auxiliar;
		Scanner nj= new Scanner(System.in);
		{
		numero= nj.nextInt();
		auxiliar= Integer.toString(numero);
		aux = auxiliar.split(" ");
		numero=0;
		
		for(i=0; i<aux.length;i++){
			if(aux[i]== "0"){
				 cero = true;
			}else{
				for(k=0;k<aux.length;k++){
				if(aux[i]==aux[k]){
					cuanta ++;
				}
			}
			}
			necesaria[numero]=cuanta;
			for(k=0;k<aux.length; k++){
				if(total[i] != aux[k] ){
					total[p]=aux[k];
					p++;
				}
			}
			numero++;
			
		}
		}while(cero=false);
		
		for(i=0;i<aux.length;i++){
			System.out.println(aux[i]+" "+ necesaria[i]);
		}
	}

}

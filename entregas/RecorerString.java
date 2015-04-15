import java.util.Scanner;


public class RecorerString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pos;
		String estrim;
		char act;
		
		Scanner entrada = new Scanner (System.in);
		
		estrim = entrada.nextLine();
		
		
		
		for (pos=0; pos< estrim.length(); pos++){
			act=estrim.charAt(pos);
			System.out.printf("%c : %d \n",act, (int)act);
		}
		
	}

}

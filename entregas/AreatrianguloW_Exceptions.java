import java.util.EmptyStackException;
import java.util.Scanner;


public class AreatrianguloW_Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		double a,b,c,area=-1.1;
		boolean valido=true;
		a=entrada.nextDouble();
		b=entrada.nextDouble();
		c=entrada.nextDouble();
		try{
			area=areaTriangulo(a,b,c);
		}
		catch(EmptyStackException e){
			System.out.println("Triangulo no Válido");
			valido=false;
		}
		finally{
			entrada.close();
			if(valido==true){System.out.println("El area es: "+area);}
			else{System.out.println("No ha sido posible completar la operacion");}
			
		}
		
	}
	
	public static double areaTriangulo(double a, double b, double c){
		double SP,areaPrev, a1,b1,c1,area;
		SP=(a+b+c)/2;
		//sp=a+b+c;
		//sp=sp/2;
		a1=SP-a;
		b1=SP-b;
		c1=SP-c;
		areaPrev= SP*a1*b1*c1;
		if(areaPrev<0){
			throw new EmptyStackException();
		}
		area=Math.sqrt(areaPrev);
		return area;
	}

}

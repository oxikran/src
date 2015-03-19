
import java.lang.Math;

public class calculadora {
	private int num1;
	private int num2;
	
	public calculadora (int a, int b){
			num1 = a;
			num2 = b;
	}
	
	public int suma (){
		int result = num1 + num2;
		return result;
	}
	
	public int resta (){
		int result;
		if (mayor ())
				result = num1 - num2;
		else
				result = num2 - num1;
		return result;
	}
	
	public boolean mayor (){
		if (num1 >= num2) return true;
		else 			  return false;
	}
	
	public int multiplica (){
		int result = num1 * num2;
		return result;
	}
	
	public int divide (){
			int result = num1 / num2;
			return result;
		}
	
	
//Por simplificar supondremos que la base de la potencia es num1 y el exponente num2
	public int potencia (){
		int result = (int) Math.pow(num1, num2);
		return result;
	}
	
//Por simplificar supondremos que el número del cual se va a calcular la raíz es num1
	public int raiz (){
		if (num1<1){
			throw new ArithmeticException("ERROR: No existe raíz para este número.");
		}else{
			int result = (int) Math.sqrt(num1);
			return result;
		}
	}	
}

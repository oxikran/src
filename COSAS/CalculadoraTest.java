import static org.junit.Assert.*;

import java.util.Arrays;

import java.util.Collection;

import org.junit.Test;

import org.junit.runners.Parameterized.Parameters;

public class CalculadoraTest {

	@Test
		public void test_raiz() {
			
			calculadora calc= new calculadora (1, 1 );
			int result= calc.raiz();
			assertEquals(1 , result);
			
		}
		@Test
		public void test_potencia(){
			calculadora calcu = new calculadora(2,2);
			int resultado= calcu.potencia();
			assertEquals (4, result);
		}
		 @Parameters
		  public static Collection<Object[]> data() {
		    Object[][] data = new Object[][] 
		    		{{12,2,144},
		    		 {5,7,78125}, 
		    		 {1,9,52},
		    		 {4,8,9} };
		    
		    return Arrays.asList(data);
		}

	}
	
	


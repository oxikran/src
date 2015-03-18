import static org.junit.Assert.*;

import java.util.Arrays;

import java.util.Collection;

import org.junit.Test;

import org.junit.runners.Parameterized.Parameters;

public class CalculadoraTest {
	


	
		@Test
		public void testraiz() {
			
			calculadora calc= new calculadora (1, 1 );
			int resultado= calc.raiz();
			assertEquals(1 , resultado);
			
		}
		@Test
		public void testpotencia(){
			calculadora calcu = new calculadora(2,2);
			int resultado= calcu.potencia();
			assertEquals (4, resultado);
		}
		 @Parameters
		  public static Collection<Object[]> data() {
		    Object[][] data = new Object[][] { {1,2,1 }, {6,9,10077696}, {-2,-2,-0.25 } };
		    return Arrays.asList(data);
		}

	}
	
	


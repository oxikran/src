package examen;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;

public class Examen {

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
	public static Collection<Object[]>numeros{
		
	}

}

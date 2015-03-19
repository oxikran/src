package examen;

import static org.junit.Assert.*;

import org.junit.Test;


public class CalculadoraTest {

	@Test
	public void testSuma() {
		Calculadora calc = new Calculadora (20 , 10);
		int resultado= calc.suma();
		assertEquals(30 , resultado);	}

	@Test
	public void testResta() {
		Calculadora calc = new Calculadora (20 , 10);
		int resultado= calc.resta();
		assertEquals(10 , resultado);
	}

	@Test
	public void testMultiplica() {
		Calculadora calc = new Calculadora (20 , 50);
		int resultado= calc.multiplica();
		assertEquals("fallo en la multiplicacion: " , 200 , resultado);
	}

	@Test
	public void testDivide() {
		Calculadora calc = new Calculadora (20 , 0);
		int resultado= calc.divide();
		assertEquals(2 , resultado);
	}

	
	}


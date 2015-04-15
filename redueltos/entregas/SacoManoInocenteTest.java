package pruebas;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dam.SacoManoInocente;

public class SacoManoInocenteTest {
	
	private static SacoManoInocente SACO_VACIO;
	private static SacoManoInocente SACO;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		SACO_VACIO = new SacoManoInocente();
		SACO = new SacoManoInocente();
		int i;
		for(i = 0; i < 10; i++)
			SACO.meter("Joyce" + i);
	}

	@After
	public void tearDown() throws Exception {
		SACO = null;
		SACO_VACIO = null;
	}
	
	@Test
	public void testMeterString() {
		SacoManoInocente sacoLleno = new SacoManoInocente();
		int i;
		for(i = 0; i < 10; i++)
			sacoLleno.meter(SACO.sacar());
		assertEquals(SACO, sacoLleno);
	}
	
	@Test
	public void estaVacio(){
		SacoManoInocente saco2 = new SacoManoInocente();
		assertEquals(SACO_VACIO, saco2);
	}

	@Test
	public void testSacarMasValores() {
		SACO.sacar(1000);
		assertEquals(SACO_VACIO, SACO);
	}
}

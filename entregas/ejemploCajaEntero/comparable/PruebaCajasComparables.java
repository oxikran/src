package pruebas;

import java.util.ArrayList;
import java.util.Collections;

import ejemplosHerencia.comparable.CajaEntero;
import ejemplosHerencia.comparable.CajaModificable;

public class PruebaCajasComparables {
	public static void main(String[] args) {
		CajaEntero prueba = new CajaEntero(4);
 CajaEntero prueba1 = new CajaEntero(4);
 CajaEntero prueba2 = new CajaEntero(2);
 CajaEntero prueba3 = new CajaEntero(7);
 ArrayList<CajaEntero> l = new ArrayList<CajaEntero>();
 l.add(prueba1);
 l.add(prueba2);
 l.add(new CajaModificable(5));
 l.add(prueba3);
 System.out.println(l);
 Collections.sort(l);
 System.out.println(l);
 
 System.out.println("-------------------------");
 System.out.println(prueba.compareTo(prueba1));
 System.out.println(prueba.compareTo(prueba2));
 System.out.println(prueba.compareTo(prueba3));
	}
}

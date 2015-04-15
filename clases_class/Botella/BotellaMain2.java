package deClase;

import java.util.Scanner;


public class BotellaMain2 {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		Botella b;
		double aux, capacidad;
		boolean estaAbierta;
		int respuesta = 0;
		b = new Botella(5);

		
		// Objeto menu
		Menu m=new Menu("Salir");
		
		
		m.añadir("Ver contenido de la botella");
		m.añadir("Cerrar la botella");
		m.añadir("Abrir la botella");
		m.añadir("Ver si está abierta o cerrada");
		m.añadir("Añadir líquido");
		m.añadir("Extraer líquido");
		do{			
			m.mostrar();
			respuesta=m.leer(entrada);
			switch(respuesta){
				case 1:
					System.out.println("El contenido de la botella en este momento es: " + b.getContenido());
					break;
				case 2:
					b.cerrar();
					System.out.println("Se ha cerrado la botella.");
					break;
				case 3:
					b.abrir();
					System.out.println("Se ha abierto la botella.");
					break;
				case 4:
					if(b.estaAbierta())
						System.out.println("La botella está abierta.");
					else
						System.out.println("La botella está cerrada.");
					break;
				case 5:				
					miAñadir(b);
					break;
				case 6:
					miExtraer(b);
			}
			
		}while(respuesta != m.ultimaOpcion());
		
		System.out.println("Fin del programa.");	
	}

	private static void miAñadir(Botella b) {
		double aux;
		try{
			System.out.print("¿Cuánto líquido quieres añadir?: ");
			aux = entrada.nextDouble();
			System.out.println("Ha rebosado " + b.añadir(aux) + 
					" litros de líquido añadido.\nLa botella contiene "
					+ b.getContenido() + " litros en este momento");
		}
		catch (RuntimeException e){
			System.out.println(e.getMessage());
		}		}

	private static void miExtraer(Botella b) {
		double aux;
		try{
			System.out.print("¿Cuánto líquido quieres extraer?: ");
			aux = entrada.nextDouble();
			System.out.println("Se han extraido " + b.extraer(aux) +
					" litros. Quedan " + b.getContenido() + " litros en la botella");
		}
		catch (RuntimeException e){
			System.out.println(e.getMessage());
		}	}

}

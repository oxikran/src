import java.util.Scanner;


public class LaBotella {

	public static void main(String[] args) {
		Botella b;
		double aux, capacidad;
		Scanner entrada = new Scanner(System.in);
		boolean estaAbierta;
		int respuesta = 0;
		
		System.out.print("Indica la capacidad total de la botella: ");
		capacidad = entrada.nextDouble();
		b = new Botella(capacidad);
		System.out.println("La capacidad de la botella ahora es de " + capacidad + " litros");
		
		System.out.print("---Menú---\n" +
				"Selecciona una opción:\n" +
				"1. Ver contenido de la botella\n" +
				"2. Cerrar la botella\n" +
				"3. Abrir la botella\n" +
				"4. Ver si está abierta o cerrada\n" +
				"5. Añadir líquido\n" +
				"6. Extraer líquido\n" +
				"7. Modificar la capacidad total de la botella\n" +
				"8. Ver capacidad total de la botella en este momento\n" +
				"9. Salir\n");
		do{			
			respuesta = entrada.nextInt();			
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
					estaAbierta = b.estaAbierta();
					if(estaAbierta)
						System.out.println("La botella está abierta.");
					else
						System.out.println("La botella está cerrada.");
					break;
				case 5:
					try{
						System.out.print("¿Cuánto líquido quieres añadir?: ");
						aux = entrada.nextDouble();
						System.out.println("Ha rebosado " + b.añadir(aux) + 
								" litros de líquido añadido.\nLa botella contiene "
								+ b.getContenido() + " litros en este momento");
					}
					catch (RuntimeException e){
						System.out.println(e.getMessage());
					}					
					break;
				case 6:
					try{
						System.out.print("¿Cuánto líquido quieres extraer?: ");
						aux = entrada.nextDouble();
						System.out.println("Se han extraido " + b.extraer(aux) +
								" litros. Quedan " + b.getContenido() + " litros en la botella");
					}
					catch (RuntimeException e){
						System.out.println(e.getMessage());
					}
					break;
				case 7:
					System.out.print("Indica la capacidad total de la botella: ");
					capacidad = entrada.nextDouble();
					b = new Botella(capacidad);
					System.out.println("La capacidad de la botella ahora es de " + capacidad + " litros");
					break;
				case 8:
					System.out.println("La capacidad total de la botella en este " +
							"momento es de " + capacidad + " litros");
			}
			
		}while(respuesta != 9);
		
		System.out.println("Fin del programa.");	
	}

}

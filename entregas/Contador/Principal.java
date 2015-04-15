

public class Principal {

	public static void main(String[] args) {
		//60.000 millis = 1 minuto
		
		boolean fin = false;
		int inicio = 0;
		String suich = new String();
		
		System.out.println("Inserte inicio del contador: ");
		inicio = Contador.teclado.nextInt();
		
		new Contador(inicio);
		
		do{
			System.out.println("1.- (I)ncrementar el contador");
			System.out.println("2.- (C)onsultar el contador");
			System.out.println("3.- (S)alir");
			
			suich = Contador.teclado.next();
			
			switch ( suich.charAt(0) ){
			
				case 'i'|'I': Contador.incrementar();
					break;
				
				case 'c'|'C': System.out.println("El contador vale ahora: "+Contador.getValor());
					break;
				case 's'|'S': fin = true;
					break;
			}
			
			
		}while (fin != true);
		
		System.out.println("FIN");
		System.out.println("El contador termino en: "+Contador.getValor());
	}

}

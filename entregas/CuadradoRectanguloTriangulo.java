import java.util.Scanner;
public class CuadradoRectanguloTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Definimos las variables
		int altura, base, espacio, sel, x, y, z;
		Scanner kb = new Scanner(System.in);
		System.out.println("Opción 1: Cuadrado");
		System.out.println("Opción 2: Rectágulo");
		System.out.println("Opción 3: Triángulo");
		System.out.print("¿Cuál es su opción? (Escriba el número) ");
		sel = kb.nextInt();
		if(sel==1||sel==2){
			if(sel==1){
			System.out.print("¿Qué valor quiere asignar al lado del cuadrado? ");
			altura = kb.nextInt();
			base = altura;
			}
			else{
			System.out.print("¿Qué valor quiere asignar a la altura del rectángulo? ");
			altura = kb.nextInt();
			System.out.print("¿Qué valor quiere asignar a la base del rectángulo? ");
			base = kb.nextInt();
			}
			for (x=0;x<altura;x++){
				for (y=0;y<base;y++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else if(sel==3){
			System.out.print("¿Cuál es la altura del triángulo? ");
			altura = kb.nextInt();
			//Comenzamos el bucle
			for(x=1;x<=altura;x++){
				espacio = altura - x;
				for(y=1;y<=espacio;y++){
					System.out.print(' ');	
				}
				for(z=1;z<=2*x-1;z++){ //x*2-1 es el incremento de asteriscos en la base
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else{
			System.err.print("Ha puesto un valor erroneo.");
		}
		kb.close();
	}

}

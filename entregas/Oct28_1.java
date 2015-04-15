package arrays.pro;

public class Oct28_1 {

	public static void main(String[] args) {
		// 2º: Dada una tabla que contiene la secuencia de precios de la energia electrica,
		// averiguar el incremento mayor de precios y mostrar en que lugar ocurre.
		int i;
		double maximoIncremento = 0.0;
		double minimoDecremento = Double.POSITIVE_INFINITY;
		int[] pos = new int[2];
		
		 final double[] PRECIOS = { 0.124107, 0.124254, 0.126585, 0.127541,
		 0.131021, 0.133254, 0.133180, 0.175681, 0.156214, 0.158521, 0.165487,
		 0.164021, 0.175427 };
		 
		/*
		 * Da un resultado erroneo al operar 0.087584 - 0.087484
		 * final double[] PRECIOS = { 0.175427, 0.087484, 0.087584 };
		 */

		for (i = 0; i < PRECIOS.length - 1; i++) {
			if(maximoIncremento < PRECIOS[i + 1] - PRECIOS[i]){
				//System.out.println("T " + (PRECIOS[i + 1] - PRECIOS[i]));
				maximoIncremento = PRECIOS[i + 1] - PRECIOS[i];
				//System.out.println("R " + maximoIncremento);
				pos[0] = i;
				pos[1] = i + 1;
			}
		}
		if (maximoIncremento == 0.0) {
			for (i = 0; i < PRECIOS.length - 1; i++) {
				if(minimoDecremento > PRECIOS[i] - PRECIOS[i+1]){
					minimoDecremento = PRECIOS[i] - PRECIOS[i+1];
					pos[0] = i;
					pos[1] = i + 1;
				}
			}
			System.out.println("El mínimo decremento es de " + (double) Math.round(minimoDecremento * 1000000)/ 1000000 + "€.");
		} else{
			System.out.println("El máximo incremento es de " + (double) Math.round(maximoIncremento * 1000000)/ 1000000 + "€.");
		}
		System.out.println("Ocurre entre los índices " + (pos[0] + 1) + "(" + PRECIOS[pos[0]] + "€) y " + (pos[1] + 1) + "(" + PRECIOS[pos[1]] + "€).");
	}

}

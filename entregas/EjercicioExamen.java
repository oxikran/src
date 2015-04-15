package examenes;

public class EjercicioExamen {
	static void reproducir(char[] a, char[] b, StringBuffer ab){
		for (int i = 0; i< a.length; i++){
			double r= Math.random();
			if (r<0.5)
				ab.append(a[i]);
			else
				ab.append(b[i]);
		}
	 }
		public static void main(String[] args) {
			/*String[] patata= {"a","b","c","d","e","f","g","h","i","j"};
			System.err.println(ganadores(patata, 3));*/
			char[] a = {'a','b','c','c','a','b','b','a'};
			char[] b = {'b','c','a','c','b','a','c','b'};
			StringBuffer ab= new StringBuffer();
			reproducir(a, b, ab);
			System.out.println(ab);
	}
}
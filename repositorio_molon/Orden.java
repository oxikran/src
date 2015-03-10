package repositorio_molon;

public class Orden {
	public static comparable ElMenor(Comparable a,Comparable b){
		if(a.compareTo(b)>0){
			return b;
		}
		else{
			return a;
		}
	}
}

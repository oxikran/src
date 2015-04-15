package Clase;

public class Tranvia {
	private VagonPasajeros[] tren;
	
	public Tranvia() {
		tren = new VagonPasajeros[4];
	}
	public Tranvia(int tamaño){
		tren = new VagonPasajeros[tamaño];
	}
	public Pasajero bajar(String nombre, int vagon){
		return tren[vagon-1].bajar(nombre);
	}
	public int subir(Pasajero p, int vagon){
		boolean logrado = false;
		int numvagon = vagon;
		if (vagon <= tren.length){
			while (!logrado && numvagon < tren.length){
				try{
					tren[numvagon-1].subir(p);
					logrado = true;
				}
				catch(RuntimeException e){
					numvagon++;
				}
			}
			if (!logrado){
				numvagon = 1;
				while (!logrado && numvagon < vagon){
					try{
						tren[numvagon-1].subir(p);
					}
					catch(RuntimeException e){
						numvagon++;
					}
				}
			}
			if (logrado)
				return numvagon;
			else
				throw new RuntimeException ("Todos los vagones están llenos");
		}
		else{
			throw new RuntimeException ("Ese vagon no existe");
		}
	}
}

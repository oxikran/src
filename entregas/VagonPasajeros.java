package Clase;

public class VagonPasajeros {
	private Pasajero[] asientos;
	private int numAsi = 0;
	
	public VagonPasajeros(int tam) {
		asientos= new Pasajero[tam];
	}
	public void subir (Pasajero pasajero){
		if (numAsi <= asientos.length){
			numAsi++;
			asientos[numAsi-1] = pasajero;
		}
		else {
			throw new RuntimeException ("El vagon está lleno");
		}
	}
	public Pasajero bajar (String nombre){
		boolean encontrado = false;
		int i = 0;
		Pasajero aux;
		while (!encontrado && i <= asientos.length){
			if (asientos[i].getNombre() == nombre){
				encontrado = true;
			}
			i++;
		}
		if (encontrado){
			aux = asientos[i-1];
			asientos[i-1] = asientos[numAsi];
			numAsi--;
			return aux;
		}
		else{
			return null;
		}
	}
}

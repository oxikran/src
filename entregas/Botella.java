package Objetos;
import javax.management.RuntimeErrorException;

public class Botella {
	private double cantidad = 0.0;
	private double capacidadMax;
	private boolean estaAbierta = true;
	private boolean estaFull = false;

	public Botella(double a) {
		try {
			capacidadMax = a;
		} catch (RuntimeException e) {
			System.out.println(e);
		}
	}
	public Botella() {
		try {
			capacidadMax = 8.0;
		} catch (RuntimeException e) {
			System.out.println(e);
		}
	}

	public double addLiquido(double a) {
		double liquidoAñadido=0;
		if (a<0){
			throw new RuntimeErrorException(null, "Valor negativo: "+a);
		}
		try {
			liquidoAñadido = a;
		
		if (estaAbierta == true && estaFull == false) {
			if ((liquidoAñadido + cantidad) < capacidadMax) {
				liquidoAñadido = cantidad + liquidoAñadido;
				cantidad = liquidoAñadido;
			} else if (liquidoAñadido + cantidad > capacidadMax) {
				liquidoAñadido = capacidadMax-cantidad;
				cantidad = capacidadMax;
			} else if (liquidoAñadido + cantidad == capacidadMax){
				liquidoAñadido = a;
				cantidad = capacidadMax;
			}
		}else {
			liquidoAñadido = 0;
		}
		}catch (RuntimeException e ){
			System.out.println("Error"+ e);
		}
		return liquidoAñadido;
	}

	public double extraer(double a) {
		double cantidadExtraida;
		cantidadExtraida = a;
		if (estaAbierta == true) {
			if (cantidadExtraida <= cantidad) {
				cantidad = cantidad - cantidadExtraida;
			} else {
				cantidadExtraida = cantidad;
				cantidad = 0;
			}
		} else {
			cantidadExtraida = 0;
		}
		return cantidadExtraida;
	}

	public double getContenido() {
		return cantidad;
	}

	public boolean estaAbierta() {
		return estaAbierta;
	}

	public void abrir() {
		estaAbierta = true;
	}

	public void cerra() {
		estaAbierta = false;
	}
	public double capacidad() {
		return capacidadMax;
	}
}

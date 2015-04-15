package deClase;

import org.w3c.dom.ranges.RangeException;

public class Botella {
	private double capacidad, contenido;
	private boolean estaCerrada;
	
	public Botella(double capacidad){
		if(capacidad<=0){
			throw new RuntimeException("La capacidad debe ser mayor que 0.");
		}
		this.capacidad = capacidad;
		contenido = 0;
		estaCerrada = false;
	}
	
	public double añadir(double c){
		double aux;
		if(c<0)
			throw new RuntimeException("Valor negativo: "+c);
		if(!estaCerrada){
			aux = contenido + c;
			if(aux>capacidad){
				contenido=capacidad;
				c=aux-capacidad;
			}
			else {
				contenido=aux;
				c=0;
			}
		}
		return c;
	}
	public double extraer(double e){
		double aux;
		if(e<0)
			throw new RuntimeException("Valor negativo: "+e);
		
		if(!estaCerrada){
			aux = contenido - e;
			if(aux<0){
				e=contenido;
				contenido=0;
			}
			else
				contenido=aux;
		}
		else
			e=0;
		return e;
	}
	public void abrir(){
		estaCerrada = false;
	}
	public void cerrar(){
		estaCerrada = true;
	}
	public boolean estaAbierta(){
		return !estaCerrada;
	}
	public double getContenido(){
		return contenido;
	}
}
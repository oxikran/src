package Oxikran.figuras;

import java.awt.Graphics;
import java.awt.Color;

public class ROMBO extends Figura {
	protected int Dr, dr;
	public ROMBO(int a, int b, int c, int d) {
		
		super(a, b);
		Dr=c;
		dr=d;
		
	}


	public float area() {return Dr*dr/2;}

	
	public float perimetro() {
		double l;
		l=Math.sqrt(Math.pow(Dr, 2)+Math.pow(dr, 2)/2);
		return (float) Math.rint(4*l);}

	
	public int alto() {
		
		return Dr;
	}

	
	public int ancho() {
		// TODO Auto-generated method stub
		return dr;
	}


	public void dibujar(Graphics g) {
		Color cActual = g.getColor();
		int[] yPuntos ={posicion.y,
						posicion.y+dr, posicion.y, posicion.y-dr};
		int[] xPuntos = {posicion.x , posicion.x+Dr, posicion.x, posicion.x-Dr};
		
		
	}

}

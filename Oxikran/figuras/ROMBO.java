package Oxikran.figuras;

import java.awt.Graphics;
import java.awt.Color;

public class ROMBO extends Figura {
	protected int D, d;
	public ROMBO(int a, int b) {
		
		super(a, b);
		D=a;
		d=b;
		
	}


	public float area() {return D*d/2;}

	
	public float perimetro() {
		double l;
		l=Math.sqrt(Math.pow(D, 2)+Math.pow(d, 2));
		return (float) Math.rint(4*l);}

	
	public int alto() {
		
		return 0;
	}

	
	public int ancho() {
		// TODO Auto-generated method stub
		return 0;
	}


	public void dibujar(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}

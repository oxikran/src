package GabriMagic.figuras;

import java.awt.Graphics;

public class Rombo extends Figura{
	protected int ancho, alto;
	
	public Rombo(int a, int b, int D, int d) {
		super(a, b);
		alto =D;
		ancho=d;
	}

	@Override
	public float area() {
		return (ancho*alto)/2;
	}

	@Override
	public float perimetro() {
		return (float) (Math.sqrt(Math.pow(ancho,2)+Math.pow(alto,2))*4 );
	}

	@Override
	public int alto() {
		return 0;
	}

	@Override
	public int ancho() {
		return 0;
	}

	@Override
	public void dibujar(Graphics g) {
		
	}
	}


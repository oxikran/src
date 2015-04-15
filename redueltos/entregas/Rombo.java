package pizarrafiguras;

import java.awt.Color;
import java.awt.Graphics;

public class Rombo  extends Figura{
	protected int dmenor,dmayor;
	private int lado;
	public Rombo(int a, int b, int c, int d) {
			  super(a,b);
			   dmenor=c; dmayor=d; 

	}
	@Override
	public float area() {
		return ((dmenor*dmayor)/2);
	}
	@Override
	public float perimetro() {
		int l = (int)Math.sqrt(((int)Math.pow(dmenor/2, 2))+
				(int)Math.pow(dmayor/2, 2));
		lado= l;
		return l*4;
	}
	@Override
	public int alto() {
		return dmayor;
	}
	@Override
	public int ancho() {
		return dmenor;
	}
	@Override
	public void dibujar(Graphics g) {
		  Color cActual=g.getColor();
		  int[] yPuntos = {	posicion.y+dmayor,
				  			posicion.y,
				  			posicion.y-dmayor,
				  			posicion.y}; 
		  int[] xPuntos = {posicion.x,
				  			posicion.x-dmenor,
				  			posicion.x,
				  			posicion.x+dmenor};
		  g.drawPolygon(xPuntos, yPuntos, 4);
		  g.fillPolygon(xPuntos, yPuntos, 4);
		  g.setColor(Color.white);
		  g.setColor(cActual);
	}

}

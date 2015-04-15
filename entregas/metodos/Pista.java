import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Pista extends JFrame{
    CarreraMetodos.Punto[] tabla;
    int min, max;
	static final int meta=430;
	static final int anchoVentana=450;
	static final int altoVentana=110;
	static final int salida=0;
	
    Pista() {
    tabla=new CarreraMetodos.Punto[5]; 
        CarreraMetodos.preparadosListos(tabla);

		//valores de inicializacion de la ventana del programa.
		//*****************************************************
		setSize(anchoVentana,altoVentana);
		setResizable(false);
		setLocation(1,1);
		addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0); 
				}
			 });
        addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode()==27) 
						System.exit(0);
					min=minimo();	
					CarreraMetodos.avance(tabla);
					max=maximo();
					// redibujar la zona en la que se encuentran los puntos.
					// ****************************************************
					repaint(min,tabla[0].y, max-min+1, tabla[tabla.length-1].y
													  +tabla[tabla.length-1].diametro
													  -tabla[0].y+1);
				}
		      });
	// hace visible la ventana.
        setVisible(true);
	}

	private int minimo() { 
		// busca el punto mas retrasado.
		// *****************************
		int resulta= tabla[0].x;
		for(int i=1;i<tabla.length; i++)
		  if(tabla[i].x<resulta)
	    	resulta=tabla[i].x;
	    return resulta;
	}
	
	private int maximo() { 
		// busca la coordenada final del punto mas aventajado.
		// **************************************************
		int resulta= tabla[0].x+tabla[0].diametro;
		for(int i=1;i<tabla.length; i++)
		  if(resulta < tabla[i].x+tabla[i].diametro)
	    	resulta=tabla[i].x+tabla[i].diametro;
	    if(resulta>meta)
	    	resulta=anchoVentana;
	    return resulta;
	}


    public void paint(Graphics g) {
		super.paint(g);
		g.drawLine(meta,0,meta,altoVentana);

		// dibuja en cada momento los puntos en liza segun sus propios atributos
		// *********************************************************************
		for(int i=0;i<5; i++) 
		    g.drawOval(	tabla[i].x, tabla[i].y,
		    			tabla[i].diametro, tabla[i].diametro);
    }
};







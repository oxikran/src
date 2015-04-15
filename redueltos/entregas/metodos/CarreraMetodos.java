
import java.lang.Math.*;

public class CarreraMetodos {

    public static void main(String[] args) {
  		new Pista();
    }

    // Clase que describe como es cada punto
    // *************************************
    public static class Punto {
    	int diametro;
    	int x,y;
  	  // Hace avanzar su coordenada x hasta la meta un número
  	  // de posiciones al azar, entre 0 y potencia-1. Y dice
  	  // de si avanza, o no avanza por haber llegado a su fin
  	  boolean avanzar(int potencia) { 
    		boolean aunNoHaLlegado;
    
    		if(x+diametro<430) {
    			x+=(int)(potencia*Math.random());
    			aunNoHaLlegado=true;
    		}
    		else {
    			x=432;
    			aunNoHaLlegado=false;
    		}
    		return aunNoHaLlegado;
  	  }
    };
	
	// Recibe un objeto tabla de Puntos vacia para que aqui se creen
	// los cinco objetos tipo Punto, inicializados con las posiciones 
	// de salida, y distintos tamaños
	// **************************************************************
    public static void preparadosListos(Punto[] competidores) {
		for(int i=0; i<competidores.length; i++) {
			competidores[i]=new Punto();
			competidores[i].diametro=5+i*2;
			competidores[i].x=80-competidores[i].diametro; // para alinearles la parte derecha.
			competidores[i].y=30+i*15;
		}
    }

    public static void avance(Punto[] competidores) {
	// avance de puntos incrementando su coordenada x.
		for(int i=0;i<competidores.length; i++) 
      competidores[i].avanzar(50);
    }
};


package SegundoTrimestre.ViajerosAlTren;

import java.util.ArrayList;


public class Tranvia {
    
    private ArrayList<VagonPasajeros> tablaVagones;
    private int numVag = 0;
    
    public Tranvia(int numVagones){
         tablaVagones = new ArrayList<VagonPasajeros>(numVagones);
         numVag = numVagones;
         
    }
   
    
    public Pasajeros bajar(String nombre, int vagon){
      
     Pasajeros aux = new Pasajeros();
     try{
       for(int i=0; i<tablaVagones.get(vagon-1).numOcupados; i++)
       {
             if(tablaVagones.get(vagon-1).tablaAsientos.get(i).getNombre().equals(nombre))
             {
                 aux = tablaVagones.get(vagon-1).tablaAsientos.get(i);
                 tablaVagones.get(vagon-1).tablaAsientos.remove(i);
                 return aux;
             }
       }
       //No encontrado el pasajero en cuestion
       return aux; //Si ha llegado hasta aqui es que no se ha encontrado, por lo tanto nunca llegamos a asignar
                   //valores al objeto 'aux', devolvemos un objeto vacio del tipo 'Pasajeros'
       //
     } catch(RuntimeException e){System.out.println("Solo se permiten strings como nombres y enteros como numero de vagon.");}
    return aux ;
    }
    
    
    public int subir(Pasajeros p, int vagon){
  
       //Variables auxiliares
       int vagon_actual = vagon;
       boolean pasajero_posicionado = false;
       ArrayList<Integer> vagones_recorridos = new ArrayList<Integer>(numVag);
       //
       //Vagón existe?
       try{
        if(!(vagon < 1 || vagon > numVag))
        {
           //Nada
        }
       } catch(RuntimeException e){System.out.println("El vagon no existe.");}
       //
       try{
           
           while(!pasajero_posicionado)
           {
              //Selección de nuestro vagón candidato y comprobaciones varias
              if((tablaVagones.get(vagon_actual-1).numOcupados == tablaVagones.get(vagon_actual-1).maxNumOcupados && vagones_recorridos.indexOf(vagon_actual) != -1)){
               if(vagon_actual != numVag)
               {
                   vagones_recorridos.add(vagon_actual);
                   vagon_actual++;
               }
               else
               {
                   vagones_recorridos.add(vagon_actual);
                   vagon_actual=1;
               }
              }
              try
              {
              if(!(vagones_recorridos.size() == numVag))
              {
                   //Devolvemos -1 para saber que el pasajero no ha sido posicionado y
                   //hemos recorrido todos los vagones (que estan llenos)
                 
              }
              } catch(RuntimeException e){System.out.println("No se pudo situar al pasajero. (Todos los vagones estaban llenos)");}
              //
              
              //Añadir el pasajero al vagón candidato              
              tablaVagones.get(vagon_actual-1).subir(p);                      
              //
              
              //Retornar vagón al que se subió
              return vagon_actual;
              //
           } 
         } catch(RuntimeException e){System.out.println("No se pudo subir al pasajero.");}
       
       return vagon_actual;
    }    
}

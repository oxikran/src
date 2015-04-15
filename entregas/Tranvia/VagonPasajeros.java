
package SegundoTrimestre.ViajerosAlTren;

import java.util.ArrayList;


public class VagonPasajeros {
    public ArrayList<Pasajeros> tablaAsientos;
    public int numOcupados = 0;
    public int maxNumOcupados = 0;
    
   public void VagonPasajeros(int capacidad){
      tablaAsientos = new ArrayList<Pasajeros>(capacidad);
      maxNumOcupados = capacidad;
           
   } 
   
   public void subir(Pasajeros pasajero){

       try{         
           if(numOcupados != maxNumOcupados){
              tablaAsientos.add(pasajero);
              numOcupados++;
                }            
         } catch(RuntimeException e){ System.out.println("No se pudo subir al pasajero, el vagon esta lleno.");}
   }
   
   
   public Pasajeros bajar(String nombre){

     Pasajeros aux = new Pasajeros();
     try{
         for(int i=0; i<numOcupados; i++)
         {
             if(tablaAsientos.get(i).getNombre().equals(nombre))
             {
                 aux = tablaAsientos.get(i);
                 tablaAsientos.remove(i);
                 numOcupados--;
                 return aux;
             }
         }
     } catch(RuntimeException e){System.out.println("Solo se permiten strings como parametro.");}
   return aux;
   }   
   
}


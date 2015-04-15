/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegundoTrimestre;

/**
 *
 * @author p4pu
 */
public class MainBotella {
    
    
     public static void main(String[] args) { //funcion main donde instacion la clase botella y trabajo con el objeto Lanjaron
        double mi_capacidad_maxima = 50;
        Botella Lanjaron = new Botella(mi_capacidad_maxima);

        //Abro la botella.
         Lanjaron.Abrir();
        //estaAbierta?
        System.out.println("¿Está abierta? --> " + Lanjaron.estaAbierta()); 
        //Añado... 
        System.out.println(Lanjaron.Añadir(-30));
        //Saco...
        System.out.println(Lanjaron.Extraer(40));
        //Cierro...
        Lanjaron.Cerrar();
        //Muestro cantidad...
        System.out.println("La botella tiene ahora " + Lanjaron.GetContenido() + " litros y quedan " + Lanjaron.cuantoContenidoLibre() + " litros libres.");

    }
}

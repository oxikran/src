
package contenedores;

import java.util.Random;

public class CajaModificable extends CajaEntero2{
   
    
    public CajaModificable() {
    Random ram = new Random();
    x = ram.nextInt(10);	
    
    }
    
     
    
    public void Abrir(int num){
     estaCerrado = false;
     
    }
    
    public void Cerrar(){
    int aux;
    estaCerrado = true;
    Random ram = new Random();
    aux = ram.nextInt(10);
    }
    
  
    @Override
    public void setX(int valor){
       if(!estaCerrado){
         x = valor;        
}
}
    
    
}

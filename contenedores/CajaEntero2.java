
package contenedores;

public class CajaEntero2 {
    protected int x;
    protected boolean estaCerrado;
    protected boolean tieneValor;
    public CajaEntero2() {
    
    tieneValor = false;
    }
      
    public CajaEntero2(int valor) {
       x = valor;
       tieneValor = true;
}
        
        


public void getX(int num){ 
     System.out.println("La caja esta Cerrada");
if(!tieneValor){
    throw new RuntimeException("No tiene valor."); }
    }



public void setX(int valor){
    int contador = 0;
        if(!tieneValor && contador == 0){
         x = valor;
         contador++;
          } else {
    throw new RuntimeException("La caja tiene valor, o se ha llamado al menos 1 vez a la función");
}
}
}


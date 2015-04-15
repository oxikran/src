 

public class CajaEntero {
    private int x;
    private boolean estaCerrado;

    public int getX() {
        if(estaCerrado)
            throw new RuntimeException("está cerrada");
        return x;
    }

    public void setX(int n) {
        if(estaCerrado)
            throw new RuntimeException("está cerrada");
        x = n;
    }
    public void abrir(){
        estaCerrado=false;
    }
    public void cerrar(){
        estaCerrado=true;
    }
    
} 

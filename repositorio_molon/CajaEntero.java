package repositorio_molon;
/* setX (igual) pero tendra un constructor que recibira un valor inicial pero si caja esta cerrada no se variara
 * pero si se podra consultar abrir y cerrar delete 
 * otro constructor que no de valor a caja enetera la caja entera se puede modificar con set un valor si no se le ha puesto 
 * al inicio set solo se puede poner
 * lanza exepcion si no hay valor o si set x quiere cambiar el valor ya añadido*/

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
    
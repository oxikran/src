
public class Principal
{
    public static void main(String[] arg){
        CajaEntero x,y;
        x=new CajaEntero();
        x.setX(34);
        y=new CajaEntero();
        y.setX(14);
        y.cerrar();
        
        mostrar(x);
        mostrar(y);
        mostrar(suma(x,y));
        
    }
    
    public static void mostrar(CajaEntero c)
    {
        try{
        System.out.println("["+c.getX()+"]");
    } catch(NullPointerException e){
        throw e;
    } catch(RuntimeException e){
        System.out.println("[¿?]");
    }
    
    }
    public static CajaEntero suma(CajaEntero a, CajaEntero b)
    {
        CajaEntero aux=new CajaEntero();
        try{
        aux.setX(a.getX()+b.getX());
    } catch(RuntimeException e){
        aux=null;
    }
    return aux;
    }
}

package SegundoTrimestre;

public class Cola {

    
     char [] datos;
    int tam,cola,tope;
     

    public Cola() {
        datos = new char [tam+1];
        tope = 100;
        
    }

    public boolean vacia() {
        return tam == cola;
    }

    public boolean llena() {
        return tamanio() == tope - 1;
    }

    public void acolar(char num) {
        if (llena()) {
            System.out.println("Cola Llena! No se pudo adicionar.");
        } else {
            cola = (cola + 1);
            datos[cola] = num;
        }
    }

    public int desacolar() {
        int a = Integer.MIN_VALUE;
        if (vacia()) {
            System.out.println("Cola Vacia! No se pudo eliminar.");
        } else {
            tam = (tam + 1);
            a = datos[tam];
        }
        return a;
    }

    public int tamanio() {
        return (cola - tam);
    }

    
}
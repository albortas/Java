package prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println(" *** Ejemplo Aritmetica ***");
        //Creacion de objeto 1
        Aritmetica aritmetica1 = new Aritmetica(5,7);
        aritmetica1.setOperando1(9);
        aritmetica1.setOperando2(13);
        System.out.println("Valor Operando 1: " + aritmetica1.getOperando1());
        System.out.println("Valor Operando 2: " + aritmetica1.getOperando2());
        aritmetica1.sumar();
        aritmetica1.restar();
        //System.out.println("Dir. Memoria obj1: " + aritmetica1);
        System.out.println();
        //Creacion de objeto 2
        Aritmetica aritmetica2 = new Aritmetica(12,16);
        aritmetica2.sumar();
        //System.out.println("Dir. Memoria obj2: " + aritmetica2);
    }
}

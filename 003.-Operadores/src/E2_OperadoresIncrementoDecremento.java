public class E2_OperadoresIncrementoDecremento {
    public static void main(String[] args) {
        //Operadores Incremento
        int a = 0;
        //Operador pos-incremento
        System.out.println("Antes de incrementar: " + a);
        a++;
        System.out.println("Despues de incrementar (a++) " + a);
        //Operador pre-incremento
        a = 5;
        System.out.println("Antes de incrementar: " + a);
        ++a;
        System.out.println("Despues de incrementar (++a) " + a);
        
        
        //Operadores Decremento
        //Post-decremento
        a=10;
        System.out.println("Antes de decrementar: " + a);
        a--;
        System.out.println("Despues de decrementar (a--) " + a);
        a = 20;
        System.out.println("Antes de decrementar: " + a);
        --a;
        System.out.println("Despues de decrementar (--a) " + a);
        
    }
}

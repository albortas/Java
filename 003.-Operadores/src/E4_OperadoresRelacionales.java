public class E4_OperadoresRelacionales {
    public static void main(String[] args) {
        //Operadores Relacionales (comparacion)
        int a = 5, b= 6;
        System.out.println("Valor a: " + a);
        System.out.println("Valor b: " +b);
        //Operador igualdad
        boolean c = a == b;
        System.out.println("a igual que b?: " +c);
        //Operador distinto
        c = a != b;
        System.out.println("a distinto que b?: " +c);
        //Operador Mayor que
        c = a > b;
        System.out.println("a mayor que b?: " +c);
        //Operador Mayor o igual que
        c = a >= b;
        System.out.println("a mayor o igual que b?: " +c);
        //Operador menor que
        c = a < b;
        System.out.println("a menor que b?: " +c);
        //Operador menor o igual que
        c = a <= b;
        System.out.println("a menor o igual que b?: " +c);
    }
}

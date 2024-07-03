public class E5_OperadoresLogicos {
    public static void main(String[] args) {
        //Operadores Logicos
        boolean a = true;
        boolean b = false;
        System.out.println("Valor a: " +a);
        System.out.println("Valor b: " +b);
        // Operadores Logico && (and o Y)
        boolean c = a && b;
        System.out.println("Resultado operador and: " +c);
        // Operador Logico || (or o O)
        c = a || b;
        System.out.println("Resultado operador or: " +c);
        // Operador Logico ! (not o NO)
        c = !a;
        System.out.println("Resultado operador not: " +c);

    }
}

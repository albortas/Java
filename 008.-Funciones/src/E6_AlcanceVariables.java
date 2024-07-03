public class E6_AlcanceVariables {
    
    // Atributo de instancia de clase (objeto)
    int i = 5;
    // Atributo de la clase
    static int atributoClase = 10;

    public static void main(String[] args) {
        //Variables local al metodo main
        var variableLocal = 20;
        System.out.println("Variable local: " + variableLocal);
        System.out.println("Variable clase: " + atributoClase);
        System.out.println("Variable instacia (objeto): " + new E6_AlcanceVariables().i);
    }
}

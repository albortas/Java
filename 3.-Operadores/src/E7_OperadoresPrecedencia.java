public class E7_OperadoresPrecedencia {
    public static void main(String[] args) {
       /*Precedencia de Operadores en C
        1. Parentesis Y Corchetes
        2. Operadores unarios, como -, ++, --, !
        3. Aritmeticos *,/ y %
        4. Aritmeticos + y -
        5. Relacionales <, <=, > y >=
        6. Igualdad == y !=
        7. Logicos && y ||
        8. Asignacion =, =+, -=, *=, etc
        */

        //Ej. Se revisan de izquierda a derecha
        int a = 12 / 3 + 2 * 3 - 1;
        /*
        Paso 1. Division: 12 / 3 = 4
        Paso 2. Multiplicacion: 2 * 3 = 6
        Paso 3. Suma: 4 + 6 = 10
        Paso 4. Resta: 10 - 1 = 9
        */
        System.out.println("El Resultado es: " +a);
    }
}

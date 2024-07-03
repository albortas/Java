public class E1_CicloWhile {
    public static void main(String[] args) {
        int contador = 0, repeticiones = 5;
        while (contador < repeticiones) {
            System.out.println("Buenos dias..." + contador);
            contador++;
            // Condicion a evaluar
            var condicion = contador < repeticiones;
            System.out.println(contador + " < " + repeticiones + " -> " + condicion);
        }
    }
}

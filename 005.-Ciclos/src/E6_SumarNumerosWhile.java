public class E6_SumarNumerosWhile {
    public static void main(String[] args) {
        //Sumar los primeros 5 numeros con el ciclo While
        final int VALOR_MAXIMO = 5;
        int contador = 1, acumuladorSuma = 0;
        
        while (contador <= VALOR_MAXIMO) {
            System.out.print(acumuladorSuma + " + " + contador);            
            acumuladorSuma += contador++;
            System.out.println(" -> " + acumuladorSuma);
        }

    }
}

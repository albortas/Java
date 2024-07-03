public class E7_SumarNumerosDo {
    public static void main(String[] args) {
        //Sumar los primeros 5 numeros
        final int VALOR_MAXIMO = 5;
        int contador = 1, acumuladorSuma = 0;

        do{
            System.out.print(acumuladorSuma + " + " + contador);
            acumuladorSuma += contador++;
            System.out.println(" -> " + acumuladorSuma);
        } while (contador <= VALOR_MAXIMO);
    }
}

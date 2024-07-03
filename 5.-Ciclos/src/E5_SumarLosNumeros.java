public class E5_SumarLosNumeros {
    public static void main(String[] args) {
        int maximo = 5, acumuladorSuma = 0;
        for (int numero = 1; numero <= maximo; numero++){
            System.out.print(acumuladorSuma + " + " + numero);
            acumuladorSuma += numero;
            System.out.println(" = " + acumuladorSuma);
        }
    }
}

public class E5_NumeroTexto {
    public static void main(String[] args) {
        // Convertir numero a cadena
        int a = 10, b = 20;
        // Imprimir la suma
        System.out.println(a + b);
        // Convertir de numero a cadena
        System.out.println(String.valueOf(a) + Integer.toString(b));
        //Otra forma
        String resultado = String.format("%d %d", a, b);
        System.out.println(resultado);
    }
}

public class E2_SintaxisSimplificadaArreglos {

    public static void main(String[] args) {
        int[] enteros = {100, 200, 300, 400};
        System.out.println("Largo arreglo: " + enteros.length);
        for (int numero = 0; numero < enteros.length; numero++){
            System.out.println(numero + " -> " + enteros[numero]);
        }
        //for-each (for mejorado)
        System.out.println("For each (for mejorado)");
        for (var numero: enteros){
            System.out.println("Valor: " + numero);
        }
    }
}
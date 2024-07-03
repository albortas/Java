public class E1_DeclaracionArreglos {
    public static void main(String[] args) {
        //Declaracion de un Arreglo
        int[] enteros;
        //Reservamos espacio de memoria para el arreglo
        enteros = new int[5];
        //Modificar los valores de un arreglo
        enteros[0] = 13;
        enteros[1] = 21;
        enteros[4] = 62;

        //imprimir los valores
        for (int numero = 0; numero < 5; numero++){
            System.out.println(enteros[numero]);
            
            //System.out.println(enteros);
        }
    }
}

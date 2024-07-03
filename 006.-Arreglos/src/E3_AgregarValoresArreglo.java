import java.util.Scanner;

public class E3_AgregarValoresArreglo {

    public static void main(String[] args) {
        System.out.print("Proporcione el largo del arreglo: ");
        var consola = new Scanner(System.in);
        var largoArreglo = Integer.parseInt(consola.nextLine());
        //Creamos el arreglo de manera dinamica
        int[] enteros = new int[largoArreglo];

        //Solicitamos los valores
        System.out.println();
        for(int i = 0; i < largoArreglo; i++){
            System.out.print("Proporciona enteros [" + i + "] = ");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }
        System.out.println();

        //Imprimir los valores del arreglo
        System.out.println("Impresion del Arreglo");
        for( int i = 0; i < enteros.length; i ++){
            System.out.println("enteros[" + i + "] = " + enteros[i]);
        }
        consola.close();
    }
}
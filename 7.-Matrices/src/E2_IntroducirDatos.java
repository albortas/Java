import java.util.Scanner;

public class E2_IntroducirDatos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        int renglones,columnas;
        //Solicitamos los valores al usuario
        System.out.print("Proporciona los renglones: ");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Porporciona las columnas: ");
        columnas = Integer.parseInt(consola.nextLine());
        int[][] matriz = new int[renglones][columnas];


        //Solicitar los valores de la matriz
        System.out.println();
        for( int ren = 0; ren < renglones; ren ++){
            for(int col = 0; col < columnas; col++){
                System.out.print("Dato[" +ren +"][" +col+ "] = ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }
        
        //Iterar la matriz
        System.out.println();
        System.out.println("----------Iteramos la Matriz----------");
        for( int ren = 0; ren < renglones; ren ++){
            for(int col = 0; col < columnas; col++){
                System.out.print("Matriz[" + ren + "][" + col + "] = " + matriz[ren][col] + " ");
            }
            System.out.println();
        }
        consola.close();
    }
}

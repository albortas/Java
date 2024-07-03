import java.util.Scanner;

public class E3_SumaDiagonal {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Proporcione el tamaño de la matriz cuadrada: ");
        int tamanioMatriz = Integer.parseInt(consola.nextLine());
        int[][] matriz = new int[tamanioMatriz][tamanioMatriz];
        int sumaDiagonal = 0;
        
        //Llenado de la matriz
        System.out.println("\n### Llenar la matriz ###");
        for (int i = 0; i < tamanioMatriz; i++){
            for (int j = 0; j < tamanioMatriz; j++){
                System.out.print("Valor [" + i + "][" + j + "] = ");
                matriz[i][j] = Integer.parseInt(consola.nextLine());
            }
        }
        
        //Iterar la matriz
        System.out.println("\n --- Matriz --");
        for (int i = 0; i < tamanioMatriz; i++){
            for (int j = 0; j < tamanioMatriz; j++){
                System.out.print(matriz[i][j] + "\t");
                if (i == j){
                    sumaDiagonal += matriz[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("\nLa suma de la diagonal es: " + sumaDiagonal);
        consola.close();

    }
}

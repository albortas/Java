public class E1_Matrices {
    public static void main(String[] args) {
        //Definir constantes tamanio matriz
        final int RENGLONES = 2;
        final int COLUMNAS= 3;
        //Definimos la matriz

        //int[][] matriz = new int[RENGLONES][COLUMNAS];
        // Llenamos la matriz manualmente
        /* matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600; */

        //Definimos la matriz de forma simplificada
        int[][] matriz = {
            {100, 200, 300},
            {400, 500, 600}
        };

        //Iteramos la matriz
        System.out.println("--------Itermos la Matriz--------");
        for(int i = 0;i < RENGLONES; i++){
            for(int j= 0; j < COLUMNAS; j++){
                System.out.print("Matriz[" + i + "][" +j+ "] = " +matriz[i][j]+"    ");
            }
            System.out.println();
        }
    }
}

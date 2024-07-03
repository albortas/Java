import java.util.Scanner;

public class E4_PromedioCalificacion {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("--- Promedio de Calificaciones ---");
        System.out.print("Cuantas calificaciones desea agregar?: ");
        int largoArreglo = Integer.parseInt(consola.nextLine());
        double[] calificaciones = new double[largoArreglo];
        double sumaCalificaciones = 0;
        //Llenado del arreglo
        for (int i = 0; i < largoArreglo; i++){
            System.out.print("Calificacion [" + i + "] = ");
            calificaciones[i] = Double.parseDouble(consola.nextLine());
        }
        //Promedio de calificaciones
        for (int i = 0; i < largoArreglo; i++){
            sumaCalificaciones += calificaciones[i];
        }
        double promedio = sumaCalificaciones / largoArreglo;
        System.out.println("Promedio de calificaciones es: " + promedio);
        consola.close();
    }
}
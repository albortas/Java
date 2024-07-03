import java.util.Scanner;

public class E4_AlgoritmoDiaSemana {
    public static void main(String[] args) {
        System.out.print("Proporciona el dia de la semana: ");
        var consola = new Scanner(System.in);
        var diaSemana = Integer.parseInt(consola.nextLine());
        if (diaSemana == 1){
            System.out.println("Lunes");
        }else if (diaSemana == 2) {
            System.out.println("Martes");
        }else if (diaSemana == 3) {
            System.out.println("Miercoles");
        }else if (diaSemana == 4) {
            System.out.println("Jueves");
        }else if (diaSemana == 5) {
            System.out.println("Viernes");
        }else if (diaSemana == 6) {
            System.out.println("Sabado");
        }else if (diaSemana == 7) {
            System.out.println("Domingo");
        }else{
            System.out.println("Valor dia Erroneo: " + diaSemana);
        }
        consola.close();
    }
}

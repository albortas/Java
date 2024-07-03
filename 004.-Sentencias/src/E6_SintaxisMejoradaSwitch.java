import java.util.Scanner;

public class E6_SintaxisMejoradaSwitch {
    public static void main(String[] args) {
        System.out.println("Proporcione el dia de la semana: ");
        var consola = new Scanner(System.in);
        var diaSemana = Integer.parseInt(consola.nextLine());
        switch (diaSemana) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Dia Erroneo: " + diaSemana);
        }
        consola.close();
    }
}

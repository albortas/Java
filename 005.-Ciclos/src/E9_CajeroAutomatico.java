import java.util.Scanner;

public class E9_CajeroAutomatico {
    public static void main(String[] args) {
        double saldo = 1000.0;
        Scanner consola = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            System.out.print("""
                    -----Cajero Automatico-----
                    Menu:
                    1. Consular Saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Elige una opcion:\s """);
            int opcion = Integer.parseInt(consola.nextLine());
            switch (opcion) {
                case 1 -> System.out.println("Tu saldo actual es: " + saldo);
                case 2 ->{
                    System.out.print("Ingresa el monto a retirar: ");
                    var retiro = Double.parseDouble(consola.nextLine());
                    saldo -= retiro;
                    System.out.println("Tu nuevo saldo es: " + saldo);
                }
                case 3 -> {
                    System.out.print("Ingresa el monto a depositar: ");
                    var deposito = Double.parseDouble(consola.nextLine());
                    saldo += deposito;
                    System.out.println("Tu nuevo saldo es: " + saldo);
                }
                case 4 -> {
                    System.out.println("Hasta luego. Vuelva pronto");
                    salir = true;
                }
                default -> System.out.println("Opcion invalida");
            }
            System.out.println();
        }
        consola.close();
    }
}

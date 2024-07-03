import java.util.Scanner;

public class E8_MenuIterativo {
    public static void main(String[] args) {
        //Menu Iterativo
        System.out.println("-----Sistema de Administracion de Cuentas-----");
        boolean salir = false;
        Scanner consola = new Scanner(System.in);
        while (!salir) {
            System.out.print("""
                    Menu:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir del sistema
                    Escoger una opcion:\s""");
            int opcion = Integer.parseInt(consola.nextLine());
            switch (opcion){
                case 1 -> System.out.println("Creando tu cuenta...");
                case 2 -> System.out.println("Eliminando tu cuenta...");
                case 3 -> {
                    System.out.println("Saliendo del sistema. Hasta pronto");
                    salir = true;
                }
                default -> System.out.println("Opcion invalida: " + opcion);
                
            }
            System.out.println();
        }
        consola.close();
    }
}

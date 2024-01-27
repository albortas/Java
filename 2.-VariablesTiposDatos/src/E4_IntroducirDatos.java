import java.util.Scanner;

public class E4_IntroducirDatos {
    public static void main(String[] args) {
        //Crear un objeto de la clase Programa
        //IntroducirDatos objeto1 = new IntroducirDatos();

        // Clase Scanner para optener la entrada del usuario
        Scanner consola = new Scanner(System.in);
        

        // Leer un tipo de dato entero
        System.out.print("Proporciona un entero: ");
        //var entero = consola.nextInt();
        var entero = Integer.parseInt(consola.nextLine());
        System.out.println("Mi entero: " + entero);

        // Consumir el caracter de salto de linea debido a que nexInt no lo hizo
        //consola.nextLine();

        System.out.println("Proporciona una cadena: ");
        var cadena = consola.nextLine();
        System.out.println("Mi cadena: " + cadena);
    }
}

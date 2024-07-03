import java.util.Scanner;

public class E3_AlgoritmoMayorEdad {
    public static void main(String[] args) {
        final int EDAD_ADULTO = 18;
        System.out.print("Proporciona tu edad: ");
        var consola = new Scanner(System.in);
        int edad = Integer.parseInt(consola.nextLine());
        if (edad >= EDAD_ADULTO){
            System.out.println("Persona con edad: " + edad + " es un adulto");
        }else if (edad < 0){
            System.out.println("Edad Erronea");
        }
        else{
            System.out.println("Persona con edad: " + edad + " es menor de edad");
        }
        consola.close();
    }
}

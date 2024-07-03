import java.util.Scanner;

public class E7_CompararCadena {

    public static void main(String[] args) {
        var cadena1 = "juan";
        var consola = new Scanner(System.in);
        System.out.print("Proporciona una cadena: ");
        var cadena3 = consola.nextLine();
        

        //Comparacion usando el metodo equals
        if (cadena1.equalsIgnoreCase(cadena3)){
            System.out.println("Las cadenas son iguales (en contenido)");
        }else{
            System.out.println("Las cadenas son distintas (en contenido)");
        }
        consola.close();
    }
}
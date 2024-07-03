import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class E8_GeneradorID {
    //Funcion para extraer caracteres
    static String subCadena(String cadena){
        String subCadena1 = cadena.toUpperCase().substring(0,2);
        return subCadena1;
    }
    static String anioNacimiento (String anio){
        String subCadena = anio.substring(2);
        return subCadena;
    }

    //Valor aleatorio de 4 digitos
    static String valorAleatorio(){
        var patron = "####";
        var decimalFormat = new DecimalFormat(patron);
        var aleatorio = new Random();
        var numeroFormato = decimalFormat.format(aleatorio.nextInt(0,9999+1));
        return numeroFormato;
    }

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("---- Generador de ID Unico ----");
        System.out.print("¿Cual es tu nombre?: ");
        String nombre = consola.nextLine();
        System.out.print("¿Cual es tu apellido?: ");
        String apellido = consola.nextLine();
        System.out.print("¿Cual es tu año de nacimiento (YYYY)?: ");
        String nacimiento = consola.nextLine();
        String cadena = subCadena(nombre) + subCadena(apellido) + anioNacimiento(nacimiento) + valorAleatorio();
        System.out.println("\nFelicidades. Tu nuevo ID Unico es: " + cadena);
        consola.close();
    }
}

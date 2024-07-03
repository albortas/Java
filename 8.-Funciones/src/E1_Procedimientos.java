import java.util.Scanner;

public class E1_Procedimientos {

    //Definimos la funcion
    static void saludar(String mensaje){
        System.out.println("Mensaje: " + mensaje);
    }
    public static void main(String[] args) {
        //Ejercicio para definir una funcion
        System.out.print("Proporciona el mensaje a mostrar: ");
        var consola = new Scanner(System.in);
        var mensajeArg = consola.nextLine();
        saludar(mensajeArg);
        consola.close();
    }
}

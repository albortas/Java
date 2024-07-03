import java.util.Scanner;

public class E2_Teenario {
    public static void main(String[] args) {
        System.out.print("Proporciona un numero: ");
        Scanner consola = new Scanner(System.in);
        var numero = Integer.parseInt(consola.nextLine());
        var resultado = (numero > 0)? "Positivo" : "Cero o Negativo";
        System.out.println("Resultado: "+ resultado);
        consola.close();
    }
}
